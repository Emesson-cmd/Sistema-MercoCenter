/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viw;

import controle.Funcionario_controle;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Funcionario_modelo;

/**
 *
 * @author emesson
 */
public class TelaListaFuncionarios extends javax.swing.JInternalFrame {
    ArrayList<Funcionario_modelo> funcionarios = new ArrayList();

    /**
     * Creates new form TelaListaFuncionarios
     */
    public TelaListaFuncionarios() {
        initComponents();
        iniciarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        setTitle("Lista de Funcionários");

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Inicia a tabela
    private void iniciarTabela() {
        DefaultTableModel dtmFuncionario = (DefaultTableModel) tabelaUsuarios.getModel();

        // Retorna um arrayList de funcionarios
        this.funcionarios = new Funcionario_controle().buscarFuncionarios();

        for (int i = 0; i < this.funcionarios.size(); i++) {

            Object[] dadosFuncionarios = {funcionarios.get(i).getCod(), funcionarios.get(i).getCelular()};
            dtmFuncionario.addRow(dadosFuncionarios);            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
