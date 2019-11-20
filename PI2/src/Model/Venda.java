package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Venda {

    int codigoProduto;
    int codigoVenda;
    int quantidadeVenda;
    double valorVenda;
    double valorTotalVenda;
    int codigoClienteVenda;
    int dataVenda;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public int getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(int dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
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

    public String salvarV() {
        try {
            FileWriter fw = new FileWriter("Vendas.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(" Código Produto:" + this.codigoProduto);
            pw.print(" Código Venda:" + this.codigoVenda);
            pw.print(" Quantidade:" + this.quantidadeVenda);
            pw.print(" Valor Venda:" + this.valorVenda);
            pw.println(" Valor Total:" + this.valorTotalVenda);
            pw.print(" Código Cliente:" + this.codigoClienteVenda);
            pw.print(" Nome:" + this.dataVenda);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }

}
