package Controller;

import Dao.FuncionarioDAO;
import Model.Funcionario;

public class FuncionarioController {
     public static boolean salvarFuncionario(String nomeFuncionario, int cpfFuncionario, boolean sexoFuncionario,
             int datanFuncionario, String enderecoFuncionario, int numeroEFuncionario, String complementoFuncionario,
             String cidadeFuncionario, String ufFuncionario, int telefoneFuncionario) {
        Funcionario cadastro = new Funcionario();

        cadastro.setNomeFuncionario(nomeFuncionario);
        cadastro.setCpfFuncionario(cpfFuncionario);
        cadastro.setSexoFuncionario(sexoFuncionario);
        cadastro.setDatanFuncionario(datanFuncionario);
        cadastro.setEnderecoFuncionario(enderecoFuncionario);
        cadastro.setNumeroEFuncionario(numeroEFuncionario);
        cadastro.setComplementoFuncionario(complementoFuncionario);
        cadastro.setCidadeFuncionario(cidadeFuncionario);
        cadastro.setUfFuncionario(ufFuncionario);
        cadastro.setTelefoneFuncionario(telefoneFuncionario);

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.addCadastro(cadastro);
        return true;

    }
  
}
