package Dao;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoDAO {

    private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public static boolean addCadastro(Produto cadastro) {

        listaProduto.add(cadastro);

        for (int i = 0; i < listaProduto.size(); i++) {
            Produto get = listaProduto.get(i);

        }

        return true;
    }

    public static int conta() {
        return listaProduto.size();

    }

    public static Produto linha(int i) {
        return listaProduto.get(i);
    }

}
