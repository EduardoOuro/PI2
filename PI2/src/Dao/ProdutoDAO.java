/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.Cliente;
import Model.Produto;
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
public class ProdutoDAO {
    
    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    public static String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    public static boolean salvar(Produto p)
    {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);     
            instrucaoSQL = conexao.createStatement();
            String noP = p.getNomeProduto();
            String comando_prepare = "INSERT INTO produto (nomeProduto,descricaoProduto,qntProduto,valorProduto) " + 
                    "VALUES(?,?,?,?);";
            PreparedStatement comando_pronto = conexao.prepareStatement(comando_prepare);
            comando_pronto.setString(1,p.getNomeProduto()); 
            comando_pronto.setString(2,p.getDescricaoProduto());
            comando_pronto.setInt(3,p.getQntProduto());
            comando_pronto.setDouble(4,p.getValorProduto());
            
            
            
            
            int linhasAfetadas = comando_pronto.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                if(conexao!=null)
                  conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }

    public static boolean atualizar(Produto p)
    {
        boolean retorno = false;
        return retorno;
    }
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();

            String comando_prepare = "delete from cliente where idcliente= '" + pID + "'";

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
    
    public static ArrayList<Produto> consultar()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Produto> listaClientes = new ArrayList<Produto>();
        
        try {
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            PreparedStatement comando_pronto = conexao.prepareStatement("SELECT * FROM produto;");
            rs = comando_pronto.executeQuery();
            while(rs.next())
            {
                Produto p = new Produto();
                p.setId(rs.getInt("idproduto"));
                p.setNomeProduto(rs.getString("nomeProduto"));
                p.setDescricaoProduto(rs.getString("descricaoProduto"));
                p.setQntProduto(rs.getInt("qntProduto"));
                p.setValorProduto(rs.getDouble("valorProduto"));
                
                
                listaClientes.add(p);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaClientes = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null) rs.close();                
                if(instrucaoSQL!=null) instrucaoSQL.close();
                if(conexao!=null) conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }
    
}
