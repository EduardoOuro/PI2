package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produto {
    int codigoProduto;
    int quantidadeProduto;
    String categoriaProduto;
    String nomeProduto;
    double precoCProduto;
    double precoVProduto;
    String marcaProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoCProduto() {
        return precoCProduto;
    }

    public void setPrecoCProduto(double precoCProduto) {
        this.precoCProduto = precoCProduto;
    }

    public double getPrecoVProduto() {
        return precoVProduto;
    }

    public void setPrecoVProduto(double precoVProduto) {
        this.precoVProduto = precoVProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    
     public String salvarP (){
        try{
            FileWriter fw = new FileWriter("Produtos.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Cod :"+this.codigoProduto);
            pw.print(" Nome:"+this.nomeProduto);
            pw.print(" Marca:"+this.marcaProduto);
            pw.print(" Quantidade:"+this.quantidadeProduto);
            pw.print(" Categoria:"+ this.categoriaProduto);
            pw.print(" preço de compra:"+this.precoCProduto);
            pw.println(" Preço de venda:"+this.precoVProduto);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }
    

}
