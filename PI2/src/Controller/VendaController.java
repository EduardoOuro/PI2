package Controller;

import Dao.VendaDAO;
import Model.Venda;

public class VendaController {
    public static boolean salvarVenda(int codigoVenda,String categoriaVenda,int quantidadeVenda,String vendedorVenda,
            double valorVenda,double valorTotalVenda,int codigoClienteVenda, String dataVenda) {
        Venda cadastro = new Venda();
        
        cadastro.setCodigoVenda(codigoVenda);
        cadastro.setCategoriaVenda(categoriaVenda);
        cadastro.setQuantidadeVenda(quantidadeVenda);
        cadastro.setVendedorVenda(vendedorVenda);
        cadastro.setValorVenda(valorVenda);
        cadastro.setValorTotalVenda(valorTotalVenda);
        cadastro.setCodigoClienteVenda(codigoClienteVenda);
        cadastro.setDataVenda(dataVenda);
        
        
        
        VendaDAO dao = new VendaDAO();
        dao.addCadastro(cadastro);
        return true;
    }

    public void salvarVenda() {
        salvarVenda();
    }
}
