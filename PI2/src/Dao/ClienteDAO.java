package Dao;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {

    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public static boolean addCadastro(Cliente cadastro) {

        listaCliente.add(cadastro);

        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente get = listaCliente.get(i);

        }

        return true;
    }

    public static int conta() {
        return listaCliente.size();

    }

    public static Cliente linha(int i) {
        return listaCliente.get(i);
    }

}
