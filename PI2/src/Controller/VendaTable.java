package Controller;

import Dao.VendaDAO;
import Model.Venda;
import javax.swing.table.AbstractTableModel;

public class VendaTable extends AbstractTableModel {

    private String[] columnNames = {"Código", "Quantidade", "Categoria", "Vendedor", "Valor", "Valor Total", "Código Cliente", "Data"};

    public int getColumnCount() {
        return 8;
    }

    public int getRowCount() {
        //implementado
        return VendaDAO.conta();

    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementado
        Venda cadastroVenda;

        cadastroVenda = VendaDAO.linha(row);
        if (col == 0) {
            return cadastroVenda.getCodigoVenda();
        }
        if (col == 1) {
            return cadastroVenda.getQuantidadeVenda();
        }
        if (col == 2) {
            return cadastroVenda.getCategoriaVenda();
        }
        if (col == 3) {
            return cadastroVenda.getVendedorVenda();
        }
        if (col == 4) {
            return cadastroVenda.getValorVenda();
        }
        if (col == 5) {
            return cadastroVenda.getValorTotalVenda();
        }
        if (col == 6) {
            return cadastroVenda.getCodigoClienteVenda();
        }
        return cadastroVenda.getDataVenda();
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
