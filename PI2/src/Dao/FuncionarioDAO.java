
package Dao;

import Model.Funcionario;
import java.util.ArrayList;


public class FuncionarioDAO {

    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    public static boolean addCadastro(Funcionario cadastro) {

        listaFuncionario.add(cadastro);
        for (int i = 0; i < listaFuncionario.size(); i++) {
            Funcionario get = listaFuncionario.get(i);
        }
        return true;
    }

    public static int conta() {
        return listaFuncionario.size();

    }

    public static Funcionario linha(int i) {
        return listaFuncionario.get(i);
    }

}
