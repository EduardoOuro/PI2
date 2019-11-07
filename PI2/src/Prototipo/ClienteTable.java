/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luis.eoconrado
 */
public class ClienteTable {
    public class NotaFiscalTable extends AbstractTableModel {

    private String[] columnNames = {" Nome "," CPF "," Endereço "," n° "," complemento "," Cidade "," UF "," telefone "};

    public int getColumnCount() {
        return 8;
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
        NotaCliente notaCli;
        
        notaCli = ClienteDAO.linha(row);
        if (col==0)
            return notaCli.getDescricaoNomeCli();
        if (col==1)
            return notaCli.getDescricaoCPF();
        if (col==2)
            return notaCli.getDescricaoEndereco();
        if (col==3)
            return notaCli.getDescricaoNumeroCasa();
        if (col==4)
            return notaCli.getDescricaoComplemento();
        if (col==5)
            if (col==0)
            return notaCli.getDescricaoCidade();
        
            return notaCli.getDescricaoTelefone();
        
       
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
    
}
