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
public class VendaDAO {
    private static ArrayList<NotaVenda> listaNotasVenda = new ArrayList<NotaVenda>();
    
    public static boolean addNota(NotaVenda nota) {
        
        listaNotasVenda.add(nota);
        System.out.println("Agora lista geral");
        for (int i = 0; i < listaNotasVenda.size(); i++) {
            NotaVenda get = listaNotasVenda.get(i);
            System.out.println(get.getNumNota());
            System.out.println(get.getDescricaoNota());
            System.out.println(get.getValNota());
            
        }
        
        return true;
    }
    public static int conta(){
        return listaNotasVenda.size();
        
    } 
    public static NotaVenda linha( int i){
        return listaNotasVenda.get(i);
    }
    

    
    
}
