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
 * @author sulis
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
    private ParaApoio paraApoio;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(int cod_usuario) {
        initComponents();

//      COLOCANDO A TELA PRINCIPAL E A TELA HOME EM TAMANHO MAXIMO
        try {
            this.setExtendedState(MAXIMIZED_BOTH);
            this.th = new TelaHome();
            this.th.setVisible(true);
            this.desktop.add(this.th);
            this.th.setMaximum(true);
        } catch (Exception e) {
        }
        this.cod_usuario = cod_usuario;
//        setExtendedState(MAXIMIZED_BOTH);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        menCaixa = new javax.swing.JMenu();
        abrMenCaixa = new javax.swing.JMenuItem();
        abrBusca = new javax.swing.JMenuItem();
        menRh = new javax.swing.JMenu();
        abrRecHum = new javax.swing.JMenuItem();
        abrCriarLogin = new javax.swing.JMenuItem();
        menEstoque = new javax.swing.JMenu();
        abrMenEstoque = new javax.swing.JMenuItem();
        menRelatorio = new javax.swing.JMenu();
        menRelatorioVenda = new javax.swing.JMenuItem();
        menOpcoes = new javax.swing.JMenu();
        abrMenOpcoes = new javax.swing.JMenuItem();
        menSobre = new javax.swing.JMenu();
        abrMenSobre = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        abrTelaApoio = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        abrTrocarUsuario = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();

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

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/botao-home.png"))); // NOI18N
        jMenuItem1.setText("Abrir tela Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menHome.add(jMenuItem1);

        jMenuBar1.add(menHome);

        menCaixa.setText("Caixa");
        menCaixa.setEnabled(false);

        abrMenCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/apenas-a-dinheiro.png"))); // NOI18N
        abrMenCaixa.setText("Abrir Caixa");
        abrMenCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrMenCaixaActionPerformed(evt);
            }
        });
        menCaixa.add(abrMenCaixa);

        abrBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/busca-de-conhecimento.png"))); // NOI18N
        abrBusca.setText("Abrir Busca");
        abrBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrBuscaActionPerformed(evt);
            }
        });
        menCaixa.add(abrBusca);

        jMenuBar1.add(menCaixa);

        menRh.setText("RH");
        menRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRhActionPerformed(evt);
            }
        });

        abrRecHum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/recursos-humanos.png"))); // NOI18N
        abrRecHum.setText("Abrir Recursos Humanos");
        abrRecHum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrRecHumActionPerformed(evt);
            }
        });
        menRh.add(abrRecHum);

        abrCriarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/adicionar-usuario.png"))); // NOI18N
        abrCriarLogin.setText("Criar login");
        abrCriarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrCriarLoginActionPerformed(evt);
            }
        });
        menRh.add(abrCriarLogin);

        jMenuBar1.add(menRh);

        menEstoque.setText("Estoque");
        menEstoque.setEnabled(false);

        abrMenEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/estoque.png"))); // NOI18N
        abrMenEstoque.setText("Abrir Estoque");
        abrMenEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrMenEstoqueActionPerformed(evt);
            }
        });
        menEstoque.add(abrMenEstoque);

        jMenuBar1.add(menEstoque);

        menRelatorio.setText("Relatorio");
        menRelatorio.setEnabled(false);

        menRelatorioVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/relatorio-32px.png"))); // NOI18N
        menRelatorioVenda.setText("Abrir relatorio de venda");
        menRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelatorioVendaActionPerformed(evt);
            }
        });
        menRelatorio.add(menRelatorioVenda);

        jMenuBar1.add(menRelatorio);

        menOpcoes.setText("Opções");

        abrMenOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/opcoes.png"))); // NOI18N
        abrMenOpcoes.setText("Abrir Opções");
        menOpcoes.add(abrMenOpcoes);

        jMenuBar1.add(menOpcoes);

        menSobre.setText("Sobre");

        abrMenSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/sobre.png"))); // NOI18N
        abrMenSobre.setText("Abrir sobre");
        menSobre.add(abrMenSobre);

        jMenuBar1.add(menSobre);

        jMenu3.setText("Tela de apoio");

        abrTelaApoio.setText("Abrir");
        abrTelaApoio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrTelaApoioActionPerformed(evt);
            }
        });
        jMenu3.add(abrTelaApoio);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        jMenuItem2.setText("Abrir ajuda");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Logout");

        abrTrocarUsuario.setText("Trocar de usuário");
        abrTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrTrocarUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(abrTrocarUsuario);

        jMenuBar1.add(jMenu5);

        jMenu8.setText("Sair");

        menSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viw/img/telaPrincipal/sair.png"))); // NOI18N
        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu8.add(menSair);

        jMenuBar1.add(jMenu8);

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
//METODO PARA ABERTURA DA TELA DE RECURSOS HUMANOS QUE ESTA SENDO TRATADA COM TRY CATCH
    private void abrRecHumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrRecHumActionPerformed

        if (trh == null) {
            fecharOutrasTelas();

            trh = new TelaRh();
            trh.setVisible(true);

            desktop.add(trh);

            try {

                trh.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("A tela já está aparecendo!");
        }
        //        try {
//            if (this.th != null) {
//                this.th.setVisible(false);
//                this.desktop.remove(this.th);
//                this.desktop.add(trh);
//                this.trh = new TelaRh();
//                this.trh.setVisible(true);
//                this.trh.setMaximum(true);
//                this.th = null;
//            }
//            if (this.tcv != null) {
//                this.tcv.setVisible(false);
//                this.desktop.remove(this.tcv);
//                this.trh = new TelaRh();
//                this.trh.setVisible(true);
//                this.desktop.add(this.trh);
//                this.tcv = null;
//
//            }
//        } catch (Exception e) {
//            System.out.println("Erro ao abrir tela rh" + e);
//        }

// As linhas abaixo se referem ao o que vai acontecer quando eu apertar em abrRecHum no RH
        // Será aberto o form de Recursos Humanos dentro do desktop pane

    }//GEN-LAST:event_abrRecHumActionPerformed
//NESSE METODO ESTASENDO VERIFICADO SE EXISTE ALGUMA TELA ABERTA E FECHANDOO ELA PARA ABERTURA 
    private void abrMenCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrMenCaixaActionPerformed

        if (tcv == null) {
            fecharOutrasTelas();

            tcv = new TelaCaixaVenda(cod_usuario);
            tcv.setVisible(true);
            desktop.add(tcv);
            try {
                tcv.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (tcv.isVisible() == false) {
                tcv = new TelaCaixaVenda(cod_usuario);
                tcv.setVisible(true);
                desktop.add(tcv);
            } else {
                System.out.println("A tela já está aparecendo!");
            }
        }
//        try {
//            if (this.th != null) {
//                this.th.setVisible(false);
//                desktop.remove(this.th);
//                tcv = new TelaCaixaVenda(this.cod_usuario);
//                this.tcv.setVisible(true);
//                desktop.add(this.tcv);
//                this.tcv.setMaximum(true);
//                this.th = null;
//            }
//            if (this.trh != null) {
//                this.trh.setVisible(false);
//                desktop.remove(this.trh);
//                tcv = new TelaCaixaVenda(this.cod_usuario);
//                this.tcv.setVisible(true);
//                desktop.add(this.tcv);
//                this.tcv.setMaximum(true);
//                this.trh = null;
//            }
//            if (this.bcn != null) {
//                this.bcn.setVisible(false);
//                desktop.remove(this.bcn);
//                tcv = new TelaCaixaVenda(this.cod_usuario);
//                this.tcv.setVisible(true);
//                desktop.add(this.tcv);
//                this.tcv.setMaximum(true);
//                this.bcn = null;
//            }
//            if (this.tcv != null) {
//                if (this.tcv.isVisible() == false) {
//                    desktop.remove(this.tcv);
//                    this.tcv = new TelaCaixaVenda(cod_usuario);
//                    this.tcv.setVisible(true);
//                    this.desktop.add(this.tcv);
//                    this.tcv.setMaximum(true);
//                } else {
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Erro ao abrir tela caixa" + e);
//        }


    }//GEN-LAST:event_abrMenCaixaActionPerformed

    private void abrBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrBuscaActionPerformed
        if (bcn == null) {
            fecharOutrasTelas();

            bcn = new Buscar_Notas();
            bcn.setVisible(true);

            desktop.add(bcn);
            try {
                bcn.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("A tela já está aparecendo!");
        }
//        try {
//            if (this.th != null) {
//                this.th.setVisible(false);
//                desktop.remove(this.th);
//                this.bcn = new Buscar_Notas();
//                this.bcn.setVisible(true);
//                desktop.add(this.bcn);
//                this.bcn.setMaximum(true);
//                this.th = null;
//            }
//            if (this.trh != null) {
//                this.trh.setVisible(false);
//                desktop.remove(this.trh);
//                this.bcn = new Buscar_Notas();
//                this.bcn.setVisible(true);
//                desktop.add(this.bcn);
//                this.bcn.setMaximum(true);
//                this.trh = null;
//
//            }
//            if (this.tcv != null) {
//                this.tcv.setVisible(false);
//                desktop.remove(this.tcv);
//                this.bcn = new Buscar_Notas();
//                this.bcn.setVisible(true);
//                desktop.add(this.bcn);
//                this.bcn.setMaximum(true);
//                this.tcv = null;
//            }
//            if (this.bcn != null) {
//
//            }
//        } catch (Exception e) {
//            System.out.println("Erro ao abrir tela caixa" + e);
//        }
    }//GEN-LAST:event_abrBuscaActionPerformed

    private void menHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menHomeActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_menHomeActionPerformed
    private void navegacao(JInternalFrame telaSolicitada) {
        try {
            if (this.th != null) {
                this.th.setVisible(false);
                desktop.remove(this.th);
                tcv = new TelaCaixaVenda(this.cod_usuario);
                this.tcv.setVisible(true);
                desktop.add(this.tcv);
                this.tcv.setMaximum(true);
                this.th = null;
            }
            if (this.trh != null) {
                this.trh.setVisible(false);
                desktop.remove(this.trh);
                tcv = new TelaCaixaVenda(this.cod_usuario);
                this.tcv.setVisible(true);
                desktop.add(this.tcv);
                this.tcv.setMaximum(true);
                this.trh = null;
            }
            if (this.bcn != null) {
                this.bcn.setVisible(false);
                desktop.remove(this.bcn);
                tcv = new TelaCaixaVenda(this.cod_usuario);
                this.tcv.setVisible(true);
                desktop.add(this.tcv);
                this.tcv.setMaximum(true);
                this.bcn = null;
            }
            if (this.tcv != null) {
                if (this.tcv.isVisible() == false) {
                    desktop.remove(this.tcv);
                    this.tcv = new TelaCaixaVenda(cod_usuario);
                    this.tcv.setVisible(true);
                    this.desktop.add(this.tcv);
                    this.tcv.setMaximum(true);
                } else {
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao abrir tela caixa" + e);
        }

    }

//ESSE METODO ABRE A CLASSE HOME FAZENDO TESTES PARA SABER SE HA MAIS ALGUMA TELA ABERTA
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (this.th == null) {
            fecharOutrasTelas();

            th = new TelaHome();
            th.setVisible(true);

            desktop.add(th);
            try {
                th.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("A tela já está aparecendo!");
        }
//        try {
//            if (this.trh != null) {
//                this.trh.setVisible(false);
//                this.desktop.remove(this.trh);
//                this.th = new TelaHome();
//                this.th.setVisible(true);
//                this.desktop.add(this.th);
//                this.th.setMaximum(true);
//                this.trh = null;
//            }
//            if (this.tcv != null) {
//                this.tcv.setVisible(false);
//                this.desktop.remove(this.tcv);
//                this.th = new TelaHome();
//                this.th.setVisible(true);
//                this.desktop.add(this.th);
//                this.th.setMaximum(true);
//                this.th = null;
//
//            }
//            if (this.bcn != null) {
//                this.bcn.setVisible(false);
//                this.desktop.remove(this.bcn);
//                this.th = new TelaHome();
//                this.th.setVisible(true);
//                this.desktop.add(this.th);
//                this.th.setMaximum(true);
//                this.th = null;
//            }
//            if (this.th != null) {
//
//            }
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void abrCriarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrCriarLoginActionPerformed
        // TODO add your handling code here:
        if (tcl == null) {
            fecharOutrasTelas();

            tcl = new TelaCriarLogin();
            tcl.setVisible(true);

            desktop.add(this.tcl);

            try {
                this.tcl.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("A tela já está aparecendo.");

        }
    }//GEN-LAST:event_abrCriarLoginActionPerformed

    private void abrMenEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrMenEstoqueActionPerformed
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
            try {
                tes.setMaximum(true);
            } catch (PropertyVetoException ex) {System.out.println(ex);
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("O tela já está aparecendo!");
        }
    }//GEN-LAST:event_abrMenEstoqueActionPerformed

    private void menRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelatorioVendaActionPerformed
        // TODO add your handling code here:
        if (this.trv == null) {
            fecharOutrasTelas();

            this.trv = new TelaRelatorio();
            trv.setVisible(true);

            desktop.add(trv);
            try {
                trv.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("O tela já está aparecendo!");
        }
    }//GEN-LAST:event_menRelatorioVendaActionPerformed

    private void abrTelaApoioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrTelaApoioActionPerformed
        // TODO add your handling code here:
        if (this.paraApoio == null) {
            fecharOutrasTelas();

            this.paraApoio = new ParaApoio();
            paraApoio.setVisible(true);

            desktop.add(paraApoio);
//            try {
//                paraApoio.setMaximum(true);
//            } catch (PropertyVetoException ex) {
//                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            }
        } else {
            System.out.println("O tela já está aparecendo!");
        }
        
    }//GEN-LAST:event_abrTelaApoioActionPerformed

    private void abrTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrTrocarUsuarioActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer logout?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_abrTrocarUsuarioActionPerformed
    
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
        
        // Fecha tela ParaApoio
        if (this.paraApoio != null) {
            this.paraApoio.setVisible(false);
            desktop.remove(this.paraApoio);
            this.paraApoio = null;
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int cod_usuario = this.cod_usuario;

            public void run() {
                new TelaPrincipal(this.cod_usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrBusca;
    private javax.swing.JMenuItem abrCriarLogin;
    private javax.swing.JMenuItem abrMenCaixa;
    private javax.swing.JMenuItem abrMenEstoque;
    private javax.swing.JMenuItem abrMenOpcoes;
    private javax.swing.JMenuItem abrMenSobre;
    private javax.swing.JMenuItem abrRecHum;
    private javax.swing.JMenuItem abrTelaApoio;
    private javax.swing.JMenuItem abrTrocarUsuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenu menCaixa;
    public javax.swing.JMenu menEstoque;
    private javax.swing.JMenu menHome;
    private javax.swing.JMenu menOpcoes;
    public javax.swing.JMenu menRelatorio;
    private javax.swing.JMenuItem menRelatorioVenda;
    public javax.swing.JMenu menRh;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenu menSobre;
    // End of variables declaration//GEN-END:variables
}
