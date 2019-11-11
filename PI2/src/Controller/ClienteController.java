package Controller;

import Dao.ClienteDAO;
import Model.Cliente;

public class ClienteController {

    public static boolean salvarCliente(String nomeCliente, int cpfCliente, boolean sexoCliente, int datanCliente, String enderecoCliente, int numeroECliente, String complementoCliente, String cidadeCliente, boolean ufCliente, int telefoneCliente) {
        Cliente cadastro = new Cliente();

        cadastro.setNomeCliente(nomeCliente);
        cadastro.setCpfCliente(cpfCliente);
        cadastro.setSexoCliente(sexoCliente);
        cadastro.setDatanCliente(datanCliente);
        cadastro.setEnderecoCliente(enderecoCliente);
        cadastro.setNumeroECliente(numeroECliente);
        cadastro.setComplementoCliente(complementoCliente);
        cadastro.setCidadeCliente(cidadeCliente);
        cadastro.setUfCliente(ufCliente);
        cadastro.setTelefoneCliente(telefoneCliente);

        ClienteDAO dao = new ClienteDAO();
        dao.addCadastro(cadastro);
        return true;

    }

    public void salvarCliente(String nomeCliente, int cpfCliente, int datanCliente) {
        
    }

   

}
