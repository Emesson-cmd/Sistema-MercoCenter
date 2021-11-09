/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;
//IMPORTAÇÕES NECESSARIAS
import controle.Produto_controle;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Produto_modelo;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
public class TelaEstoque extends javax.swing.JInternalFrame {

    private Produto_controle pc = new Produto_controle();

    /**
     * O CODIGO ABAIXO CRIA UMA FORMULARIO TelaEstoque
     */
    public TelaEstoque() throws ParseException {
        initComponents();
        DefaultTableModel tbm = (DefaultTableModel) tabelaProdutos.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        new Produto_controle().prencherTabela(tbm);

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
        painelEditar = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        txtValorVendido = new javax.swing.JTextField();
        txtNomeEdit = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        txtQuantidadeMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtValidade = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdEdit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscarProdutos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 531));
        setPreferredSize(new java.awt.Dimension(650, 531));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        painelEditar.setBackground(new java.awt.Color(255, 255, 255));
        painelEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDITAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAdicionar.setBackground(new java.awt.Color(0, 51, 153));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar Produto");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtValorVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVendidoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 51, 153));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar Alterações");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor vendido:");

        jLabel5.setText("Produto:");

        jLabel6.setText("Valor comprado:");

        jLabel7.setText("Validade:");

        jLabel8.setText("Quantidade:");

        jLabel9.setText("Quantidade minima:");

        jLabel10.setText("Categoria:");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane2.setViewportView(txaDescricao);

        jLabel11.setText("Descição:");

        txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));

        jLabel2.setText("ID:");

        txtIdEdit.setEditable(false);

        javax.swing.GroupLayout painelEditarLayout = new javax.swing.GroupLayout(painelEditar);
        painelEditar.setLayout(painelEditarLayout);
        painelEditarLayout.setHorizontalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEditarLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(painelEditarLayout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addGap(73, 73, 73)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                    .addGroup(painelEditarLayout.createSequentialGroup()
                        .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidadeMin))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelEditarLayout.createSequentialGroup()
                                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelEditarLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelEditarLayout.createSequentialGroup()
                                        .addComponent(txtValidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addGap(13, 13, 13))
                                    .addGroup(painelEditarLayout.createSequentialGroup()
                                        .addComponent(txtNomeEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorCompra)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEditarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdEdit))
                            .addGroup(painelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)
                                .addComponent(txtValorVendido))
                            .addComponent(txtTipo))))
                .addContainerGap())
        );
        painelEditarLayout.setVerticalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEditarLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "nome", "descrição", "valor compra", "Valor venda", "Quantidade", "Quantidade minima", "tipo", "data cadastro", "data validade", "hora cadastro", "Remover"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estoque");

        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnBuscarProdutos.setBackground(new java.awt.Color(0, 51, 153));
        btnBuscarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProdutos.setText("Buscar Produto");
        btnBuscarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)))
                        .addGap(11, 11, 11))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorVendidoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
// O CODIGO ABAIXO FAZ UMA BUSCA DE UM PRODUTO ATRAVES DO SEU ID LIMPANDO A TABELA PRODUTOS
// E PREENCHE ELA COM O PRODUTO QUE FOI REQUISITADO NA BUSCA
    private void btnBuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutosActionPerformed
        DefaultTableModel tbm = (DefaultTableModel) tabelaProdutos.getModel();
//O TRI CATCH FAZ A BUSCA DO PRODUTO E TRATA AS EXCESSÕES
        try {
            int id_formatado = Integer.parseInt(txtId.getText());

            Produto_modelo produto = new Produto_controle().buscarprodutopeloId(id_formatado);
            if (produto.getCod_produto() == 0) {
                JOptionPane.showMessageDialog(null, "Id informado não encontrado");
            } else {
                while (tbm.getRowCount() != 0) {
                    tbm.removeRow(0);
                }
                Object[] produtos = {produto.getCod_produto(), produto.getNome(), produto.getDescricao(), produto.getValor_compra(), produto.getValor_venda(), produto.getQuantidade(), produto.getQuantidademinima(), produto.getTipo(), produto.getDatacad(), produto.getData_validade(), produto.getHoracad(), "Remover"};
                tbm.addRow(produtos);

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "insira um valor numerico valido para busca" + e);
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
            }
            pc.prencherTabela(tbm);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "insira um valor numerico valido para busca" + e);
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
            }
            pc.prencherTabela(tbm);

        }

    }//GEN-LAST:event_btnBuscarProdutosActionPerformed
// O CODIGO ABAIXO ADICIONA UM PRODUTO AO BANCO DE DADOS E ADICIONA TABEM A TABELA
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        boolean result = new Produto_controle().inserir_Produto(txtIdEdit.getText(), txtNomeEdit.getText(), txaDescricao.getText(), txtValorCompra.getText(), txtValorVendido.getText(), txtQuantidade.getText(), txtQuantidadeMin.getText(), txtTipo.getText(), txtValidade.getText());
        if (result == true) {
            JOptionPane.showMessageDialog(null, "Erro na atualização");
        } else {

            new Produto_controle().prencherTabela((DefaultTableModel) tabelaProdutos.getModel());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed
//AO CODIGO ABAIXO FAZ UM TESTE PARA IDENTIFICAR SE O LOCAL CLICADO FOI REMOVER E SE FOR SERA EXIBIDA UMA MENSAGEM DE CONFIRMAÇÃO
    // E CASO SEJA CONFIRMADA A REMOÇÃO O PRODUTO SERÁ REMOVIDO CASO NÃO SEJA CLICADO EM REMOVER AS ENTRADAS DE DADOS SERÃO PRENCHIDAS PARA 
    // ATUALIZAÇÃODOS DADOS
    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        DefaultTableModel tbm = (DefaultTableModel) tabelaProdutos.getModel();
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = source.columnAtPoint(evt.getPoint());
        String s = source.getModel().getValueAt(row, column) + "";
        String id = source.getModel().getValueAt(row, 0) + "";
        if (s.equals("Remover")) {
            int confirmar = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo remover produto");
            if (confirmar == JOptionPane.OK_OPTION) {
                int id_formatado = Integer.parseInt(id);
                new Produto_controle().remover_Produto(id_formatado);
                tbm.removeRow(row);

            }

        } else {
            // O CODIGO ABAIXO PRENCHE OS CAMPOS DE DADOS DE ACORDO COM O PRODUTO SELECIONADO NA TABELA

            txtNomeEdit.setText(source.getModel().getValueAt(row, 1) + "");
            txaDescricao.setText(source.getModel().getValueAt(row, 2) + "");;
            txtValorCompra.setText(source.getModel().getValueAt(row, 3) + "");
            txtValorVendido.setText(source.getModel().getValueAt(row, 4) + "");
            txtQuantidade.setText(source.getModel().getValueAt(row, 5) + "");
            txtQuantidadeMin.setText(source.getModel().getValueAt(row, 6) + "");
            txtTipo.setText(source.getModel().getValueAt(row, 7) + "");
            txtValidade.setText(source.getModel().getValueAt(row, 9) + "");
            txtIdEdit.setText(source.getModel().getValueAt(row, 0) + "");

        }
    }//GEN-LAST:event_tabelaProdutosMouseClicked
// O CODIGO ABAIXO SALVA AS ALTERAÇÕES FEITAS NOS PRODUTOS SELECIONADOS
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        boolean result = new Produto_controle().atualizar_Produto(txtIdEdit.getText(), txtNomeEdit.getText(), txaDescricao.getText(), txtValorCompra.getText(), txtValorVendido.getText(), txtQuantidade.getText(), txtQuantidadeMin.getText(), txtTipo.getText(), txtValidade.getText());
        if (result == true) {
            JOptionPane.showMessageDialog(null, "Erro na atualização");
        } else {

            new Produto_controle().prencherTabela((DefaultTableModel) tabelaProdutos.getModel());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarProdutos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelEditar;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEdit;
    private javax.swing.JTextField txtNomeEdit;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtQuantidadeMin;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JFormattedTextField txtValidade;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorVendido;
    // End of variables declaration//GEN-END:variables
}
