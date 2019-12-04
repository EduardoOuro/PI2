/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fernando.fernandes
 */
public class Produto {

    private static int qtdProdutoCriados;
    
    private int id;
    private String nomeProduto;
    private String descricaoProduto;
    private int qntProduto;
    private double valorProduto;
    
    public static int getQtdProdutoCriados() {
        return qtdProdutoCriados;
    }

    public static void setQtdProdutoCriados(int qtdClientesCriados) {
        Produto.qtdProdutoCriados = qtdClientesCriados;
    }

    

    
    
     public Produto() {
         //TODO:Ao conectar-se ao banco, remover incremento pelo código
         qtdProdutoCriados++;
         this.id =  qtdProdutoCriados;
    }

    public Produto(String nomeProduto, String descricaoProduto, int qntProduto,double valorProduto) {
        qtdProdutoCriados++;
        this.id = qtdProdutoCriados;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.qntProduto=qntProduto;
        this.valorProduto=valorProduto;
        
    }

    public Produto(int id, String pnomeProduto, String pdescricaoProduto, int pqntProduto,double pvalorProduto) {
        this.id = id;
        this.nomeProduto = pnomeProduto;
        this.descricaoProduto = pdescricaoProduto;
        this.qntProduto=pqntProduto;
        this.valorProduto=pvalorProduto;

    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    

}
