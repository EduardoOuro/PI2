package Interface;

import Controller.ClienteController;
import Controller.ClienteTable;
import Model.Cliente;
import javax.swing.JOptionPane;

public class CadastrarCliente extends javax.swing.JFrame {

    private ClienteController controller;
    private ClienteTable tableController;
    private Cliente clienteModel;

    public CadastrarCliente() {
        initComponents();
        controller = new ClienteController();
        tableController = new ClienteTable();
        clienteModel = new Cliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nomeCliente = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        cpfCliente = new javax.swing.JLabel();
        sexoCliente = new javax.swing.JLabel();
        btnFemininoC = new javax.swing.JRadioButton();
        btnMasculinoC = new javax.swing.JRadioButton();
        dataNascCliente = new javax.swing.JLabel();
        btnSalvarC = new javax.swing.JButton();
        enderecoCliente = new javax.swing.JLabel();
        campoEnderecoC = new javax.swing.JTextField();
        telefoneCliente = new javax.swing.JLabel();
        campoCidadeCliente = new javax.swing.JTextField();
        cidadeCliente = new javax.swing.JLabel();
        ufCliente = new javax.swing.JLabel();
        comboUfC = new javax.swing.JComboBox();
        enderecoCliente3 = new javax.swing.JLabel();
        campoEnderecoC1 = new javax.swing.JTextField();
        enderecoCliente4 = new javax.swing.JLabel();
        campoEnderecoC2 = new javax.swing.JTextField();
        btnBuscarC = new javax.swing.JButton();
        campoCpfCliente = new javax.swing.JFormattedTextField();
        campoDataNascC = new javax.swing.JFormattedTextField();
        campoTelefoneC = new javax.swing.JFormattedTextField();
        codigoCli = new javax.swing.JLabel();
        campoCodCli = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel5.setToolTipText("");
        jPanel5.setName(""); // NOI18N

        nomeCliente.setText("Nome:");

        cpfCliente.setText("CPF:");

        sexoCliente.setText("Sexo:");

        btnFemininoC.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(btnFemininoC);
        btnFemininoC.setText("Feminino");
        btnFemininoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemininoCActionPerformed(evt);
            }
        });

        btnMasculinoC.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(btnMasculinoC);
        btnMasculinoC.setText("Masculino");

        dataNascCliente.setText("Data de Nascimento: ");

        btnSalvarC.setText("Salvar");
        btnSalvarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCActionPerformed(evt);
            }
        });

        enderecoCliente.setText("Endereço:");

        telefoneCliente.setText("Telefone:");

        cidadeCliente.setText("Cidade:");

        ufCliente.setText("UF:");

        comboUfC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUfC.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        comboUfC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUfCActionPerformed(evt);
            }
        });

        enderecoCliente3.setText("Número:");

        enderecoCliente4.setText("Complemento:");

        btnBuscarC.setText("ver");
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        try {
            campoCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoDataNascC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        campoDataNascC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascCActionPerformed(evt);
            }
        });

        try {
            campoTelefoneC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefoneC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneCActionPerformed(evt);
            }
        });

        codigoCli.setText("codigo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(cidadeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnSalvarC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoTelefoneC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(codigoCli)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nomeCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(cpfCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sexoCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnFemininoC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMasculinoC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataNascCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoDataNascC, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(ufCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(comboUfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(telefoneCliente))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(enderecoCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoEnderecoC, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(enderecoCliente3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoEnderecoC1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(enderecoCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoEnderecoC2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCli)
                    .addComponent(campoCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDataNascC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascCliente)
                    .addComponent(campoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCliente)
                    .addComponent(sexoCliente)
                    .addComponent(btnFemininoC)
                    .addComponent(btnMasculinoC))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoCliente)
                    .addComponent(campoEnderecoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEnderecoC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoCliente3)
                    .addComponent(enderecoCliente4)
                    .addComponent(campoEnderecoC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefoneC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneCliente)
                    .addComponent(comboUfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufCliente)
                    .addComponent(campoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeCliente))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarC)
                    .addComponent(btnBuscarC))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO PI2 250.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCActionPerformed
        Cliente clientes = new Cliente();
        
        int codCli;
        String nomeCliente;
        String cpfCliente;
        boolean sexoCliente = false;
        String datanCliente ;
        String enderecoCliente;
        int numeroECliente;
        String complementoCliente;
        String cidadeCliente;
        String ufCliente;
        String telefoneCliente;
        
        codCli = Integer.parseInt(campoCodCli.getText());
        nomeCliente = (campoNomeCliente.getText());
        cpfCliente = (campoCpfCliente.getText());
        datanCliente =(campoDataNascC.getText());
        enderecoCliente = (campoEnderecoC.getText());
        numeroECliente = Integer.parseInt(campoEnderecoC1.getText());
        complementoCliente = (campoEnderecoC2.getText());
        cidadeCliente = (campoCidadeCliente.getText());
        ufCliente = (comboUfC.getActionCommand());
        telefoneCliente = (campoTelefoneC.getText());

        controller.salvarCliente(codCli,nomeCliente, cpfCliente, sexoCliente, datanCliente, enderecoCliente, numeroECliente,
                complementoCliente, cidadeCliente, ufCliente, telefoneCliente);
        
        clientes.setNomeCliente(nomeCliente);
        clientes.setCpfCliente(cpfCliente);
        clientes.setSexoCliente(sexoCliente);
        clientes.setDatanCliente(datanCliente);
        clientes.setEnderecoCliente(enderecoCliente);
        clientes.setNumeroECliente(numeroECliente);
        clientes.setComplementoCliente(complementoCliente);
        clientes.setCidadeCliente(cidadeCliente);
        clientes.setUfCliente(ufCliente);
        clientes.setTelefoneCliente(telefoneCliente);
        
        JOptionPane.showMessageDialog(null,clientes.salvarC());
        
        campoCodCli.setText("");
        campoNomeCliente.setText("");
        campoCpfCliente.setText("");
        campoDataNascC.setText("");
        campoEnderecoC.setText("");
        campoEnderecoC2.setText("");
        campoCidadeCliente.setText("");
        campoTelefoneC.setText("");
        
        
        
        refreshTable();

    }//GEN-LAST:event_btnSalvarCActionPerformed

    private void comboUfCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUfCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUfCActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        new TabelaCliente().setVisible(true);
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void btnFemininoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemininoCActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnFemininoCActionPerformed

    private void campoDataNascCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascCActionPerformed

    private void campoTelefoneCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneCActionPerformed
    public void refreshTable() {
        jPanel2.invalidate();
        jPanel2.repaint();
    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JRadioButton btnFemininoC;
    private javax.swing.JRadioButton btnMasculinoC;
    private javax.swing.JButton btnSalvarC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCidadeCliente;
    private javax.swing.JTextField campoCodCli;
    private javax.swing.JFormattedTextField campoCpfCliente;
    private javax.swing.JFormattedTextField campoDataNascC;
    private javax.swing.JTextField campoEnderecoC;
    private javax.swing.JTextField campoEnderecoC1;
    private javax.swing.JTextField campoEnderecoC2;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JFormattedTextField campoTelefoneC;
    private javax.swing.JLabel cidadeCliente;
    private javax.swing.JLabel codigoCli;
    private javax.swing.JComboBox comboUfC;
    private javax.swing.JLabel cpfCliente;
    private javax.swing.JLabel dataNascCliente;
    private javax.swing.JLabel enderecoCliente;
    private javax.swing.JLabel enderecoCliente3;
    private javax.swing.JLabel enderecoCliente4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nomeCliente;
    private javax.swing.JLabel sexoCliente;
    private javax.swing.JLabel telefoneCliente;
    private javax.swing.JLabel ufCliente;
    // End of variables declaration//GEN-END:variables

}
