package Controller;

import Dao.ProdutoDAO;
import Model.Produto;

public class ProdutoController {

    public static boolean salvarProduto(int codigoProduto, int quantidadeProduto, String categoriaProduto, String nomeProduto, double precoCProduto, double precoVProduto, String marcaProduto) {
        Produto cadastro = new Produto();
        
        cadastro.setCodigoProduto(codigoProduto);
        cadastro.setQuantidadeProduto(quantidadeProduto);
        cadastro.setCategoriaProduto(categoriaProduto);
        cadastro.setNomeProduto(nomeProduto);
        cadastro.setPrecoCProduto(precoCProduto);
        cadastro.setPrecoVProduto(precoVProduto);
        cadastro.setMarcaProduto(marcaProduto);
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.addCadastro(cadastro);
        return true;
    }
}
