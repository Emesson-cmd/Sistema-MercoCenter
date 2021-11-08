/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO / EMESSON CAVALCANTE
 */
public class TelaPrincipal extends javax.swing.JFrame {
//    INICIALIZAÇÃO DAS TELAS

    private TelaHome th;
    private TelaRh trh;
    private int cod_usuario;
    private TelaCaixaVenda tcv;
    private Buscar_Notas bcn;
    private TelaCriarLogin tcl;
    private TelaListaFuncionarios tlf;
    private TelaRelatorio trv;
    private TelaEstoque tes;

    /**
     * CRIAÇÃO DE UMNOVO FORMULARIOS TelaPrincipal
     */
    public TelaPrincipal(int cod_usuario) {
        initComponents();

//      COLOCANDO A TELA PRINCIPAL E A TELA HOME EM TAMANHO MAXIMO
        try {
            this.setExtendedState(MAXIMIZED_BOTH);
            this.th = new TelaHome();
            this.th.setVisible(true);
            this.desktop.add(this.th);
            telaCheia(th);
        } catch (Exception e) {
        }
        this.cod_usuario = cod_usuario;

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
        menAbrirTelaHome = new javax.swing.JMenuItem();
        menCaixa = new javax.swing.JMenu();
        menAbrirCaixa = new javax.swing.JMenuItem();
        menAbrirBuscaNota = new javax.swing.JMenuItem();
        menRh = new javax.swing.JMenu();
        menAbrirRH = new javax.swing.JMenuItem();
        menAbrirCriarLog = new javax.swing.JMenuItem();
        menAbrListaFuncionarios = new javax.swing.JMenuItem();
        menEstoque = new javax.swing.JMenu();
        menAbrEstoque = new javax.swing.JMenuItem();
        menRelatorio = new javax.swing.JMenu();
        menAbrirRelatorioVenda = new javax.swing.JMenuItem();
        menOpcoes = new javax.swing.JMenu();
        menAbrirOpcoes = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();
        menSobre = new javax.swing.JMenu();
        menAbrirSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MercoCenter System");
        setMinimumSize(new java.awt.Dimension(650, 531));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        menHome.setText("Home");
        menHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menHomeActionPerformed(evt);
            }
        });

        menAbrirTelaHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menAbrirTelaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/botao-home.png"))); // NOI18N
        menAbrirTelaHome.setText("Abrir tela Home");
        menAbrirTelaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirTelaHomeActionPerformed(evt);
            }
        });
        menHome.add(menAbrirTelaHome);

        jMenuBar1.add(menHome);

        menCaixa.setText("Caixa");
        menCaixa.setEnabled(false);

        menAbrirCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/apenas-a-dinheiro.png"))); // NOI18N
        menAbrirCaixa.setText("Abrir Caixa");
        menAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirCaixaActionPerformed(evt);
            }
        });
        menCaixa.add(menAbrirCaixa);

        menAbrirBuscaNota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menAbrirBuscaNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/busca-de-conhecimento.png"))); // NOI18N
        menAbrirBuscaNota.setText("Abrir Busca de Nota");
        menAbrirBuscaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirBuscaNotaActionPerformed(evt);
            }
        });
        menCaixa.add(menAbrirBuscaNota);

        jMenuBar1.add(menCaixa);

        menRh.setText("RH");
        menRh.setEnabled(false);
        menRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRhActionPerformed(evt);
            }
        });

        menAbrirRH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menAbrirRH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/recursos-humanos.png"))); // NOI18N
        menAbrirRH.setText("Abrir Recursos Humanos");
        menAbrirRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirRHActionPerformed(evt);
            }
        });
        menRh.add(menAbrirRH);

        menAbrirCriarLog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menAbrirCriarLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/adicionar-usuario.png"))); // NOI18N
        menAbrirCriarLog.setText("Criar login");
        menAbrirCriarLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirCriarLogActionPerformed(evt);
            }
        });
        menRh.add(menAbrirCriarLog);

        menAbrListaFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menAbrListaFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/listafuncionario.png"))); // NOI18N
        menAbrListaFuncionarios.setText("Listar Funcionario");
        menAbrListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrListaFuncionariosActionPerformed(evt);
            }
        });
        menRh.add(menAbrListaFuncionarios);

        jMenuBar1.add(menRh);

        menEstoque.setText("Estoque");
        menEstoque.setEnabled(false);

        menAbrEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menAbrEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/estoque.png"))); // NOI18N
        menAbrEstoque.setText("Abrir Estoque");
        menAbrEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrEstoqueActionPerformed(evt);
            }
        });
        menEstoque.add(menAbrEstoque);

        jMenuBar1.add(menEstoque);

        menRelatorio.setText("Relatorio");
        menRelatorio.setEnabled(false);

        menAbrirRelatorioVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menAbrirRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/relatorio-32px.png"))); // NOI18N
        menAbrirRelatorioVenda.setText("Abrir relatorio de venda");
        menAbrirRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirRelatorioVendaActionPerformed(evt);
            }
        });
        menRelatorio.add(menAbrirRelatorioVenda);

        jMenuBar1.add(menRelatorio);

        menOpcoes.setText("Opções");

        menAbrirOpcoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menAbrirOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/opcoes.png"))); // NOI18N
        menAbrirOpcoes.setText("Abrir Opções");
        menOpcoes.add(menAbrirOpcoes);

        jMenuBar1.add(menOpcoes);

        jMenu8.setText("Sair");

        menSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/sair.png"))); // NOI18N
        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu8.add(menSair);

        jMenuBar1.add(jMenu8);

        menSobre.setText("Sobre");

        menAbrirSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menAbrirSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/sobre.png"))); // NOI18N
        menAbrirSobre.setText("Abrir sobre");
        menSobre.add(menAbrirSobre);

        jMenuBar1.add(menSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
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
//METODO PARA ABERTURA DA TELA DE RECURSOS HUMANOS
    private void menAbrirRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirRHActionPerformed

        if (trh == null) {
            fecharOutrasTelas();

            trh = new TelaRh();
            trh.setVisible(true);

            desktop.add(trh);

            telaCheia(trh);
        } else {
            System.out.println("A tela já está aparecendo!");
        }

    }//GEN-LAST:event_menAbrirRHActionPerformed
//METODO PARA ABERTURA DA TELA CAIXA
    private void menAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirCaixaActionPerformed

        if (tcv == null) {
            fecharOutrasTelas();

            tcv = new TelaCaixaVenda(cod_usuario);
            tcv.setVisible(true);
            desktop.add(tcv);
            telaCheia(tcv);
        } else {
            if (tcv.isVisible() == false) {
                tcv = new TelaCaixaVenda(cod_usuario);
                tcv.setVisible(true);
                desktop.add(tcv);
            } else {
                System.out.println("A tela já está aparecendo!");
            }
        }


    }//GEN-LAST:event_menAbrirCaixaActionPerformed
//METODO PARA ABERTURA DA TELA DE BUSCAR NOTA
    private void menAbrirBuscaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirBuscaNotaActionPerformed
        if (bcn == null) {
            fecharOutrasTelas();

            bcn = new Buscar_Notas();
            bcn.setVisible(true);

            desktop.add(bcn);
            telaCheia(bcn);
        } else {
            System.out.println("A tela já está aparecendo!");
        }

    }//GEN-LAST:event_menAbrirBuscaNotaActionPerformed

    private void menHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menHomeActionPerformed

    }//GEN-LAST:event_menHomeActionPerformed


//METODO PARA ABERTURA DA TELA HOME
    private void menAbrirTelaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirTelaHomeActionPerformed
        // TODO add your handling code here:
        if (this.th == null) {
            fecharOutrasTelas();

            th = new TelaHome();
            th.setVisible(true);

            desktop.add(th);
            telaCheia(th);
        } else {
            System.out.println("A tela já está aparecendo!");
        }

    }//GEN-LAST:event_menAbrirTelaHomeActionPerformed
//METODO PARA ABERTURA DA TELA LISTA DE FUNCIONARIOS
    private void menAbrListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrListaFuncionariosActionPerformed
        // TODO add your handling code here:
        if (this.tlf == null) {
            fecharOutrasTelas();

            this.tlf = new TelaListaFuncionarios();
            tlf.setVisible(true);

            desktop.add(tlf);
            telaCheia(tlf);
        } else {
            System.out.println("O tela já está aparecendo!");
        }
    }//GEN-LAST:event_menAbrListaFuncionariosActionPerformed
//METODO PARA ABERTURA DA TELA PARA CRIAR O LOGIN PARA FUNCIONARIOS
    private void menAbrirCriarLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirCriarLogActionPerformed
        // TODO add your handling code here:
        if (tcl == null) {
            fecharOutrasTelas();

            tcl = new TelaCriarLogin();
            tcl.setVisible(true);

            desktop.add(this.tcl);

            telaCheia(tcl);

        } else {
            System.out.println("A tela já está aparecendo.");

        }
    }//GEN-LAST:event_menAbrirCriarLogActionPerformed
//METODO PARA ABERTURA DA TELA DE ESTOQUE
    private void menAbrEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrEstoqueActionPerformed
        // TODO add your handling code here:
        if (this.tes == null) {
            fecharOutrasTelas();

            try {
                this.tes = new TelaEstoque();
            } catch (ParseException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            tes.setVisible(true);

            desktop.add(tes);
            telaCheia(tes);
        } else {
            System.out.println("O tela já está aparecendo!");
        }
    }//GEN-LAST:event_menAbrEstoqueActionPerformed
//METODO PARA ABERTURA DA TELA DE RELATORIO DE VENDAS
    private void menAbrirRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirRelatorioVendaActionPerformed
        // TODO add your handling code here:
        if (this.trv == null) {
            fecharOutrasTelas();

            this.trv = new TelaRelatorio();
            trv.setVisible(true);

            desktop.add(trv);
           telaCheia(trv);
        } else {
            System.out.println("O tela já está aparecendo!");
        }
    }//GEN-LAST:event_menAbrirRelatorioVendaActionPerformed
//METODO PARA FECHAR TODAS AS TELAS ABERTAS 
    private void fecharOutrasTelas() {
        // Fecha tela relatorio
        if (this.trv != null) {
            this.trv.setVisible(false);
            desktop.remove(this.trv);
            this.trv = null;
        }
        // Fecha Página Inicial
        if (this.th != null) {
            this.th.setVisible(false);
            desktop.remove(this.th);
            this.th = null;
        }
        // Fecha Página Inicial
        if (this.th != null) {
            this.th.setVisible(false);
            desktop.remove(this.th);
            this.th = null;
        }
        // Fecha tela Produto
        if (this.tes != null) {
            this.tes.setVisible(false);
            desktop.remove(this.tes);
            this.tes = null;
        }

        // Fecha tela Caixa Vendas
        if (this.tcv != null) {
            this.tcv.setVisible(false);
            desktop.remove(this.tcv);
            this.tcv = null;
        }
        // Fecha Buscar nota
        if (this.bcn != null) {
            this.bcn.setVisible(false);
            desktop.remove(this.bcn);
            this.bcn = null;
        }

        // Fecha tela RH
        if (this.trh != null) {
            this.trh.setVisible(false);
            desktop.remove(this.trh);
            this.trh = null;
        }

        // Fecha tela Criar Login
        if (this.tcl != null) {
            this.tcl.setVisible(false);
            desktop.remove(this.tcl);
            this.tcl = null;
        }

        // Fecha tela Lista de Funcionários
        if (this.tlf != null) {
            this.tlf.setVisible(false);
            desktop.remove(this.tlf);
            this.tlf = null;
        }
    }
    //METODO PARA COLOCAR UM JINTERNALFRAME QUE ESTA SENDO RECEBIDO COMO PARAMETRO EM TAMANHO MAXIMO DA TELA
    private void telaCheia(JInternalFrame tela) {
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        //NO CODIGO ABAIXO ESTA SENDO CRIADA UMA VARIAVEL LOCAL COD_USUARIO QUE RECEBE O VALOR DE OUTRA VARIAVELDE MESMO NOME NO ESCOPO GLOBAL
        //E ESSA VARIAVEL ÉPASSADA COMO PARAMETRO PARA TELA PRINCIPAL
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int cod_usuario = this.cod_usuario;

            public void run() {
                new TelaPrincipal(this.cod_usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menAbrEstoque;
    private javax.swing.JMenuItem menAbrListaFuncionarios;
    private javax.swing.JMenuItem menAbrirBuscaNota;
    private javax.swing.JMenuItem menAbrirCaixa;
    private javax.swing.JMenuItem menAbrirCriarLog;
    private javax.swing.JMenuItem menAbrirOpcoes;
    private javax.swing.JMenuItem menAbrirRH;
    private javax.swing.JMenuItem menAbrirRelatorioVenda;
    private javax.swing.JMenuItem menAbrirSobre;
    private javax.swing.JMenuItem menAbrirTelaHome;
    public javax.swing.JMenu menCaixa;
    public javax.swing.JMenu menEstoque;
    private javax.swing.JMenu menHome;
    private javax.swing.JMenu menOpcoes;
    public javax.swing.JMenu menRelatorio;
    public javax.swing.JMenu menRh;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenu menSobre;
    // End of variables declaration//GEN-END:variables
}
