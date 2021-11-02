/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Produto_Dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto_modelo;

/**
 *
 * @author T.I
 */
public class Produto_controle {

    private ArrayList<Produto_modelo> produtos = new ArrayList<Produto_modelo>();

    public ArrayList<Produto_modelo> buscarprodutos() {
        return new Produto_Dao().buscarprodutos();
    }

    public DefaultTableModel prencherTabela(DefaultTableModel tabelare) {
        produtos.removeAll(produtos);
        ArrayList<Produto_modelo> produtos = new Produto_modelo().listarprodutos();
        DefaultTableModel tabela = tabelare;
        try {
            for (int i = 0; i < produtos.size(); i++) {
                Produto_modelo produto = new Produto_modelo();
                produto.setCod_produto(produtos.get(i).getCod_produto());
                produto.setDatacad(produtos.get(i).getDatacad() + "");
                produto.setData_validade(produtos.get(i).getData_validade() + "");
                produto.setDescrição(produtos.get(i).getDescrição());
                produto.setHoracad(produtos.get(i).getHoracad() + "");
                produto.setNome(produtos.get(i).getNome());
                produto.setQuantidade(produtos.get(i).getQuantidade());
                produto.setQuantidademinima(produtos.get(i).getQuantidademinima());
                produto.setTipo(produtos.get(i).getTipo());
                produto.setValor_compra(produtos.get(i).getValor_compra());
                produto.setValor_venda(produtos.get(i).getValor_venda());
                this.produtos.add(produto);
            }
            for (int i = 0; i < this.produtos.size(); i++) {
                Object[] linhas = {this.produtos.get(i).getCod_produto(), this.produtos.get(i).getNome(), this.produtos.get(i).getDescrição(), this.produtos.get(i).getValor_compra(), this.produtos.get(i).getValor_venda(), this.produtos.get(i).getQuantidade(), this.produtos.get(i).getQuantidademinima(), this.produtos.get(i).getTipo(), this.produtos.get(i).getDatacad(), this.produtos.get(i).getData_validade(), this.produtos.get(i).getHoracad(), "Remover"};
                tabela.addRow(linhas);
            }
            System.out.println("Executado prencher tabela");
        } catch (Exception e) {
            System.out.println("e");
        }

        return tabela;
    }

    public Produto_modelo buscarprodutopeloId(int id) {
        System.out.println("o id "+id);
        Produto_modelo produto = new Produto_modelo();
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getCod_produto() == id) {
                produto.setCod_produto(id);
                produto.setDatacad(this.produtos.get(i).getDatacad() + "");
                produto.setData_validade(produtos.get(i).getData_validade() + "");
                produto.setDescrição(this.produtos.get(i).getDescrição());
                produto.setHoracad(this.produtos.get(i).getHoracad() + "");
                produto.setNome(this.produtos.get(i).getNome());
                produto.setQuantidade(this.produtos.get(i).getQuantidade());
                produto.setQuantidademinima(this.produtos.get(i).getQuantidademinima());
                produto.setTipo(this.produtos.get(i).getTipo());
                produto.setValor_compra(this.produtos.get(i).getValor_compra());
                produto.setValor_venda(produtos.get(i).getValor_venda());

            }else{
                
            }
        }
        return produto;

    }
    public void remover_Produto(int id){
    boolean resultado = new Produto_modelo().remover_Produto(id);
        if(resultado==false){
        JOptionPane.showMessageDialog(null, "O produto foi removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "OErro na remoçãodo produto!");
        }
    } 

}
