package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Venda {
    int codigoVenda;
    String categoriaVenda;
    int quantidadeVenda;
    String vendedorVenda;
    double valorVenda;
    double valorTotalVenda;
    int codigoClienteVenda;
    String dataVenda;

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getCategoriaVenda() {
        return categoriaVenda;
    }

    public void setCategoriaVenda(String categoriaVenda) {
        this.categoriaVenda = categoriaVenda;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public String getVendedorVenda() {
        return vendedorVenda;
    }

    public void setVendedorVenda(String vendedorVenda) {
        this.vendedorVenda = vendedorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public int getCodigoClienteVenda() {
        return codigoClienteVenda;
    }

    public void setCodigoClienteVenda(int codigoClienteVenda) {
        this.codigoClienteVenda = codigoClienteVenda;
    }
     public String salvarV (){
        try{
            FileWriter fw = new FileWriter("Vendas.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Cod :"+this.codigoVenda);
            pw.print(" Categoria:"+ this.categoriaVenda);
            pw.print(" Quantidade:"+this.quantidadeVenda);
            pw.print(" Vendedor:"+this.vendedorVenda);
            pw.print(" Valor Venda:"+this.valorVenda);
            pw.println(" preço de compra:"+this.valorTotalVenda);
            pw.print(" preço de compra:"+this.codigoClienteVenda);
            pw.print(" Nome:"+this.dataVenda);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }

}
