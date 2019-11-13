package Controller;

import Dao.ClienteDAO;
import Model.Cliente;

public class ClienteController {

    public static boolean salvarCliente(int codCli,String nomeCliente, String cpfCliente, boolean sexoCliente,
            String datanCliente, String enderecoCliente, int numeroECliente,
            String complementoCliente, String cidadeCliente, String ufCliente, String telefoneCliente) {
        Cliente cadastro = new Cliente();

        cadastro.setCodCli(codCli);
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

}
