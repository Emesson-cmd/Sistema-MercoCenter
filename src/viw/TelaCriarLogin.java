/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author emesson
 */
public class TelaCriarLogin extends javax.swing.JInternalFrame {

    Connection con = null;
    Conexao conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaCriarLogin
     */
    public TelaCriarLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuLogin = new javax.swing.JTextField();
        txtUsuSenha = new javax.swing.JPasswordField();
        btnUsuCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUsuNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsuCpf = new javax.swing.JTextField();
        btnPesqNome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        selUsuCargo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();
        btnVerSenha = new javax.swing.JButton();
        btnOcultarSenha = new javax.swing.JButton();
        btnUsuAtualizar = new javax.swing.JButton();

        setTitle("Criar Login");
        setPreferredSize(new java.awt.Dimension(650, 415));

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        btnUsuCadastrar.setText("Cadastrar");
        btnUsuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        txtUsuNome.setEditable(false);
        txtUsuNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF");

        txtUsuCpf.setEditable(false);

        btnPesqNome.setText("Pesquisar");
        btnPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo");

        selUsuCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "adm", "caixa", "gerente", "almoxarife", "recursos humanos" }));
        selUsuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selUsuCargoActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        txtUsuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuIdActionPerformed(evt);
            }
        });

        btnVerSenha.setText("Ver senha");
        btnVerSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSenhaActionPerformed(evt);
            }
        });

        btnOcultarSenha.setText("Ocultar senha");
        btnOcultarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarSenhaActionPerformed(evt);
            }
        });

        btnUsuAtualizar.setText("Atualizar");
        btnUsuAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesqNome)
                            .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(selUsuCargo, 0, 143, Short.MAX_VALUE)
                                        .addComponent(txtUsuCpf))))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtUsuLogin)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUsuAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUsuCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOcultarSenha)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUsuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerSenha)
                            .addComponent(btnOcultarSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesqNome)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(selUsuCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selUsuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selUsuCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selUsuCargoActionPerformed

    private void btnPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqNomeActionPerformed
        // Aqui você pode pesquisar por um usuário que quer criar um login novo para ele.
        String sql = "select * from usuario inner join log on usuario.id = log.id_usuario where usuario.id =?";

        try {
            con = conexao.abricConecxao();
            pst = con.prepareStatement(sql);
            pst.setString(1, txtUsuId.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtUsuNome.setText(rs.getString("usuario.nome"));
                txtUsuCpf.setText(rs.getString("usuario.cpf"));
                selUsuCargo.setSelectedItem(rs.getString("usuario.tipo"));
                
                txtUsuLogin.setText(rs.getString("log.usuario"));
                txtUsuSenha.setText(rs.getString("log.senha"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");

                txtUsuId.setText(null);
                txtUsuNome.setText(null);
                txtUsuCpf.setText(null);
                selUsuCargo.setSelectedItem("Selecione");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPesqNomeActionPerformed

    private void txtUsuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuIdActionPerformed

    private void btnUsuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCadastrarActionPerformed
        // TODO add your handling code here:
        String sql = "insert into log (usuario, senha, id_usuario) value (?, ?, ?)";

        try {
            con = conexao.abricConecxao();
            pst = con.prepareStatement(sql);
            pst.setString(1, txtUsuLogin.getText());
            pst.setString(2, txtUsuSenha.getText());
            pst.setString(3, txtUsuId.getText());

            int confirmacao = pst.executeUpdate();

            if (confirmacao > 0) {
                JOptionPane.showMessageDialog(null, "Login adicionado com sucesso!");
                
                txtUsuId.setText(null);
                txtUsuNome.setText(null);
                txtUsuCpf.setText(null);
                selUsuCargo.setSelectedItem("Selecione");
                txtUsuLogin.setText(null);
                txtUsuSenha.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUsuCadastrarActionPerformed

    private void txtUsuNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuNomeActionPerformed

    private void btnVerSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSenhaActionPerformed
        txtUsuSenha.setEchoChar((char)0);
    }//GEN-LAST:event_btnVerSenhaActionPerformed

    private void btnOcultarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarSenhaActionPerformed
        // TODO add your handling code here:
        txtUsuSenha.setEchoChar('*');
    }//GEN-LAST:event_btnOcultarSenhaActionPerformed

    private void btnUsuAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuAtualizarActionPerformed
        // TODO add your handling code here:
        String sql = "update log set log.usuario = ?, log.senha = ? where log.id_usuario = ?";
        
        try {
            con = conexao.abricConecxao();
            pst = con.prepareStatement(sql);
            pst.setString(1, txtUsuLogin.getText());
            pst.setString(2, txtUsuSenha.getText());
            pst.setString(3, txtUsuId.getText());

            int confirmacao = pst.executeUpdate();

            if (confirmacao > 0) {
                JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso!");
                
                txtUsuId.setText(null);
                txtUsuNome.setText(null);
                txtUsuCpf.setText(null);
                selUsuCargo.setSelectedItem("Selecione");
                txtUsuLogin.setText(null);
                txtUsuSenha.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUsuAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOcultarSenha;
    private javax.swing.JButton btnPesqNome;
    private javax.swing.JButton btnUsuAtualizar;
    private javax.swing.JButton btnUsuCadastrar;
    private javax.swing.JButton btnVerSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> selUsuCargo;
    private javax.swing.JTextField txtUsuCpf;
    private javax.swing.JTextField txtUsuId;
    private javax.swing.JTextField txtUsuLogin;
    private javax.swing.JTextField txtUsuNome;
    private javax.swing.JPasswordField txtUsuSenha;
    // End of variables declaration//GEN-END:variables
}