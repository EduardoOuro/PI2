package Controller;

import Dao.ProdutoDAO;
import Model.Produto;
import javax.swing.table.AbstractTableModel;

public class ProdutoTable extends AbstractTableModel {

    private String[] columnNames = {"Código", "Quantidade", "Categoria", "Produto", "Preço de Compra", "Preço de Venda", "Marca"};

    public int getColumnCount() {
        return 7;
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
            return cadastroProduto.getQuantidadeProduto();
        }
        if (col == 2) {
            return cadastroProduto.getCategoriaProduto();
        }
        if (col == 3) {
            return cadastroProduto.getNomeProduto();
        }
        if (col == 4) {
            return cadastroProduto.getPrecoCProduto();
        }
        if (col == 5) {
            return cadastroProduto.getPrecoVProduto();
        }
        return cadastroProduto.getMarcaProduto();
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}


