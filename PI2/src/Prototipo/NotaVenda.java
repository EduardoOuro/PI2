/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

/**
 *
 * @author luis.eoconrado
 */
public class NotaVenda {
     double valNota;
    String descricaoNota;
    int numNota;
    

   
    
    
    public NotaVenda() {
        System.out.println("inicializando um objeto do tipo NotaFiscal");
    }
    
    
    public String getDescricaoNota() {
        return descricaoNota;
    }

    public void setDescricaoNota(String descricaoNota) {
        System.out.print("O nome do produto recebeu uma descrição:");
        System.out.println(descricaoNota);
        this.descricaoNota = descricaoNota;
    }
    
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto Valornota recebeu um valor:");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto Numeronota recebeu um numero de nota:");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    
    
}
