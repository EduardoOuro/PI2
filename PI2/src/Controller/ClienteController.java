package Controller;

import Dao.ClienteDAO;
import Model.Cliente;

public class ClienteController {

    public static boolean salvarCliente(int codigoCliente,String nomeCliente, String cpfCliente, boolean sexoCliente,
            String datanCliente, String enderecoCliente, String cidadeCliente, String ufCliente, String telefoneCliente) {
        Cliente cadastro = new Cliente();

        cadastro.setCodigoCliente(codigoCliente);
        cadastro.setNomeCliente(nomeCliente);
        cadastro.setCpfCliente(cpfCliente);
        cadastro.setSexoCliente(sexoCliente);
        cadastro.setDatanCliente(datanCliente);
        cadastro.setEnderecoCliente(enderecoCliente);
        cadastro.setCidadeCliente(cidadeCliente);
        cadastro.setUfCliente(ufCliente);
        cadastro.setTelefoneCliente(telefoneCliente);

        ClienteDAO dao = new ClienteDAO();
        dao.addCadastro(cadastro);
        return true;

    }

}
