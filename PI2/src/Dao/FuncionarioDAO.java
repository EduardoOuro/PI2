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
public class FuncionarioDAO {
    private static ArrayList<NotaFuncionario> listaFuncionario = new ArrayList<NotaFuncionario>();
    
    public static boolean addNota(NotaFuncionario nota) {
        
        listaFuncionario.add(nota);
        System.out.println("Agora lista geral");
        for (int i = 0; i < listaFuncionario.size(); i++) {
            NotaFuncionario get = listaFuncionario.get(i);
            System.out.println(get.getNumNota());
            System.out.println(get.getDescricaoNota());
            System.out.println(get.getValNota());
            
        }
        
        return true;
    }
    public static int conta(){
        return listaFuncionario.size();
        
    } 
    public static NotaFuncionario linha( int i){
        return listaFuncionario.get(i);
    }
    

    
    
}
