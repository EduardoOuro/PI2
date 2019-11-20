package Controller;

import Dao.ProdutoDAO;
import Model.Produto;

public class ProdutoController {

    public static boolean salvarProduto(int codigoProduto, int qntdProduto,
            String nomeProduto, double precoCompra, double precoVenda) {
        Produto cadastro = new Produto();
        
        cadastro.setCodigoProduto(codigoProduto);
        cadastro.setQntdProduto(qntdProduto);
        cadastro.setNomeProduto(nomeProduto);
        cadastro.setPrecoCompra(precoCompra);
        cadastro.setPrecoVenda(precoVenda);
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.addCadastro(cadastro);
        return true;
    }
}
