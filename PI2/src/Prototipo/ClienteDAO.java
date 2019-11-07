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
public class ClienteDAO {
     private static ArrayList<NotaCliente> listaNotas = new ArrayList<NotaCliente>();
    
    public static boolean addNota(NotaCliente nota) {
        
        listaNotas.add(nota);
        System.out.println("Agora lista geral");
        for (int i = 0; i < listaNotas.size(); i++) {
            NotaCliente get = listaNotas.get(i);

            
        }
        
        return true;
    }
    public static int conta(){
        return listaNotas.size();
        
    } 
    public static NotaCliente linha( int i){
        return listaNotas.get(i);
    }
    
}
