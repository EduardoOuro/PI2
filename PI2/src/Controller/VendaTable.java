package Controller;

import Dao.VendaDAO;
import Model.Venda;
import javax.swing.table.AbstractTableModel;

public class VendaTable extends AbstractTableModel {

    private String[] columnNames = {"Código Venda", "Quantidade", "Valor", "Valor Total", "Código Cliente", "Data","Produto"};

    public int getColumnCount() {
        return 7;
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
            return cadastroVenda.getCodigoProduto();
        }
        if (col == 3) {
            return cadastroVenda.getValorVenda();
        }
        if (col == 4) {
            return cadastroVenda.getValorTotalVenda();
        }
        if (col == 5) {
            return cadastroVenda.getCodigoClienteVenda();
        }
        return cadastroVenda.getDataVenda();
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
