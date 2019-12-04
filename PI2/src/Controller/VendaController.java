package Controller;

import Dao.ClienteDAO;
import Dao.VendaDAO;
import Model.Venda;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendaController {

<<<<<<< HEAD
        /**
         * Método Estático Salvar Salvo os dados do cliente na memória ou no
         * banco de dados
         *
         * @param pID
         * @param pcodigoProduto
         * @param pproduto
         * @param pquantidade
         * @param pvalor
         * @param pcodigoCliente
         * @param pcliente
         * @param pdataVenda
         * @param pvalorTotal          *
         * @return
         */
//        public static boolean salvar(int pcodigoProduto, String pproduto, int pquantidade, double pvalor, int pcodigoCliente,
//                String pcliente, String pdataVenda, double pvalorTotal) throws SQLException {
//            //Salvo na memória
//            Venda v = new Venda((pcodigoProduto, pproduto,  pquantidade, pvalor,  pcodigoCliente,
//                pcliente,  pdataVenda,  pvalorTotal));
//            return VendaDAO.salvar(v);
//        }
//
//        public static boolean excluir(int pID,int pcodigoProduto, String pproduto, int pquantidade, double pvalor, int pcodigoCliente,
//                String pcliente, String pdataVenda, double pvalorTotal) throws SQLException {
//
//            return ClienteDAO.excluir(pID);
//        }
//
//        public static boolean atualizar(int pId, String pNome, String pCPF, String pSobrenome, String pSexo, String pEndereco,
//                String pNumero, String pComplemento, String pCidade, String pCep, String pUF, String pTelelefone) throws SQLException {
//            Venda p = new Venda(pId, pNome, pCPF, pSobrenome, pSexo, pEndereco,
//                    pNumero, pComplemento, pCidade, pCep, pUF, pTelelefone);
//            return VendaDAO.atualizar(p);
//
//        }

        /**
         * Transformo uma lista de objetos Cliente em uma lista de Strings
         *
         * @return lista de string
         */
        public static ArrayList<String[]> consultar() {
            ArrayList<Venda> vendas = VendaDAO.consultar();
            ArrayList<String[]> listaClientes = new ArrayList<>();

            for (int i = 0; i < vendas.size(); i++) {
                listaClientes.add(new String[]{String.valueOf(vendas.get(i).getCupomfiscal()),
                    String.valueOf(vendas.get(i).getCodigoProduto()), String.valueOf(vendas.get(i).getProduto()),
                    String.valueOf(vendas.get(i).getQuantidade()), String.valueOf(vendas.get(i).getDataVenda()),
                    String.valueOf(vendas.get(i).getCodigoCliente()), String.valueOf(vendas.get(i).getCliente()),
                    String.valueOf(vendas.get(i).getValorTotal())});

            }

            return listaClientes;

        }

    }
=======
    public static boolean salvarVenda(int codigoVenda, int quantidadeVenda, double valorVenda, double valorTotalVenda,
            int codigoClienteVenda, String dataVenda, int codigoProduto) {
        Venda cadastro = new Venda();

        cadastro.setCodigoVenda(codigoVenda);
        cadastro.setQuantidadeVenda(quantidadeVenda);
        cadastro.setValorVenda(valorVenda);
        cadastro.setValorTotalVenda(valorTotalVenda);
        cadastro.setCodigoClienteVenda(codigoClienteVenda);
        cadastro.setDataVenda(dataVenda);
        cadastro.setCodigoProduto(codigoProduto);

        VendaDAO dao = new VendaDAO();
        dao.addCadastro(cadastro);
        return true;
    }

}
>>>>>>> f5825d3fe62750b0422d586ff772a33e7ef004e3
