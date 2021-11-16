/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;
//IMPORTAÇÕES NECESSARIAS
import controle.Relatorio_controle;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
public class TelaRelatorio extends javax.swing.JInternalFrame {

    /**
     * O CODIGO ABAIXO CRIA OFORMULARIO TelaRelatorio
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

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeProdutoMais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFaturamentoProdutoMais = new javax.swing.JTextField();
        txtNomeProdutoMenos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFaturamentoProdutoMenos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtFaturamentoTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbAnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMeses = new javax.swing.JComboBox<>();
        btnLimparCampos = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(650, 531));
        setPreferredSize(new java.awt.Dimension(650, 531));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Produto mais vendido:");

        txtNomeProdutoMais.setEditable(false);
        txtNomeProdutoMais.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Faturamento total do produto:");

        txtFaturamentoProdutoMais.setEditable(false);
        txtFaturamentoProdutoMais.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeProdutoMenos.setEditable(false);
        txtNomeProdutoMenos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Produto menos vendido:");

        jLabel8.setText("Faturamento total do produto:");

        txtFaturamentoProdutoMenos.setEditable(false);
        txtFaturamentoProdutoMenos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtFaturamentoTotal.setEditable(false);
        txtFaturamentoTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtFaturamentoTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Faturamento total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFaturamentoTotal)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFaturamentoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeProdutoMais, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeProdutoMenos, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFaturamentoProdutoMais, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFaturamentoProdutoMenos, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(167, 167, 167)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomeProdutoMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaturamentoProdutoMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomeProdutoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaturamentoProdutoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de pesquisa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        cmbAnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escolha uma ano"}));

        jLabel1.setText("Ano:");

        jLabel2.setText("Mes:");

        cmbMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionae o mês","janeiro", "fevereiro", "março", "abril","maio", "junho", "julho", "agosto","setembro", "outubro", "novembro", "dezembro" }));

        btnLimparCampos.setBackground(new java.awt.Color(0, 8, 90));
        btnLimparCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setBackground(new java.awt.Color(0, 8, 90));
        btnGerarRelatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(cmbAnos, 0, 126, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbMeses, 0, 126, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAnos)
                            .addComponent(cmbMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerarRelatorio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(btnLimparCampos)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do produto", "Quantidade vendida", "Faturamento geral"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRelatorio);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// O CODIGO ABAIXO E RESPONSAVEL POR LIMPARA OS CAMPOS DE RELATORIO
    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
        //remover linhas antigas da tabela
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tableRelatorio.getModel();
        while(dtm.getRowCount()!=0){
            dtm.removeRow(0);
        }
        txtFaturamentoProdutoMais.setText("");
        txtFaturamentoTotal.setText("");
   
        txtFaturamentoProdutoMenos.setText("");
        txtNomeProdutoMais.setText("");
        txtNomeProdutoMenos.setText("");
        cmbAnos.setSelectedItem(1);
        cmbMeses.setSelectedItem(1);
    }//GEN-LAST:event_btnLimparCamposActionPerformed
// O CODIGO ABAIXO GERA O RELATORIO DE VENDAS
    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        new Relatorio_controle().buscar_relatorio(cmbMeses.getSelectedItem()+"", cmbAnos.getSelectedItem()+"", (DefaultTableModel)tableRelatorio.getModel());
        PrencheCamposProdutos();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed
 // O CODIGO ABAIXO PRENCHE A CAIXA DE COMBINAÇÃO COM ANOS DES DE A DATA DE FABRICAÇÃO DO SOFTWARE ATÉ A DATA ATUAL
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
    // O CODIGO ABAIXO ENCONTRA NA TABELA O PRODUTO MAIS VENDIDO E MENOS VENDIDO SEUS VALORES E O FATURAMNTO TOTAL E PRENCHE OS CAMPOS COMESSES VALORES
public void PrencheCamposProdutos(){

        float investimento=0;
        float faturamento = 0;
        float Maior =0;
        float Menor = 0;
       DefaultTableModel tbm = (DefaultTableModel)tableRelatorio.getModel();
       for(int i=0;i<tbm.getRowCount();i++){
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
           faturamento+=Float.parseFloat(tbm.getValueAt(i, 2)+"");
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")==Maior){
               txtNomeProdutoMais.setText(tbm.getValueAt(i, 0)+"");
               txtFaturamentoProdutoMais.setText(tbm.getValueAt(i, 2)+"");
           }
           if(Float.parseFloat(tbm.getValueAt(i, 1)+"")==Menor){
               txtFaturamentoProdutoMenos.setText(tbm.getValueAt(i, 2)+"");
               txtNomeProdutoMenos.setText(tbm.getValueAt(i, 0)+"");
           }
       }
       System.out.println("menor"+Menor+",Mairo"+Maior);
       this.txtFaturamentoTotal.setText(faturamento+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbAnos;
    private javax.swing.JComboBox<String> cmbMeses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRelatorio;
    private javax.swing.JTextField txtFaturamentoProdutoMais;
    private javax.swing.JTextField txtFaturamentoProdutoMenos;
    private javax.swing.JTextField txtFaturamentoTotal;
    private javax.swing.JTextField txtNomeProdutoMais;
    private javax.swing.JTextField txtNomeProdutoMenos;
    // End of variables declaration//GEN-END:variables
}
