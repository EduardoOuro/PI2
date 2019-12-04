/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Dao.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoController {
    
   
    /**Método Estático Salvar
     * Salvo os dados do cliente na memória ou no banco de dados
     * @param pId 
     * @param pProduto
     * @param pDescricao 
     * @param pQntProduto  
     * @param pValorProduto  
     *  
     * @return 
     */
    public static boolean salvar(String pProduto,String pDescricao,int pQntProduto,  double pValorProduto   ){
        //Salvo na memória
        Produto p =  new Produto(pProduto,pDescricao, pQntProduto,   pValorProduto);
        return ProdutoDAO.salvar(p);
    }

    public static boolean excluir(int pID)
    {
        return ProdutoDAO.excluir(pID);
    }
    
    public static boolean atualizar(int pId, String pProduto,String pDescricao,int pQntProduto,  double pValorProduto )
    {
        Produto p =  new Produto(pId,pProduto,pDescricao, pQntProduto,   pValorProduto);
        return ProdutoDAO.atualizar(p);
        
    }
    
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     * @return lista de string
     */
    public static ArrayList<String[]> consultar()
    {
        ArrayList<Produto> produtos = ProdutoDAO.consultar();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for(int i=0;i<produtos.size();i++)
        {
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getId()),
                String.valueOf(produtos.get(i).getNomeProduto()),String.valueOf(produtos.get(i).getDescricaoProduto()),
                String.valueOf(produtos.get(i).getQntProduto()),String.valueOf(produtos.get(i).getValorProduto())});
                
        
        }
        
        return listaProdutos;
        
    }

    
}
