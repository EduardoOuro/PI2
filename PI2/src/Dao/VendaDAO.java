package Dao;

import Model.Venda;
import java.util.ArrayList;

public class VendaDAO {

    private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();

    public static boolean addCadastro(Venda cadastro) {

        listaVendas.add(cadastro);
        for (int i = 0; i < listaVendas.size(); i++) {
            Venda get = listaVendas.get(i);

        }

        return true;
    }

    public static int conta() {
        return listaVendas.size();

    }

    public static Venda linha(int i) {
        return listaVendas.get(i);
    }

}
