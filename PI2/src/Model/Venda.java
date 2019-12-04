package Model;



public class Venda {
    
    private static int qtdVendaCriados;

    public static int getQtdClientesCriados() {
        return qtdVendaCriados;
    }

    public static void setQtdClientesCriados(int qtdClientesCriados) {
        Venda.qtdVendaCriados = qtdClientesCriados;
    }

    int cupomfiscal;
    int codigoProduto;
<<<<<<< HEAD
    String produto;
    int quantidade;
    double valor;
    int codigoCliente;
    String cliente;
    String dataVenda;
    double valorTotal;

    public int getCupomfiscal() {
        return cupomfiscal;
    }
=======
    int codigoVenda;
    int quantidadeVenda;
    double valorVenda;
    double valorTotalVenda;
    int codigoClienteVenda;
    String dataVenda;
>>>>>>> f5825d3fe62750b0422d586ff772a33e7ef004e3

    public void setCupomfiscal(int cupomfiscal) {
        this.cupomfiscal = cupomfiscal;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

<<<<<<< HEAD
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
=======
    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
>>>>>>> f5825d3fe62750b0422d586ff772a33e7ef004e3
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
     

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    
}
