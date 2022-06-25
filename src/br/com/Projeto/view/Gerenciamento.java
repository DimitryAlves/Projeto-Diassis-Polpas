/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.Projeto.view;

import br.com.Projeto.dao.ClienteDao;
import br.com.Projeto.dao.ProdutoDao;
import br.com.Projeto.dao.VendaDao;
import br.com.Projeto.model.Cliente;
import br.com.Projeto.model.Produto;
import br.com.Projeto.model.Venda;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Gerenciamento extends javax.swing.JFrame {

    public Gerenciamento() {
        initComponents();
    }

    public void listarClientes() {
        ClienteDao dao = new ClienteDao();
        List<Cliente> clientes = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) tbClientes.getModel();
        dados.setNumRows(0);

        for (Cliente cliente : clientes) {
            dados.addRow(new Object[]{
                cliente.getNome(),
                cliente.getNascimento(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.getCelular(),
                cliente.getEndereco(),
                cliente.getNumero(),
                cliente.getBairro(),
                cliente.getComplemento(),
                cliente.getCidade(),
                cliente.getEstado()
            });
        }
    }

    public void listarProdutos() {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> produtos = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tbProduto.getModel();
        dados.setNumRows(0);

        for (Produto produto : produtos) {
            dados.addRow(new Object[]{
                produto.getLote(),
                produto.getSabor(),
                produto.getQuantidade(),
                produto.getFabricacao(),
                produto.getValidade(),
                produto.getPreco()
            });
        }
    }

    public void listarVendas() {
        VendaDao dao = new VendaDao();
        List<Venda> vendas = dao.listarVendas();
        DefaultTableModel dados = (DefaultTableModel) tbVenda.getModel();
        dados.setNumRows(0);

        for (Venda venda : vendas) {
            dados.addRow(new Object[]{
                venda.getCliente(),
                venda.getProduto(),
                venda.getQuantidade(),
                venda.getDat(),
                venda.getPagamento(),
                venda.getTipopagamento()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        btPesquisarProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        btPesquisarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVenda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisarVenda = new javax.swing.JTextField();
        btPesquisarVenda = new javax.swing.JButton();
        brProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProduto.setBackground(new java.awt.Color(255, 255, 255));
        tbProduto.setForeground(new java.awt.Color(0, 0, 0));
        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Lote", "Sabor", "Quantidade", "Fabricação", "Validade", "Preço"
            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 864, 340));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sabor:");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 59, -1, -1));

        txtPesquisarProduto.setBackground(new java.awt.Color(204, 204, 204));
        txtPesquisarProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesquisarProduto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 56, 198, -1));

        btPesquisarProduto.setBackground(new java.awt.Color(204, 204, 204));
        btPesquisarProduto.setForeground(new java.awt.Color(0, 0, 0));
        btPesquisarProduto.setText("OK");
        btPesquisarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarProdutoMouseClicked(evt);
            }
        });
        jPanel1.add(btPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 63, 49, -1));

        jTabbedPane1.addTab("Produto", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbClientes.setBackground(new java.awt.Color(255, 255, 255));
        tbClientes.setForeground(new java.awt.Color(0, 0, 0));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Nascimento", "Email", "CPF", "Celular", "Endereço", "N°", "Bairro", "Complemento", "Cidade", "UF"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClientes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 859, 335));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 58, 67, -1));

        txtPesquisarCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtPesquisarCliente.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPesquisarCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 55, 318, -1));

        btPesquisarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btPesquisarCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btPesquisarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btPesquisarCliente.setText("OK");
        btPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarClienteMouseClicked(evt);
            }
        });
        jPanel2.add(btPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, -1));

        jTabbedPane1.addTab("Cliente", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbVenda.setBackground(new java.awt.Color(255, 255, 255));
        tbVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Sabor", "Quantidade", "Data", "Pagamento", "Tipo de Pagamento"
            }
        ));
        tbVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVendaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbVenda);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, 860, 304));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cliente:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 76, -1, -1));

        txtPesquisarVenda.setBackground(new java.awt.Color(204, 204, 204));
        txtPesquisarVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesquisarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarVendaActionPerformed(evt);
            }
        });
        jPanel3.add(txtPesquisarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 73, 285, -1));

        btPesquisarVenda.setBackground(new java.awt.Color(153, 153, 153));
        btPesquisarVenda.setForeground(new java.awt.Color(0, 0, 0));
        btPesquisarVenda.setText("OK");
        btPesquisarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarVendaMouseClicked(evt);
            }
        });
        jPanel3.add(btPesquisarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 48, -1));

        jTabbedPane1.addTab("Venda", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 860, 530));

        brProduto.setBackground(new java.awt.Color(204, 204, 204));
        brProduto.setForeground(new java.awt.Color(0, 0, 0));
        brProduto.setText("Produto");
        brProduto.setToolTipText("Produto");
        brProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(brProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        btCliente.setBackground(new java.awt.Color(204, 204, 204));
        btCliente.setForeground(new java.awt.Color(0, 0, 0));
        btCliente.setText("Cliente");
        btCliente.setToolTipText("Cliente");
        btCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClienteMouseClicked(evt);
            }
        });
        getContentPane().add(btCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 30));

        btVenda.setBackground(new java.awt.Color(204, 204, 204));
        btVenda.setForeground(new java.awt.Color(0, 0, 0));
        btVenda.setText("Venda");
        btVenda.setToolTipText("Venda");
        btVenda.setOpaque(true);
        btVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVendaMouseClicked(evt);
            }
        });
        getContentPane().add(btVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Gerenciamento");
        jButton1.setToolTipText("Gerenciamento");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, 30));

        btUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btUsuario.setText("Usuário");
        btUsuario.setToolTipText("Usuário");
        btUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUsuarioMouseClicked(evt);
            }
        });
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Projeto/imagens/Gerencia (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btUsuarioActionPerformed

    private void txtPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteActionPerformed

    private void txtPesquisarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarVendaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listarClientes();
        listarProdutos();
        listarVendas();

    }//GEN-LAST:event_formWindowActivated

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked

        TelaCliente tela = new TelaCliente();
        tela.setVisible(true);

        tela.txtName.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 0).toString());
        tela.txtNascimento.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 1).toString());
        tela.txtEmail.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 2).toString());
        tela.txtCpf.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 3).toString());
        tela.txtCelular.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 4).toString());
        tela.txtEndereco.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 5).toString());
        tela.txtNumero.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 6).toString());
        tela.txtBairro.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 7).toString());
        tela.txtComplemento.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 8).toString());
        tela.txtCidade.setText(tbClientes.getValueAt(tbClientes.getSelectedRow(), 9).toString());
        tela.cbEstado.setSelectedItem(tbClientes.getValueAt(tbClientes.getSelectedRow(), 10).toString());

    }//GEN-LAST:event_tbClientesMouseClicked

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        TelaProduto pro = new TelaProduto();
        pro.setVisible(true);

        pro.txtLote.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), 0).toString());
        pro.cbSabor.setSelectedItem(tbProduto.getValueAt(tbProduto.getSelectedRow(), 1).toString());
        pro.txtQuantidade.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), 2).toString());
        pro.txtFabricacao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), 3).toString());
        pro.txtValidade.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), 4).toString());
        pro.txtPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void tbVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVendaMouseClicked
        TelaVenda vend = new TelaVenda();
        vend.setVisible(true);

        vend.txtCliente.setText(tbVenda.getValueAt(tbVenda.getSelectedRow(), 0).toString());
        vend.cbSaborr.setSelectedItem(tbVenda.getValueAt(tbVenda.getSelectedRow(), 1).toString());
        vend.txtQuantidade.setText(tbVenda.getValueAt(tbVenda.getSelectedRow(), 2).toString());
        vend.txtData.setText(tbVenda.getValueAt(tbVenda.getSelectedRow(), 3).toString());
        vend.txtPagamento.setText(tbVenda.getValueAt(tbVenda.getSelectedRow(), 4).toString());
        vend.cbTipo.setSelectedItem(tbVenda.getValueAt(tbVenda.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tbVendaMouseClicked

    private void btPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarClienteMouseClicked
        String nome = "%" + txtPesquisarCliente.getText() + "%";

        ClienteDao dao = new ClienteDao();
        List<Cliente> clientes = dao.buscarClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tbClientes.getModel();
        dados.setNumRows(0);

        for (Cliente cliente : clientes) {
            dados.addRow(new Object[]{
                cliente.getNome(),
                cliente.getNascimento(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.getCelular(),
                cliente.getEndereco(),
                cliente.getNumero(),
                cliente.getBairro(),
                cliente.getComplemento(),
                cliente.getCidade(),
                cliente.getEstado()
            });
        }
    }//GEN-LAST:event_btPesquisarClienteMouseClicked

    private void brProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brProdutoMouseClicked
        TelaProduto pro = new TelaProduto();
        pro.setVisible(true);
    }//GEN-LAST:event_brProdutoMouseClicked

    private void btClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseClicked
        TelaCliente cli = new TelaCliente();
        cli.setVisible(true);
    }//GEN-LAST:event_btClienteMouseClicked

    private void btVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVendaMouseClicked
        TelaVenda vend = new TelaVenda();
        vend.setVisible(true);
    }//GEN-LAST:event_btVendaMouseClicked

    private void btUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseClicked
        TelaUsuario user = new TelaUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_btUsuarioMouseClicked

    private void btPesquisarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarProdutoMouseClicked
        String sabor = "%" + txtPesquisarProduto.getText() + "%";

        ProdutoDao dao = new ProdutoDao();
        List<Produto> produtos = dao.buscarProdutoPorSabor(sabor);
        DefaultTableModel dados = (DefaultTableModel) tbProduto.getModel();
        dados.setNumRows(0);

        for (Produto produto : produtos) {
            dados.addRow(new Object[]{
                produto.getLote(),
                produto.getSabor(),
                produto.getQuantidade(),
                produto.getFabricacao(),
                produto.getValidade(),
                produto.getPreco()
            }); 
        }
    }//GEN-LAST:event_btPesquisarProdutoMouseClicked

    private void btPesquisarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarVendaMouseClicked
        String cliente = "%" + txtPesquisarVenda.getText() + "%";

        VendaDao dao = new VendaDao();
        List<Venda> vendas = dao.buscarClientePorCliente(cliente);
        DefaultTableModel dados = (DefaultTableModel) tbVenda.getModel();
        dados.setNumRows(0);

        for (Venda venda : vendas) {
            dados.addRow(new Object[]{
                venda.getCliente(),
                venda.getProduto(),
                venda.getQuantidade(),
                venda.getDat(),
                venda.getPagamento(),
                venda.getTipopagamento()
            });
        }
    }//GEN-LAST:event_btPesquisarVendaMouseClicked

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
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brProduto;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btPesquisarProduto;
    private javax.swing.JButton btPesquisarVenda;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTable tbVenda;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JTextField txtPesquisarVenda;
    // End of variables declaration//GEN-END:variables
}
