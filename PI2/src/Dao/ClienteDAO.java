/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteDAO {

    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    public static String URL = "jdbc:mysql://localhost:3307/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";

    /**
     * cadastrar um cliente no banco
     *
     * @param p
     * @return boolean
     */
    public static boolean salvar(Cliente p) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();
            String cpf_limpo = p.getCPF().replace(".", "").replace("-", "");
            String comando_prepare = "INSERT INTO cliente (nome,CPF,sobrenome,sexo,endereco,numero,complemento,cidade,cep,uf,telefone) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement comando_pronto = conexao.prepareStatement(comando_prepare);
            comando_pronto.setString(1, p.getNome());
            comando_pronto.setString(2, cpf_limpo);
            comando_pronto.setString(3, p.getSobrenome());
            comando_pronto.setString(4, p.getSexo());
            comando_pronto.setString(5, p.getEndereco());
            comando_pronto.setString(6, p.getNumero());
            comando_pronto.setString(7, p.getComplemento());
            comando_pronto.setString(8, p.getCidade());
            comando_pronto.setString(9, p.getCep());
            comando_pronto.setString(10, p.getUf());
            comando_pronto.setString(11, p.getTelefone());

            int linhasAfetadas = comando_pronto.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    /**
     *
     * @param p
     * @return
     * @throws boolean
     */
    public static boolean atualizar(Cliente p) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            String comando_prepare;

            comando_prepare = "update cliente set nome= ?, "
                    + "?,sobrenome=?,"
                    + "sexo=?,"
                    + "endereco=?,"
                    + "numero=?,"
                    + "complemento=?"
                    + ",cidade=?,"
                    + "cep=?,"
                    + "uf=?,telefone=?"
                    + "where idcliente=?;";

            PreparedStatement comando_pronto = conexao.prepareStatement(comando_prepare);
//            comando_pronto.setInt(0, p.getCodigoCliente());
            comando_pronto.setString(1, p.getNome());
            comando_pronto.setString(2, p.getCPF());
            comando_pronto.setString(3, p.getSobrenome());
            comando_pronto.setString(4, p.getSexo());
            comando_pronto.setString(5, p.getEndereco());
            comando_pronto.setString(6, p.getNumero());
            comando_pronto.setString(7, p.getComplemento());
            comando_pronto.setString(8, p.getCidade());
            comando_pronto.setString(9, p.getCep());
            comando_pronto.setString(10, p.getUf());
            comando_pronto.setString(11, p.getTelefone());
            comando_pronto.executeUpdate();

            int linhasAfetadas = comando_pronto.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
            comando_pronto.close();
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            System.out.println(ex);
            retorno = false;
        } finally {

//            Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    /**
     * excluir o cliente do banco
     *
     * @param pcodigoCliente
     * @return boolean
     */
//    "delete from cliente where idcliente= '"+codCli+"'";
    public static boolean excluir(int pcodigoCliente) {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            String comando_prepare = "delete from cliente where idcliente= '" + pcodigoCliente + "'";

            PreparedStatement comando_pronto = conexao.prepareStatement(comando_prepare);

            int linhasAfetadas = comando_pronto.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;

    }

    public static ArrayList<Cliente> consultar() {
        Connection conexao = null;
        Statement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        try {
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comando_pronto = conexao.prepareStatement("SELECT * FROM cliente;");
            rs = comando_pronto.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigoCliente(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setSexo(rs.getString("sexo"));
                c.setEndereco(rs.getString("endereco"));
                c.setNumero(rs.getString("numero"));
                c.setComplemento(rs.getString("complemento"));
                c.setCidade(rs.getString("cidade"));
                c.setCep(rs.getString("cep"));
                c.setUf(rs.getString("uf"));
                c.setTelefone(rs.getString("telefone"));
                listaClientes.add(c);
            }

        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaClientes = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return listaClientes;
    }

    public Iterable<Cliente> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
