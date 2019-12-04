/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ClienteDAO;
import Model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param pID
     * @param pNome
     * @param pCPF
     * @param pCep
     * @param pCidade
     * @param pComplemento
     * @param pEndereco
     * @param pNumero
     * @param pSexo
     * @param pSobrenome
     * @param pTelelefone
     * @param pUF
     * @return
     */
    public static boolean salvar(String pNome,
                                 String pCPF, 
                                 String pSobrenome, 
                                 String pSexo, 
                                 String pEndereco,
                                 String pNumero, 
                                 String pComplemento, 
                                 String pCidade, 
                                 String pCep, 
                                 String pUF, 
                                 String pTelelefone) {
        //Salvo na memória
        Cliente p = new Cliente(pNome, 
                                pCPF, 
                                pSobrenome, 
                                pSexo, 
                                pEndereco,
                                pNumero, 
                                pComplemento, 
                                pCidade, 
                                pCep, 
                                pUF, 
                                pTelelefone);
        return ClienteDAO.salvar(p);
    }
    public static boolean atualizar(int pId,    
                                    String pNome,   
                                    String pCPF, 
                                    String pSobrenome, 
                                    String pSexo, 
                                    String pEndereco,
                                    String pNumero, 
                                    String pComplemento, 
                                    String pCidade, 
                                    String pCep, 
                                    String pUF, 
                                    String pTelelefone) {
        Cliente p = new Cliente(pId, 
                                pNome, 
                                pCPF, 
                                pSobrenome, 
                                pSexo, 
                                pEndereco,
                                pNumero, 
                                pComplemento, 
                                pCidade, 
                                pCep, 
                                pUF, 
                                pTelelefone);
        return ClienteDAO.atualizar(p);

    }

    public static boolean excluir(int pId){
        Cliente p =new Cliente (pId);

        return ClienteDAO.excluir(pId);
    }

    
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> consultar() {
        ArrayList<Cliente> clientes = ClienteDAO.consultar();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getCodigoCliente()),
                String.valueOf(clientes.get(i).getNome()), String.valueOf(clientes.get(i).getCPF()),
                String.valueOf(clientes.get(i).getSobrenome()), String.valueOf(clientes.get(i).getSexo()),
                String.valueOf(clientes.get(i).getEndereco()), String.valueOf(clientes.get(i).getNumero()),
                String.valueOf(clientes.get(i).getComplemento()), String.valueOf(clientes.get(i).getCidade()),
                String.valueOf(clientes.get(i).getCep()), String.valueOf(clientes.get(i).getUf()),
                String.valueOf(clientes.get(i).getTelefone())});

        }

        return listaClientes;

    }

    
    

}
