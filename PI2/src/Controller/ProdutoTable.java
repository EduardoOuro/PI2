package Controller;

import Dao.ProdutoDAO;
import Model.Produto;
import javax.swing.table.AbstractTableModel;

public class ProdutoTable extends AbstractTableModel {

    private String[] columnNames = {"Código", "Quantidade", "Produto", "Preço de Compra", "Preço de Venda"};

    public int getColumnCount() {
        return 5;
    }

    public int getRowCount() {
        //implementado
        return ProdutoDAO.conta();

    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementado
        Produto cadastroProduto;

        cadastroProduto = ProdutoDAO.linha(row);
        if (col == 0) {
            return cadastroProduto.getCodigoProduto();
        }
        if (col == 1) {
            return cadastroProduto.getQntdProduto();
        }
        if (col == 2) {
            return cadastroProduto.getNomeProduto();
        }
        if (col == 3) {
            return cadastroProduto.getPrecoCompra();
        }
            return cadastroProduto.getPrecoVenda();
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}


