package Controller;

import Dao.FuncionarioDAO;
import Model.Funcionario;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTable extends AbstractTableModel {
    private String[] columnNames = {" Nome ", " CPF ", "Sexo", "Data de Nascimento", "Endereço ", " Número ", " Complemento ", " Cidade ", " UF ", " Telefone "};

    public int getColumnCount() {
        return 10;
    }

    public int getRowCount() {
        //implementado
        return FuncionarioDAO.conta();

    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementado
        Funcionario cadastroFuncionario;

        cadastroFuncionario = FuncionarioDAO.linha(row);
        if (col == 0) {
            return cadastroFuncionario.getNomeFuncionario();
        }
        if (col == 1) {
            return cadastroFuncionario.getCpfFuncionario();
        }
        if (col == 2) {
            return cadastroFuncionario.isSexoFuncionario();
        }
        if (col == 3) {
            return cadastroFuncionario.getDatanFuncionario();
        }
        if (col == 4) {
            return cadastroFuncionario.getEnderecoFuncionario();
        }
        if (col == 5) {
            return cadastroFuncionario.getNumeroEFuncionario();
        }
        if (col == 6) {
            return cadastroFuncionario.getComplementoFuncionario();
        }
        if (col == 7) {
            return cadastroFuncionario.getCidadeFuncionario();
        }
        if (col == 8) {
            return cadastroFuncionario.getUfFuncionario();
        }
        return cadastroFuncionario.getTelefoneFuncionario();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}

    


