package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produto {
    int codigoProduto;
    int qntdProduto;
    String nomeProduto;
    double precoCompra;
    double precoVenda;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQntdProduto() {
        return qntdProduto;
    }

    public void setQntdProduto(int qntdProduto) {
        this.qntdProduto = qntdProduto;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    
     public String salvarP (){
        try{
            FileWriter fw = new FileWriter("Produtos.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Cod :"+this.codigoProduto);
            pw.print(" Nome:"+this.nomeProduto);
            pw.print(" Quantidade:"+this.qntdProduto);
            pw.print(" preço de compra:"+this.precoCompra);
            pw.println(" Preço de venda:"+this.precoVenda);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }
    

}
