/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.VendaController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.fernandes
 */
public class VendaView extends javax.swing.JFrame {

    private String modoTela; //   "Criar/Editar"

    public VendaView() {
        initComponents();

        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();

        //Oculto O ID
        lblIDVenda.setVisible(false);
    }

    public void LoadTable() {

        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasClientes = VendaController.consultar();

        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Produto");
        tmClientes.addColumn("descrição ");
        tmClientes.addColumn("quantidade em estoque");
        tmClientes.addColumn("valor do produto");

        tblProduto.setModel(tmClientes);

        //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(0));

        //Opção 2 - Descomentar linhas abaixo caso queira reutilizar o modelo padrão
        //Resgato o modelo da tabela
        //DefaultTableModel tmClientes = (DefaultTableModel) this.tblClientes.getModel();
        ////Limpo a tabela, excluindo todas as linhas
        //tmClientes.setRowCount(0);
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        //Defino o tamanho para cada coluna
//        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(050);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(050);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(050);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(500);

    }

    public void LimparFormulario() {
        campoQnt.setText("");
        campoProduto.setText("");

        campoQnt.setText("");
        campoValorProd.setText("");

    }

    /**
     *
     * Método auxiliar para desabilitar campos do formulário
     */
    public void DesabilitarFormulario() {
        campoProduto.setEditable(false);

        campoQnt.setEditable(false);
        campoValorProd.setEditable(false);

        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    /**
     * Método auxiliar para habilitar campos do formulário
     */
    public void HabilitarFormulario() {
        campoProduto.setEditable(true);

        campoQnt.setEditable(true);
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
        campoQnt = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIDVenda = new javax.swing.JLabel();
        lblqnt = new javax.swing.JLabel();
        campoProduto = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        campoValorProd = new javax.swing.JTextField();
        lblidProduto = new javax.swing.JLabel();
        campoIdCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblidCliente = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        campoCliente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        campoIdProduto = new javax.swing.JTextField();
        campoSobrenome = new javax.swing.JTextField();
        campoValortotal = new javax.swing.JTextField();
        lblValor1 = new javax.swing.JLabel();
        lbldataCompra = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        lbltxtdata = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Clientes");
        setMinimumSize(new java.awt.Dimension(650, 600));

        pnlCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Digite os dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        campoQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQntActionPerformed(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblProduto.setText("Produto");

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

        lblIDVenda.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblIDVenda.setText("lblVenda");

        lblqnt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblqnt.setText("QUANTIDADE");

        campoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProdutoActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValor.setText("valor");

        lblidProduto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblidProduto.setText("IDPRODUTO");

        jButton1.setText("BUSCAR PRODUTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblidCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblidCliente.setText("IDCLIENTE");

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCliente.setText("CLIENTE");

        campoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteActionPerformed(evt);
            }
        });

        jButton2.setText("BUSCAR CLIENTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ADICIONAR ++");

        lblValor1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValor1.setText("valorTotal");

        lbldataCompra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbldataCompra.setText("DataCompra");

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbltxtdata.setText("aaaa/mm/dd");

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCamposLayout.createSequentialGroup()
                                        .addComponent(lblidCliente)
                                        .addGap(15, 15, 15)
                                        .addComponent(campoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCamposLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblidProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbldataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltxtdata)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCamposLayout.createSequentialGroup()
                                    .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1))
                                .addGroup(pnlCamposLayout.createSequentialGroup()
                                    .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCamposLayout.createSequentialGroup()
                                            .addGap(172, 172, 172)
                                            .addComponent(campoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                                    .addComponent(lblqnt)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblValor)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIDVenda)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addComponent(lblIDVenda)
                .addGap(16, 16, 16)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidProduto)
                    .addComponent(jButton1)
                    .addComponent(campoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblqnt)
                    .addComponent(campoQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor)
                    .addComponent(campoValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSobrenome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblidCliente)
                        .addComponent(campoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente)
                        .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor1)
                    .addComponent(lbldataCompra)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltxtdata)
                .addGap(76, 76, 76)
                .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnNovo});

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUTO", "PRODUTO", "QUANTIDADE", "ID CLIENTE", "CLIENTE", "VALOR TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        //Verifico se há linhas para poder editar
        if (tblProduto.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if (tblProduto.getSelectedRow() >= 0) {
                HabilitarFormulario();

                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                lblIDVenda.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 0).toString());
                campoIdProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 1).toString());
                campoProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 2).toString());
                campoQnt.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 3).toString());
                campoValorProd.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 4).toString());
                campoIdCliente.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 5).toString());
                campoCliente.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 6).toString());
                campoData.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 7).toString());
                campoValortotal.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 8).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
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

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                try {
                    //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                    if (VendaController.salvar(Integer.parseInt(campoIdProduto.getText()),
                            campoProduto.getText(),
                            Integer.parseInt(campoQnt.getText()),
                            Double.parseDouble(campoValorProd.getText()),
                            Integer.parseInt(campoIdCliente.getText()),
                            campoCliente.getText(),
                            campoData.getText(),
                            Double.parseDouble(campoValortotal.getText()))) {

                        //Recarrego a tabela com os dados resgatados do banco de dados
                        this.LoadTable();

                        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                        LimparFormulario();
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
            }

            LimparFormulario();
            DesabilitarFormulario();

        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void campoQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQntActionPerformed

    private void campoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tblProduto
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoIdCliente;
    private javax.swing.JTextField campoIdProduto;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JTextField campoQnt;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JTextField campoValorProd;
    private javax.swing.JTextField campoValortotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblIDVenda;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lbldataCompra;
    private javax.swing.JLabel lblidCliente;
    private javax.swing.JLabel lblidProduto;
    private javax.swing.JLabel lblqnt;
    private javax.swing.JLabel lbltxtdata;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblProduto;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.campoIdProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o produto!");
            return false;
        }

        if (this.campoProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe uma descrição produto!");
            return false;
        }
        if (this.campoQnt.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe um valor de venda para o produto!");
            return false;
        }
        if (this.campoValorProd.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe um valor de venda para o produto!");
            return false;
        }
        if (this.campoIdCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe um valor de venda para o produto!");
            return false;
        }
        if (this.campoCliente.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe um valor de venda para o produto!");
            return false;
        }
        if (this.campoData.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "informe um valor de venda para o produto!");
            return false;
            
        }
        
        return true;

    }
}