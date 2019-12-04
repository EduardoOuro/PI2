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
public class Cliente {

    
    private static int qtdClientesCriados;
    
    private int codigoCliente;
    private String nome;
    private String CPF;
    private String sobrenome;
    private String sexo;
    private String endereco;
    private String numero;
    private String complemento;
    private String cidade;
    private String cep;
    private String uf;
    private String telefone;

    public static int getQtdClientesCriados() {
        return qtdClientesCriados;
    }

    public static void setQtdClientesCriados(int qtdClientesCriados) {
        Cliente.qtdClientesCriados = qtdClientesCriados;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

   

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
   
    
     public Cliente() {
         //TODO:Ao conectar-se ao banco, remover incremento pelo código
         qtdClientesCriados++;
         this.codigoCliente =  qtdClientesCriados;
    }

    public Cliente(String nome, String CPF, String sobrenome,String sexo,String endereco, String numero,String complemento,
            String cidade,String cep,String uf,String telefone ) {
        qtdClientesCriados++;
        this.codigoCliente = qtdClientesCriados;
        this.nome = nome;
        this.CPF = CPF;
        this.sobrenome=sobrenome;
        this.sexo=sexo;
        this.endereco=endereco;
        this.numero=numero;
        this.complemento=complemento;
        this.cidade=cidade;
        this.cep=cep;
        this.uf=uf;
        this.telefone=telefone;
    }

    public Cliente(int codigoCliente, String pNome, String pCPF, String psobrenome,String psexo,String pendereco, String pnumero,String pcomplemento,
            String pcidade,String pcep,String puf,String ptelefone) {
        this.codigoCliente = codigoCliente;
        this.nome = pNome;
        this.CPF = pCPF;
        this.sobrenome=psobrenome;
        this.sexo=psexo;
        this.endereco=pendereco;
        this.numero=pnumero;
        this.complemento=pcomplemento;
        this.cidade=pcidade;
        this.cep=pcep;
        this.uf=puf;
        this.telefone=ptelefone;
    }
    public Cliente (int codigoCliente){
    this.codigoCliente=codigoCliente;
    }
     
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

}
