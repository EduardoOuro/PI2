/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

import java.util.ArrayList;

/**
 *
 * @author luis.eoconrado
 */
public class ProdutoDao {
    private static ArrayList<NotaProduto> listaProduto = new ArrayList<NotaProduto>();
    
    public static boolean addNota(NotaProduto nota) {
        
        listaProduto.add(nota);
        System.out.println("Agora lista geral");
        for (int i = 0; i < listaProduto.size(); i++) {
            NotaProduto get = listaProduto.get(i);
            System.out.println(get.getNumNota());
            System.out.println(get.getDescricaoNota());
            System.out.println(get.getValNota());
            
        }
        
        return true;
    }
    public static int conta(){
        return listaProduto.size();
        
    } 
    public static NotaProduto linha( int i){
        return listaProduto.get(i);
    }
    

    
}
