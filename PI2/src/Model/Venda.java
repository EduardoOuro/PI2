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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
