package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    String nomeCliente;
    int cpfCliente;
    boolean sexoCliente;
    int datanCliente;
    String enderecoCliente;
    int numeroECliente;
    String complementoCliente;
    String cidadeCliente;
    String ufCliente;
    int telefoneCliente;

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public boolean isSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(boolean sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public int getDatanCliente() {
        return datanCliente;
    }

    public void setDatanCliente(int datanCliente) {
        this.datanCliente = datanCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public int getNumeroECliente() {
        return numeroECliente;
    }

    public void setNumeroECliente(int numeroECliente) {
        this.numeroECliente = numeroECliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

   

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    public String salvarC (){
        try{
            FileWriter fw = new FileWriter("Clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome:"+this.nomeCliente);
            pw.println("CPF:"+this.cpfCliente);
            pw.println("Sexo:"+this.sexoCliente);
            pw.println("Data de Nascimento:"+this.datanCliente);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }    
}
