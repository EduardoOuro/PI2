/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.ClienteController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteView extends javax.swing.JFrame {

    
    private String modoTela; //   "Criar/Editar"
    
    
    public ClienteView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        
        //Oculto O ID
        lblIDCliente.setVisible(false);
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasClientes = ClienteController.consultar();
        
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("Sobrenome");
        tmClientes.addColumn("sexo");
        tmClientes.addColumn("Endereço");
        tmClientes.addColumn("nº");
        tmClientes.addColumn("Complemento");
        tmClientes.addColumn("Cidade");
        tmClientes.addColumn("CEP");
        tmClientes.addColumn("UF");
        tmClientes.addColumn("Telefone");
        
        tblClientes.setModel(tmClientes);
        

        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] c:linhasClientes)
        {
            tmClientes.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(200);//coluna nome
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(200);//coluna cpf
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(200);//coluna sobrenome
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(200);//endereço
        tblClientes.getColumnModel().getColumn(5).setPreferredWidth(500);//endereço
        tblClientes.getColumnModel().getColumn(6).setPreferredWidth(050);// coluna nº casa
        tblClientes.getColumnModel().getColumn(7).setPreferredWidth(100);//complemento
        tblClientes.getColumnModel().getColumn(8).setPreferredWidth(200);//cidade
        tblClientes.getColumnModel().getColumn(9).setPreferredWidth(150);//cep
        tblClientes.getColumnModel().getColumn(10).setPreferredWidth(050);// coluna uf
        tblClientes.getColumnModel().getColumn(11).setPreferredWidth(200);//tel
        
        
    }
    
    public void LimparFormulario()
    {
        txtNome.setText("");
        txtCPF.setText("");
        txtcampoSobrenome.setText("");
        txtcampoSexoCli.setText("");
        txtcampoEndereco.setText("");
        txtcampoNumCasaCli.setText("");
        txtcampoComplementoCasaCli.setText("");
        txtcampoCidadeCliente.setText("");
        txtcampoCepCli.setText("");
        txtcampoUfCli.setText("");
        txtcampoTelefone.setText("");
        txtcampoUfCli.setText("");
        
    }
    
    /**
     * 
     * Método auxiliar para desabilitar campos do formulário
     */
    public void DesabilitarFormulario()
    {
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtcampoSobrenome.setEditable(false);
        txtcampoSexoCli.setEditable(false);
        txtcampoEndereco.setEditable(false);
        txtcampoNumCasaCli.setEditable(false);
        txtcampoComplementoCasaCli.setEditable(false);
        txtcampoCidadeCliente.setEditable(false);
        txtcampoCepCli.setEditable(false);
        txtcampoUfCli.setEditable(false);
        txtcampoTelefone.setEditable(false);
        
        
        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    
    /**
     * Método auxiliar para habilitar campos do formulário
     */
    public void HabilitarFormulario()
    {
        
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtcampoSobrenome.setEditable(true);
        txtcampoSexoCli.setEditable(true);
        txtcampoEndereco.setEditable(true);
        txtcampoNumCasaCli.setEditable(true);
        txtcampoComplementoCasaCli.setEditable(true);
        txtcampoCidadeCliente.setEditable(true);
        txtcampoCepCli.setEditable(true);
        txtcampoUfCli.setEditable(true);
        txtcampoTelefone.setEditable(true);
        
        
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
        txtNome = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIDCliente = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblSobrenomeCliente = new javax.swing.JLabel();
        txtcampoSobrenome = new javax.swing.JTextField();
        lblSexoCliente = new javax.swing.JLabel();
        txtcampoSexoCli = new javax.swing.JTextField();
        lblEnderecoCliente = new javax.swing.JLabel();
        txtcampoEndereco = new javax.swing.JTextField();
        txtcampoNumCasaCli = new javax.swing.JTextField();
        lblNumCasaCli = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtcampoComplementoCasaCli = new javax.swing.JTextField();
        lblCidadeCliente = new javax.swing.JLabel();
        txtcampoCidadeCliente = new javax.swing.JTextField();
        lblCepCliente = new javax.swing.JLabel();
        txtcampoCepCli = new javax.swing.JFormattedTextField();
        lblUFCliente = new javax.swing.JLabel();
        txtcampoUfCli = new javax.swing.JTextField();
        lblTelefoneCliente = new javax.swing.JLabel();
        txtcampoTelefone = new javax.swing.JFormattedTextField();
        jComboBoxuf = new javax.swing.JComboBox<>();
        pnlTabela = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Clientes");
        setMinimumSize(new java.awt.Dimension(650, 600));

        pnlCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Digite os dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNomeCliente.setText("Nome:");

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

        lblIDCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblIDCliente.setText("lblID");

        lblValorUnitario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValorUnitario.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        lblSobrenomeCliente.setText("sobrenome");

        lblSexoCliente.setText("Sexo:");

        lblEnderecoCliente.setText("Endereço:");

        txtcampoNumCasaCli.setText("                 ");

        lblNumCasaCli.setText("Nº");

        lblComplemento.setText("complemento");

        txtcampoComplementoCasaCli.setText("                               ");

        lblCidadeCliente.setText("Cidade:");

        lblCepCliente.setText("CEP");

        try {
            txtcampoCepCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblUFCliente.setText("UF:");

        lblTelefoneCliente.setText("Telefone:");

        try {
            txtcampoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCliente)
                                    .addComponent(lblValorUnitario))
                                .addGap(12, 12, 12)
                                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCamposLayout.createSequentialGroup()
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSexoCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcampoSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnlCamposLayout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSobrenomeCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcampoSobrenome))))
                            .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblIDCliente))
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addComponent(lblEnderecoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumCasaCli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcampoNumCasaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcampoComplementoCasaCli)))
                        .addContainerGap())
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addComponent(lblCidadeCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtcampoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCepCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtcampoCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addComponent(txtcampoUfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTelefoneCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(txtcampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addComponent(jComboBoxuf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addComponent(lblIDCliente)
                .addGap(17, 17, 17)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSobrenomeCliente)
                    .addComponent(txtcampoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUnitario)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexoCliente)
                    .addComponent(txtcampoSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(lblNumCasaCli)
                    .addComponent(txtcampoNumCasaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(txtcampoComplementoCasaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUFCliente)
                    .addComponent(lblCidadeCliente)
                    .addComponent(lblCepCliente)
                    .addComponent(txtcampoCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcampoUfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcampoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneCliente)
                    .addComponent(txtcampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jComboBoxuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Sobrenome", "Sexo", "Endereço", "nº", "Complemento", "Cidade", "CEP", "UF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(2).setResizable(false);
            tblClientes.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTabelaLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        if(tblClientes.getRowCount()>0)
        {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblClientes.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDcliente = Integer.parseInt(tblClientes.getModel().getValueAt(numeroLinha, 0).toString());
            
            //Realizo a exclusão do cliente pelo ID
            if(ClienteController.excluir( IDcliente ))
            {
                this.LoadTable();
                JOptionPane.showMessageDialog(this,"Cliente excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o cliente!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        //Verifico se há linhas para poder editar
        if(tblClientes.getRowCount()>0)
        {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if(tblClientes.getSelectedRow()>=0)
            {
                HabilitarFormulario();
                
                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
//                lblIDCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 0).toString());
                txtNome.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 1).toString());
                txtCPF.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 2).toString());
                txtcampoSobrenome.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 3).toString());
                txtcampoSexoCli.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 4).toString());
                txtcampoEndereco.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 5).toString());
                txtcampoNumCasaCli.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 6).toString());
                txtcampoComplementoCasaCli.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 7).toString());
                txtcampoCidadeCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 8).toString());
                txtcampoCepCli.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 9).toString());
                txtcampoUfCli.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 10).toString());
                txtcampoTelefone.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 11).toString());
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um cliente para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há clientes para editar!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        
        if(ValidarFormulario())
        {
            if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(ClienteController.salvar(txtNome.getText(),
                                            txtCPF.getText(),
                                            txtcampoSobrenome.getText(),
                                            txtcampoSexoCli.getText(),
                                            txtcampoEndereco.getText(),
                                            txtcampoNumCasaCli.getText(),
                                            txtcampoComplementoCasaCli.getText(),
                                            txtcampoCidadeCliente.getText(),
                                            txtcampoCepCli.getText(),
                                            txtcampoUfCli.getText(),
                                            txtcampoTelefone.getText()))
                                            
                    
                    
                {
                    
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    
                    JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
                    LimparFormulario();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar cliente!");
                }

            }else
            {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                
                if(ClienteController.atualizar(Integer.parseInt(lblIDCliente.getText()),
                        txtNome.getText(),
                        txtCPF.getText(),
                        txtcampoSobrenome.getText(),
                        txtcampoSexoCli.getText(),
                        txtcampoEndereco.getText(),
                        txtcampoNumCasaCli.getText(),
                        txtcampoComplementoCasaCli.getText(),
                        txtcampoCidadeCliente.getText(),
                        txtcampoCepCli.getText(),
                        txtcampoUfCli.getText(),
                        txtcampoTelefone.getText()))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this,"Cliente atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar cliente!");
                    
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
        
        }
       
            
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed
    
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<Object> jComboBoxuf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCepCliente;
    private javax.swing.JLabel lblCidadeCliente;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNumCasaCli;
    private javax.swing.JLabel lblSexoCliente;
    private javax.swing.JLabel lblSobrenomeCliente;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JLabel lblUFCliente;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtcampoCepCli;
    private javax.swing.JTextField txtcampoCidadeCliente;
    private javax.swing.JTextField txtcampoComplementoCasaCli;
    private javax.swing.JTextField txtcampoEndereco;
    private javax.swing.JTextField txtcampoNumCasaCli;
    private javax.swing.JTextField txtcampoSexoCli;
    private javax.swing.JTextField txtcampoSobrenome;
    private javax.swing.JFormattedTextField txtcampoTelefone;
    private javax.swing.JTextField txtcampoUfCli;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {
        
        if(this.txtNome.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o cliente!");
            return false;
        }
        
        if(this.txtCPF.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um CPF para cliente!");
            return false;
        }
        
        return true;
        
    }
}
