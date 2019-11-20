package Controller;

import Dao.VendaDAO;
import Model.Venda;

public class VendaController {

    public static boolean salvarVenda(int codigoVenda, int quantidadeVenda, double valorVenda, double valorTotalVenda,
            int codigoClienteVenda, int dataVenda, int codigoProduto) {
        Venda cadastro = new Venda();

        cadastro.setCodigoVenda(codigoVenda);
        cadastro.setQuantidadeVenda(quantidadeVenda);
        cadastro.setValorVenda(valorVenda);
        cadastro.setValorTotalVenda(valorTotalVenda);
        cadastro.setCodigoClienteVenda(codigoClienteVenda);
        cadastro.setDataVenda(dataVenda);
        cadastro.setCodigoProduto(codigoProduto);

        VendaDAO dao = new VendaDAO();
        dao.addCadastro(cadastro);
        return true;
    }

    public void salvarVenda() {
        salvarVenda();
    }

   

}
