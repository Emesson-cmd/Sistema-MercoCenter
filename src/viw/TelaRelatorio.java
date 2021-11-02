/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import controle.Relatorio_controle;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sulis
 */
public class TelaRelatorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
        prencherCbmAnos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbAnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMeses = new javax.swing.JComboBox<>();
        btnLimparCampos = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNomeProdutoMais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFaturamentoTotalData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFaturamentoProdutoMais = new javax.swing.JTextField();
        txtNomeProdutoMenos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFaturamentoProdutoMenos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtInvestimentoTotalData = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(650, 531));
        setPreferredSize(new java.awt.Dimension(650, 531));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de pesquisa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        cmbAnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escolha uma ano"}));

        jLabel1.setText("Ano:");

        jLabel2.setText("Mes:");

        cmbMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionae o mês","janeiro", "fevereiro", "março", "abril","maio", "junho", "julho", "agosto","setembro", "outubro", "novembro", "dezembro" }));

        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setText("Gerar relatorio");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cmbAnos, 0, 308, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbMeses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(cmbAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(cmbMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnGerarRelatorio))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do produto", "Quantidade vendida", "Investimento", "Faturamento geral", "Lucro_sobre_investimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRelatorio);

        jLabel4.setText("Produto mais vendido:");

        txtNomeProdutoMais.setEditable(false);
        txtNomeProdutoMais.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Faturamento sem taxa de investimento:");

        txtFaturamentoTotalData.setEditable(false);
        txtFaturamentoTotalData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Faturamento total do produto:");

        txtFaturamentoProdutoMais.setEditable(false);
        txtFaturamentoProdutoMais.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeProdutoMenos.setEditable(false);
        txtNomeProdutoMenos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Produto mais vendido:");

        txtFaturamentoProdutoMenos.setEditable(false);
        txtFaturamentoProdutoMenos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Faturamento total do produto:");

        txtInvestimentoTotalData.setEditable(false);
        txtInvestimentoTotalData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Valor geral de investimento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProdutoMais)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addComponent(txtFaturamentoProdutoMais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtFaturamentoTotalData))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProdutoMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaturamentoProdutoMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addGap(21, 21, 21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addComponent(txtInvestimentoTotalData)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProdutoMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaturamentoProdutoMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaturamentoTotalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProdutoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaturamentoProdutoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInvestimentoTotalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
        //remover linhas antigas da tabela
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tableRelatorio.getModel();
        while(dtm.getRowCount()!=0){
            dtm.removeRow(0);
        }
        txtFaturamentoProdutoMais.setText("");
        txtFaturamentoProdutoMenos.setText("");
        txtFaturamentoTotalData.setText("");
        txtInvestimentoTotalData.setText("");
        txtNomeProdutoMais.setText("");
        txtNomeProdutoMenos.setText("");
        cmbAnos.setSelectedItem(1);
        cmbMeses.setSelectedItem(1);
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        // TODO add your handling code here:
        new Relatorio_controle().buscar_relatorio(cmbMeses.getSelectedItem()+"", cmbAnos.getSelectedItem()+"", (DefaultTableModel)tableRelatorio.getModel());
        maximasProdutos();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed
    public void prencherCbmAnos() {
        String ano = LocalDate.now() + "";
        int ano_frormatado = Integer.parseInt(ano.substring(0, 4));
        ArrayList<String> anos = new ArrayList<String>();
        if (ano_frormatado == 2021) {
            anos.add(ano_frormatado + "");
        } else if (ano_frormatado > 2021) {
            for (int i = 2021; i < ano_frormatado; i++) {
                anos.add(i + "");
            }
        }
        for (int i = 0; i < anos.size(); i++) {
            cmbAnos.addItem(anos.get(i));
        }


    
} 
public void maximasProdutos(){

        float investimento=0;
        float faturamento = 0;
        float Maior =0;
        float Menor = 0;
       DefaultTableModel tbm = (DefaultTableModel)tableRelatorio.getModel();
       for(int i=0;i<tbm.getRowCount();i++){
           investimento+=Float.parseFloat(tbm.getValueAt(i, 2)+"");
           faturamento+=Float.parseFloat(tbm.getValueAt(i, 4)+"");
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")>Maior){
               Maior = Float.parseFloat(tbm.getValueAt(i, 1)+"");
           }
           if(Menor==0){
               Menor=Maior;
           }
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")<Menor){
               Menor = Float.parseFloat(tbm.getValueAt(i, 1)+"");
           }
           
       }
       for(int i=0;i<tbm.getRowCount();i++){
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")==Maior){
               txtNomeProdutoMais.setText(tbm.getValueAt(i, 0)+"");
               txtFaturamentoProdutoMais.setText(tbm.getValueAt(i, 3)+"");
           }
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")==Menor){
               txtFaturamentoProdutoMenos.setText(tbm.getValueAt(i, 3)+"");
               txtNomeProdutoMenos.setText(tbm.getValueAt(i, 0)+"");
           }
       }
       System.out.println("menor"+Menor+",Mairo"+Maior);
       this.txtFaturamentoTotalData.setText(faturamento+"");
       this.txtInvestimentoTotalData.setText(investimento+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbAnos;
    private javax.swing.JComboBox<String> cmbMeses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRelatorio;
    private javax.swing.JTextField txtFaturamentoProdutoMais;
    private javax.swing.JTextField txtFaturamentoProdutoMenos;
    private javax.swing.JTextField txtFaturamentoTotalData;
    private javax.swing.JTextField txtInvestimentoTotalData;
    private javax.swing.JTextField txtNomeProdutoMais;
    private javax.swing.JTextField txtNomeProdutoMenos;
    // End of variables declaration//GEN-END:variables
}
