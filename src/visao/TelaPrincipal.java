/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sulis
 */
public class TelaPrincipal extends javax.swing.JFrame {

    TelaHome th = new TelaHome();
    TelaRh trh;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        th.setVisible(true);
        desktop.add(th);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menHome = new javax.swing.JMenu();
        abrMenHome = new javax.swing.JMenuItem();
        menCaixa = new javax.swing.JMenu();
        abrMenCaixa = new javax.swing.JMenuItem();
        menRh = new javax.swing.JMenu();
        abrRecHum = new javax.swing.JMenuItem();
        menEstoque = new javax.swing.JMenu();
        abrMenEstoque = new javax.swing.JMenuItem();
        menOpcoes = new javax.swing.JMenu();
        abrMenOpcoes = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();
        menSobre = new javax.swing.JMenu();
        abrMenSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MercoCenter System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        menHome.setText("Home");

        abrMenHome.setText("Abrir Home");
        abrMenHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrMenHomeActionPerformed(evt);
            }
        });
        menHome.add(abrMenHome);

        jMenuBar1.add(menHome);

        menCaixa.setText("Caixa");
        menCaixa.setEnabled(false);

        abrMenCaixa.setText("Abrir Caixa");
        menCaixa.add(abrMenCaixa);

        jMenuBar1.add(menCaixa);

        menRh.setText("RH");
        menRh.setEnabled(false);
        menRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRhActionPerformed(evt);
            }
        });

        abrRecHum.setText("Abrir Recursos Humanos");
        abrRecHum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrRecHumActionPerformed(evt);
            }
        });
        menRh.add(abrRecHum);

        jMenuBar1.add(menRh);

        menEstoque.setText("Estoque");
        menEstoque.setEnabled(false);

        abrMenEstoque.setText("Abrir Estoque");
        menEstoque.add(abrMenEstoque);

        jMenuBar1.add(menEstoque);

        menOpcoes.setText("Opções");

        abrMenOpcoes.setText("Abrir Opções");
        menOpcoes.add(abrMenOpcoes);

        jMenuBar1.add(menOpcoes);

        jMenu8.setText("Sair");

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu8.add(menSair);

        jMenuBar1.add(jMenu8);

        menSobre.setText("Sobre");

        abrMenSobre.setText("Abrir sobre");
        menSobre.add(abrMenSobre);

        jMenuBar1.add(menSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As ações a seguir serão executadas quando a TelaPrincipal for iniciada
    }//GEN-LAST:event_formWindowActivated

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
        // exibe uma caixa de diálogo pra confirmar se quer sair sim ou nao
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menSairActionPerformed

    private void menRhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRhActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menRhActionPerformed

    private void abrRecHumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrRecHumActionPerformed
        // As linhas abaixo se referem ao o que vai acontecer quando eu apertar em abrRecHum no RH
        // Será aberto o form de Recursos Humanos dentro do desktop pane

        if (th.isVisible()) {
            th.setVisible(false);
            desktop.remove(th);
        }

        try {
            if (trh.isVisible()) {
                System.out.println("Está visível");
            } else {

                this.trh = new TelaRh();

                trh.setVisible(true);
                desktop.add(trh);
            }
        } catch (Exception e) {

            this.trh = new TelaRh();

            trh.setVisible(true);
            desktop.add(trh);

        }

    }//GEN-LAST:event_abrRecHumActionPerformed

    private void abrMenHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrMenHomeActionPerformed

        try {
            if (trh.isVisible()) {
                trh.setVisible(false);
                desktop.remove(trh);
            }

            if (th.isVisible()) {
                System.out.println("Está visível");
            } else {
                System.out.println("Não está visível");
                th.setVisible(true);
                desktop.add(th);
            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_abrMenHomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrMenCaixa;
    private javax.swing.JMenuItem abrMenEstoque;
    private javax.swing.JMenuItem abrMenHome;
    private javax.swing.JMenuItem abrMenOpcoes;
    private javax.swing.JMenuItem abrMenSobre;
    private javax.swing.JMenuItem abrRecHum;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu menCaixa;
    public javax.swing.JMenu menEstoque;
    private javax.swing.JMenu menHome;
    private javax.swing.JMenu menOpcoes;
    public javax.swing.JMenu menRh;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenu menSobre;
    // End of variables declaration//GEN-END:variables
}
