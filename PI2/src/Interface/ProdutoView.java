/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoView extends javax.swing.JFrame {

    
    private String modoTela; //   "Criar/Editar"
    
    
    public ProdutoView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        
        //Oculto O ID
        lblIDProduto.setVisible(false);
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasClientes = ProdutoController.consultar();
        
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("Produto");
        tmProdutos.addColumn("descrição ");
        tmProdutos.addColumn("quantidade em estoque");
        tmProdutos.addColumn("valor do produto");
        
        
        tblProduto.setModel(tmProdutos);
        
        
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(0));
        
               
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] c:linhasClientes)
        {
            tmProdutos.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
//        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(050);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(050);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
        
        
    }
    
    public void LimparFormulario()
    {
        campoQntEstoque.setText("");
        campoProduto.setText("");
        campoDescricaoProduto.setText("");        
        campoQntEstoque.setText("");
        campoValorProd.setText("");
        
        
    }
    
    /**
     * 
     * Método auxiliar para desabilitar campos do formulário
     */
    public void DesabilitarFormulario()
    {
        campoProduto.setEditable(false);
        campoDescricaoProduto.setEditable(false);        
        campoQntEstoque.setEditable(false);
        campoValorProd.setEditable(false);
        
        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    
    /**
     * Método auxiliar para habilitar campos do formulário
     */
    public void HabilitarFormulario()
    {
        campoProduto.setEditable(true);
        campoDescricaoProduto.setEditable(true);        
        campoQntEstoque.setEditable(true);
        campoValorProd.setEditable(true);
        
        
        btnSalvarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampos = new javax.swing.JPanel();
        campoQntEstoque = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIDProduto = new javax.swing.JLabel();
        campoDescricaoProduto = new javax.swing.JTextField();
        lblqntEstoque = new javax.swing.JLabel();
        campoProduto = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        campoValorProd = new javax.swing.JTextField();
        pnlTabela = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Clientes");
        setMinimumSize(new java.awt.Dimension(650, 600));

        pnlCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Digite os dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        campoQntEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQntEstoqueActionPerformed(evt);
            }
        });

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNomeCliente.setText("Produto");

        btnSalvarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnSalvarCliente);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnCancelar);

        lblIDProduto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblIDProduto.setText("lblProduto");

        lblqntEstoque.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblqntEstoque.setText("quantidade estoque");

        campoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProdutoActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDescricao.setText("descrição");

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValor.setText("valor");

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIDProduto))
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addComponent(lblNomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addComponent(lblqntEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addComponent(lblIDProduto)
                .addGap(17, 17, 17)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(20, 20, 20)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblqntEstoque)
                    .addComponent(lblValor)
                    .addComponent(campoValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTabela.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Descrição", "quantidade em estoque", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTabelaLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        if(tblProduto.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDcliente = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
            
            //Realizo a exclusão do cliente pelo ID
            if(ProdutoController.excluir( IDcliente ))
            {
                this.LoadTable();
                JOptionPane.showMessageDialog(this,"Produto excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o Produto!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há produto para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        //Verifico se há linhas para poder editar
        if(tblProduto.getRowCount()>0)
        {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if(tblProduto.getSelectedRow()>=0)
            {
                HabilitarFormulario();
                
                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                lblIDProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 0).toString());
                campoQntEstoque.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 1).toString());
                campoDescricaoProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 2).toString());
                campoQntEstoque.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(),3).toString());
                campoValorProd.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(),4).toString());
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um produto para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há produto para editar!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        if(ValidarFormulario())
        {
            if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(ProdutoController.salvar(campoProduto.getText(),
                    campoDescricaoProduto.getText(),
                        Integer.parseInt(campoQntEstoque.getText()),
                    Double.parseDouble(campoValorProd.getText())))
                    

            {

                //Recarrego a tabela com os dados resgatados do banco de dados
                this.LoadTable();

                JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                LimparFormulario();
            }else{
                JOptionPane.showMessageDialog(null,"Falha ao cadastrar produto!");
            }

        }else
        {

            //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados

            if(ProdutoController.atualizar(Integer.parseInt(lblIDProduto.getText()),
                campoProduto.getText(),
                    campoDescricaoProduto.getText(),
                    Integer.parseInt(campoQntEstoque.getText()),
                    Double.parseDouble(campoValorProd.getText())))
        {
            //Recarrego a tabela com os dados resgatados do banco de dados
            this.LoadTable();
            JOptionPane.showMessageDialog(this,"Produto atualizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this,"Falha ao atualizar produto!");
        }

        }

        LimparFormulario();
        DesabilitarFormulario();

        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void campoQntEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQntEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQntEstoqueActionPerformed

    private void campoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProdutoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JTextField campoDescricaoProduto;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JTextField campoQntEstoque;
    private javax.swing.JTextField campoValorProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblIDProduto;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblqntEstoque;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblProduto;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {
        
        if(this.campoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o produto!");
            return false;
        }
        
        if(this.campoDescricaoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"informe uma descrição produto!");
            return false;
        }
        if(this.campoValorProd.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"informe um valor de venda para o produto!");
            return false;
        }
        return true;
        
    }
}