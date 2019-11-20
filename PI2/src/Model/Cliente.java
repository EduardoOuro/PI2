package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    int codigoCliente;
    String nomeCliente;
    String cpfCliente;
    boolean sexoCliente;
    String datanCliente;
    String enderecoCliente;
    String cidadeCliente;
    String ufCliente;
    String telefoneCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.codigoCliente = codigoCliente;
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
            pw.print(" Endereço:"+ this.enderecoCliente);
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
