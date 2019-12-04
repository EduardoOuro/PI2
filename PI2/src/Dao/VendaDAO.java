package Dao;

import Model.Cliente;
import Model.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VendaDAO {

        public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "";                         //sua senha de acesso
    public static String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
    
    public static boolean salvar(Venda v)
    {
        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria o objeto de conexão
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);     
            instrucaoSQL = conexao.createStatement();
//            String noP = p.getNomeProduto();
            String comando_prepare = "insert into venda (id_produto,id_cliente,data ) values(?,?,?);";
            PreparedStatement comando_pronto = conexao.prepareStatement(comando_prepare);
            comando_pronto.setInt(1,v.getCodigoProduto()); 
            comando_pronto.setInt(2,v.getCodigoProduto()); 
            comando_pronto.setString(3,v.getDataVenda()); 
            
            
            
            
            
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

    public static boolean atualizar(Cliente p)
    {
        boolean retorno = false;
        return retorno;
    }
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        return retorno;
    }
    
    public static ArrayList<Venda> consultar()
    {
        Connection conexao = null;
        Statement instrucaoSQL = null; 
        ResultSet rs = null;
        
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
        try {
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);  
            PreparedStatement comando_pronto = conexao.prepareStatement("SELECT * FROM venda;");
            rs = comando_pronto.executeQuery();
            while(rs.next())
            {
                Venda v = new Venda();
                v.setCupomfiscal(rs.getInt("cupom_fiscal"));
                v.setCodigoProduto(rs.getInt("id_produto"));
                v.setCodigoCliente(rs.getInt("id_cliente"));
                v.setDataVenda(rs.getString("data"));
                
                
                listaVenda.add(v);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            listaVenda = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null) rs.close();                
                if(instrucaoSQL!=null) instrucaoSQL.close();
                if(conexao!=null) conexao.close();
              } catch (SQLException ex) {
             }
        }
        
        return listaVenda;
    }

}
