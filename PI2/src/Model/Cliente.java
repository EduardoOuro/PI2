package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    int CodCli;
    String nomeCliente;
    String cpfCliente;
    boolean sexoCliente;
    String datanCliente;
    String enderecoCliente;
    int numeroECliente;
    String complementoCliente;
    String cidadeCliente;
    String ufCliente;
    String telefoneCliente;

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }
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

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    public boolean isSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(boolean sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getDatanCliente() {
        return datanCliente;
    }

    public void setDatanCliente(String datanCliente) {
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

   

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    public String salvarC (){
        try{
            FileWriter fw = new FileWriter("Clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Nome:"+this.nomeCliente);
            pw.print(" Sexo:"+this.sexoCliente);
            pw.print(" CPF:"+this.cpfCliente);
            pw.print(" Data de Nascimento:"+this.datanCliente);
            pw.print(" endereço:"+ this.enderecoCliente);
            pw.print(" numero :"+this.numeroECliente);
            pw.print(" Complemento:"+this.complementoCliente);
            pw.print(" Cidade:"+this.cidadeCliente);
            pw.println(" UF:"+this.ufCliente);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }    
}
