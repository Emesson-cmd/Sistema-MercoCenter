/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author emesson
 */
public class TelaHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaHome
     */
    public TelaHome() {
        initComponents();
        
        /**
        Border border = null;
        border.getBorderInsets(lblInformacao);
        lblInformacao.setBorder(border);
         */
       
        lblInformacao.setText("Clique no botão ao lado para mais informações sobre cada módulo.");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        lblModulos = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        lblInformacao = new javax.swing.JLabel();
        btnAdministrativo = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnRecursosHumanos = new javax.swing.JButton();
        lblBemVindo = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblEquipe = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();

        setTitle("Página Inicial");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(650, 531));
        setPreferredSize(new java.awt.Dimension(650, 531));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));

        lblModulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModulos.setText("MÓDULOS");

        panel4.setBackground(new java.awt.Color(204, 255, 255));

        lblInformacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInformacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacao.setText("Quando você clicar no módulo ao lado ");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInformacao.getAccessibleContext().setAccessibleDescription("");

        btnAdministrativo.setBackground(new java.awt.Color(0, 8, 90));
        btnAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdministrativo.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrativo.setText("Administrativo");
        btnAdministrativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrativoMouseClicked(evt);
            }
        });
        btnAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrativoActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(0, 8, 90));
        btnEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setText("Estoque");
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseClicked(evt);
            }
        });
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnFinanceiro.setBackground(new java.awt.Color(0, 8, 90));
        btnFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btnFinanceiro.setText("Vendas");
        btnFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinanceiroMouseClicked(evt);
            }
        });
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnRecursosHumanos.setBackground(new java.awt.Color(0, 8, 90));
        btnRecursosHumanos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRecursosHumanos.setForeground(new java.awt.Color(255, 255, 255));
        btnRecursosHumanos.setText("Recursos Humanos");
        btnRecursosHumanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecursosHumanosMouseClicked(evt);
            }
        });
        btnRecursosHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosHumanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministrativo, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecursosHumanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministrativo)
                .addGap(18, 18, 18)
                .addComponent(btnEstoque)
                .addGap(18, 18, 18)
                .addComponent(btnFinanceiro)
                .addGap(18, 18, 18)
                .addComponent(btnRecursosHumanos)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("SEJA BEM-VINDO(A)");

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));

        lblSistema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSistema.setText("Bem-vindo ao Sistema MercoCenter. Sistema de supermercado. ");

        lblEquipe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEquipe.setText("Desenvolvido pela equipe TechBooster ");

        lblVersao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVersao.setText("Versão 1.0");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVersao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addComponent(lblEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVersao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(lblBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4)))
                        .addGap(17, 17, 17))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBemVindo)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrativoActionPerformed
        lblInformacao.setText("Módulo Administrativo"
                + "\n"
                + "\n"
                + "Nessa seção você tem a possibilidade de gerenciar os relatórios de venda. "
                + "Escolha o ano, o mês e gere seu relatório. Você verá o nome do produto, "
                + "a quantidade vendida e o gaturalmente geral. É possível ver também o faturamento total, "
                + "entre outras informações.");
    }//GEN-LAST:event_btnAdministrativoActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
       lblInformacao.setText("Módulo de estoque"
                + "\n"
                + "\n"
                + "Nessa seção você poderá gerenciar os produtos disponíveis no estoque. "
               + "Poderár ver todas as informações específicas de cada produtos assim como adicionar, "
               + "remover e atualizar cada item do estoque. "
               + "Também nessa seção é possível verificar quais produtos estão com baixa no estoque.");
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        lblInformacao.setText("Módulo de vendas"
                + "\n"
                + "\n"
                + "Nessa seção será possível realizar os registros de vendas do caixa, "
                + "gerar uma nota fiscal e fazer buscas por notas fiscais específicas no sistema.");
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnRecursosHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosHumanosActionPerformed
        lblInformacao.setText("Módulo de recursos humanos"
                + "\n"
                + "\n"
                + "Nessa seção é possível gerenciar os funcionários do supermercado "
                + "assim como criar logins para acesso ao sistema.");
    }//GEN-LAST:event_btnRecursosHumanosActionPerformed

    private void btnAdministrativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrativoMouseClicked
        botaoCliclado(btnAdministrativo);
    }//GEN-LAST:event_btnAdministrativoMouseClicked

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked
        botaoCliclado(btnEstoque);
    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinanceiroMouseClicked
        botaoCliclado(btnFinanceiro);
    }//GEN-LAST:event_btnFinanceiroMouseClicked

    private void btnRecursosHumanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecursosHumanosMouseClicked
        botaoCliclado(btnRecursosHumanos);
    }//GEN-LAST:event_btnRecursosHumanosMouseClicked

    private void botaoCliclado(JButton botao){
        limparBotoes();
        botao.setBackground(new java.awt.Color(0, 0, 0));
    }
    
    private void limparBotoes(){
        btnAdministrativo.setBackground(new java.awt.Color(0, 8, 90));
        btnEstoque.setBackground(new java.awt.Color(0, 8, 90));
        btnFinanceiro.setBackground(new java.awt.Color(0, 8, 90));
        btnRecursosHumanos.setBackground(new java.awt.Color(0, 8, 90));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrativo;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnRecursosHumanos;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblEquipe;
    private javax.swing.JLabel lblInformacao;
    private javax.swing.JLabel lblModulos;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    // End of variables declaration//GEN-END:variables
}
