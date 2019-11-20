package Controller;

import Dao.ClienteDAO;
import Model.Cliente;
import javax.swing.table.AbstractTableModel;

public class ClienteTable extends AbstractTableModel {

    private String[] columnNames = {" Codigo ", " Nome ", " CPF ", "Sexo", "Data de Nascimento", "Endereço", " Cidade ", " UF ", " Telefone "};

    public int getColumnCount() {
        return 9;
    }

    public int getRowCount() {
        //implementado
        return ClienteDAO.conta();

    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementado
        Cliente cadastroCliente;

        cadastroCliente = ClienteDAO.linha(row);
        if (col== 0){
            return cadastroCliente.getCodigoCliente();
        }
        if (col == 1) {
            return cadastroCliente.getNomeCliente();
        }
        if (col == 2) {
            return cadastroCliente.getCpfCliente();
        }
        if (col == 3) {
            return cadastroCliente.isSexoCliente();
        }
        if (col == 4) {
            return cadastroCliente.getDatanCliente();
        }
        if (col == 5) {
            return cadastroCliente.getEnderecoCliente();
        }
        if (col == 6) {
            return cadastroCliente.getCidadeCliente();
        }
        if (col == 7) {
            return cadastroCliente.getUfCliente();
        }
        return cadastroCliente.getTelefoneCliente();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}


