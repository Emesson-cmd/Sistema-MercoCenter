/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.UserControler;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author sulis
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
     private UserControler us = new UserControler();
    public Login() {
        initComponents();
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        log = new javax.swing.JPanel();
        SubPainelLog = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        enUserLog = new javax.swing.JTextField();
        enSenhaLog = new javax.swing.JPasswordField();
        lblRedefinir = new javax.swing.JLabel();
        btLogin = new javax.swing.JToggleButton();
        lblLogoUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Redefinir = new javax.swing.JPanel();
        SubPainelRedefinir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        enRedefinirUser = new javax.swing.JTextField();
        enRedefinirSenha = new javax.swing.JPasswordField();
        btRedefinir = new javax.swing.JToggleButton();
        lblLogoRedefinir = new javax.swing.JLabel();
        enConfirmaSenha = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        AdmLog = new javax.swing.JPanel();
        SubPainelAdmLog = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        enAdmUser = new javax.swing.JTextField();
        enAdmSenha = new javax.swing.JPasswordField();
        btAutenticar = new javax.swing.JToggleButton();
        lblLogoAdm = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        root.setBackground(new java.awt.Color(255, 255, 255));
        root.setLayout(new java.awt.CardLayout());

        log.setBackground(new java.awt.Color(255, 255, 255));
        log.setForeground(new java.awt.Color(51, 153, 255));

        SubPainelLog.setBackground(new java.awt.Color(51, 153, 255));
        SubPainelLog.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MercoCenter");

        javax.swing.GroupLayout SubPainelLogLayout = new javax.swing.GroupLayout(SubPainelLog);
        SubPainelLog.setLayout(SubPainelLogLayout);
        SubPainelLogLayout.setHorizontalGroup(
            SubPainelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelLogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        SubPainelLogLayout.setVerticalGroup(
            SubPainelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelLogLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(226, 226, 226))
        );

        enUserLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enUserLog.setForeground(new java.awt.Color(51, 153, 255));
        enUserLog.setText("Username");
        enUserLog.setBorder(null);
        enUserLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enUserLogActionPerformed(evt);
            }
        });

        enSenhaLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enSenhaLog.setForeground(new java.awt.Color(51, 102, 255));
        enSenhaLog.setText("password");
        enSenhaLog.setBorder(null);
        enSenhaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enSenhaLogActionPerformed(evt);
            }
        });

        lblRedefinir.setForeground(new java.awt.Color(0, 153, 255));
        lblRedefinir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRedefinir.setText("ESqueceu a senha?");
        lblRedefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedefinirMouseClicked(evt);
            }
        });

        btLogin.setBackground(new java.awt.Color(51, 153, 255));
        btLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogin.setForeground(new java.awt.Color(255, 255, 255));
        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        lblLogoUser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoUser.setForeground(new java.awt.Color(51, 153, 255));
        lblLogoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoUser.setText("Login");

        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout logLayout = new javax.swing.GroupLayout(log);
        log.setLayout(logLayout);
        logLayout.setHorizontalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logLayout.createSequentialGroup()
                .addComponent(SubPainelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoUser, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(enUserLog, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enSenhaLog))
                .addGap(47, 47, 47))
        );
        logLayout.setVerticalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelLog, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addGroup(logLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblLogoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enUserLog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addGap(34, 34, 34)
                .addComponent(enSenhaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        root.add(log, "card2");

        Redefinir.setBackground(new java.awt.Color(255, 255, 255));

        SubPainelRedefinir.setBackground(new java.awt.Color(51, 153, 255));
        SubPainelRedefinir.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MercoCenter");

        javax.swing.GroupLayout SubPainelRedefinirLayout = new javax.swing.GroupLayout(SubPainelRedefinir);
        SubPainelRedefinir.setLayout(SubPainelRedefinirLayout);
        SubPainelRedefinirLayout.setHorizontalGroup(
            SubPainelRedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelRedefinirLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        SubPainelRedefinirLayout.setVerticalGroup(
            SubPainelRedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelRedefinirLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(226, 226, 226))
        );

        enRedefinirUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enRedefinirUser.setForeground(new java.awt.Color(51, 153, 255));
        enRedefinirUser.setText("Username");
        enRedefinirUser.setBorder(null);
        enRedefinirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enRedefinirUserActionPerformed(evt);
            }
        });

        enRedefinirSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enRedefinirSenha.setForeground(new java.awt.Color(51, 153, 255));
        enRedefinirSenha.setText("password");
        enRedefinirSenha.setBorder(null);
        enRedefinirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enRedefinirSenhaActionPerformed(evt);
            }
        });

        btRedefinir.setBackground(new java.awt.Color(51, 153, 255));
        btRedefinir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRedefinir.setForeground(new java.awt.Color(255, 255, 255));
        btRedefinir.setText("Redefinir");
        btRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRedefinirActionPerformed(evt);
            }
        });

        lblLogoRedefinir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoRedefinir.setForeground(new java.awt.Color(51, 153, 255));
        lblLogoRedefinir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRedefinir.setText("Redefinir");

        enConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enConfirmaSenha.setForeground(new java.awt.Color(51, 153, 255));
        enConfirmaSenha.setText("passwrd");
        enConfirmaSenha.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));

        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout RedefinirLayout = new javax.swing.GroupLayout(Redefinir);
        Redefinir.setLayout(RedefinirLayout);
        RedefinirLayout.setHorizontalGroup(
            RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedefinirLayout.createSequentialGroup()
                .addComponent(SubPainelRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enRedefinirSenha)
                    .addComponent(btRedefinir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(enConfirmaSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enRedefinirUser)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47))
        );
        RedefinirLayout.setVerticalGroup(
            RedefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addGroup(RedefinirLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblLogoRedefinir, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enRedefinirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3)
                .addGap(18, 18, 18)
                .addComponent(enRedefinirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(enConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5)
                .addGap(25, 25, 25)
                .addComponent(btRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        root.add(Redefinir, "Redefinir");

        AdmLog.setBackground(new java.awt.Color(255, 255, 255));

        SubPainelAdmLog.setBackground(new java.awt.Color(51, 153, 255));
        SubPainelAdmLog.setPreferredSize(new java.awt.Dimension(377, 465));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MercoCenter");

        javax.swing.GroupLayout SubPainelAdmLogLayout = new javax.swing.GroupLayout(SubPainelAdmLog);
        SubPainelAdmLog.setLayout(SubPainelAdmLogLayout);
        SubPainelAdmLogLayout.setHorizontalGroup(
            SubPainelAdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelAdmLogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        SubPainelAdmLogLayout.setVerticalGroup(
            SubPainelAdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPainelAdmLogLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(226, 226, 226))
        );

        enAdmUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enAdmUser.setForeground(new java.awt.Color(51, 153, 255));
        enAdmUser.setText("Username");
        enAdmUser.setBorder(null);
        enAdmUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enAdmUserActionPerformed(evt);
            }
        });

        enAdmSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enAdmSenha.setForeground(new java.awt.Color(51, 153, 255));
        enAdmSenha.setText("password");
        enAdmSenha.setBorder(null);
        enAdmSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enAdmSenhaActionPerformed(evt);
            }
        });

        btAutenticar.setBackground(new java.awt.Color(51, 153, 255));
        btAutenticar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAutenticar.setForeground(new java.awt.Color(255, 255, 255));
        btAutenticar.setText("Altenticar");
        btAutenticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutenticarActionPerformed(evt);
            }
        });

        lblLogoAdm.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogoAdm.setForeground(new java.awt.Color(51, 153, 255));
        lblLogoAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoAdm.setText("Altenticação ADM ");

        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));

        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout AdmLogLayout = new javax.swing.GroupLayout(AdmLog);
        AdmLog.setLayout(AdmLogLayout);
        AdmLogLayout.setHorizontalGroup(
            AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdmLogLayout.createSequentialGroup()
                .addComponent(SubPainelAdmLog, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAutenticar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enAdmUser)
                    .addComponent(lblLogoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(enAdmSenha)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47))
        );
        AdmLogLayout.setVerticalGroup(
            AdmLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPainelAdmLog, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addGroup(AdmLogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblLogoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enAdmUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enAdmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btAutenticar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        root.add(AdmLog, "AdmLog");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enUserLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enUserLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enUserLogActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        System.out.println(this.us.logar(enUserLog.getText(),enSenhaLog.getText()));
        if (this.us.logar(enUserLog.getText(),enSenhaLog.getText()).equals("deu certo")) {
               new TelaPrincipal().setVisible(true);
               this.dispose();
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente!");
            }
    }//GEN-LAST:event_btLoginActionPerformed

    private void enRedefinirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enRedefinirUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enRedefinirUserActionPerformed

    private void btRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRedefinirActionPerformed
        // TODO add your handling code here:
                
                
    }//GEN-LAST:event_btRedefinirActionPerformed

    private void enAdmUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enAdmUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enAdmUserActionPerformed

    private void btAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutenticarActionPerformed
        // TODO add your handling code here:
        System.out.println(this.us.logar(enAdmUser.getText(),enAdmSenha.getText()));
        if (this.us.logar(enAdmUser.getText(),enAdmSenha.getText()).equals("deu certo")) {
                CardLayout card = (CardLayout) root.getLayout();
                card.show(root, "Redefinir");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente!");
            }
    }//GEN-LAST:event_btAutenticarActionPerformed

    private void lblRedefinirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedefinirMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) root.getLayout();
        card.show(root, "AdmLog");
    }//GEN-LAST:event_lblRedefinirMouseClicked

    private void enSenhaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enSenhaLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enSenhaLogActionPerformed

    private void enRedefinirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enRedefinirSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enRedefinirSenhaActionPerformed

    private void enAdmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enAdmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enAdmSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdmLog;
    private javax.swing.JPanel Redefinir;
    private javax.swing.JPanel SubPainelAdmLog;
    private javax.swing.JPanel SubPainelLog;
    private javax.swing.JPanel SubPainelRedefinir;
    private javax.swing.JToggleButton btAutenticar;
    private javax.swing.JToggleButton btLogin;
    private javax.swing.JToggleButton btRedefinir;
    private javax.swing.JPasswordField enAdmSenha;
    private javax.swing.JTextField enAdmUser;
    private javax.swing.JPasswordField enConfirmaSenha;
    private javax.swing.JPasswordField enRedefinirSenha;
    private javax.swing.JTextField enRedefinirUser;
    private javax.swing.JPasswordField enSenhaLog;
    private javax.swing.JTextField enUserLog;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblLogoAdm;
    private javax.swing.JLabel lblLogoRedefinir;
    private javax.swing.JLabel lblLogoUser;
    private javax.swing.JLabel lblRedefinir;
    private javax.swing.JPanel log;
    private javax.swing.JPanel root;
    // End of variables declaration//GEN-END:variables

}
