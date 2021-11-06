/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Produto_Dao;
import java.time.LocalDateTime;
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
        while (tabelare.getRowCount() != 0) {
            tabelare.removeRow(0);
        }
        try {
            for (int i = 0; i < produtos.size(); i++) {
                Produto_modelo produto = new Produto_modelo();
                produto.setCod_produto(produtos.get(i).getCod_produto());
                produto.setDatacad(produtos.get(i).getDatacad() + "");
                produto.setData_validade(produtos.get(i).getData_validade() + "");
                produto.setDescricao(produtos.get(i).getDescricao());
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
                Object[] linhas = {this.produtos.get(i).getCod_produto(), this.produtos.get(i).getNome(), this.produtos.get(i).getDescricao(), this.produtos.get(i).getValor_compra(), this.produtos.get(i).getValor_venda(), this.produtos.get(i).getQuantidade(), this.produtos.get(i).getQuantidademinima(), this.produtos.get(i).getTipo(), this.produtos.get(i).getDatacad(), this.produtos.get(i).getData_validade(), this.produtos.get(i).getHoracad(), "Remover"};
                tabela.addRow(linhas);
            }
            System.out.println("Executado prencher tabela");
        } catch (Exception e) {
            System.out.println("e");
        }

        return tabela;
    }

    public Produto_modelo buscarprodutopeloId(int id) {
        ArrayList<Produto_modelo> produtos = new Produto_modelo().listarprodutos();
        Produto_modelo produto = new Produto_modelo();
        for (int i = 0; i < produtos.size(); i++) {
          
            if (produtos.get(i).getCod_produto() == id) {
                produto.setCod_produto(id);
                produto.setDatacad(produtos.get(i).getDatacad() + "");
                produto.setData_validade(produtos.get(i).getData_validade() + "");
                produto.setDescricao(produtos.get(i).getDescricao());
                produto.setHoracad(produtos.get(i).getHoracad() + "");
                produto.setNome(produtos.get(i).getNome());
                produto.setQuantidade(produtos.get(i).getQuantidade());
                produto.setQuantidademinima(produtos.get(i).getQuantidademinima());
                produto.setTipo(produtos.get(i).getTipo());
                produto.setValor_compra(produtos.get(i).getValor_compra());
                produto.setValor_venda(produtos.get(i).getValor_venda());
                break;
            
            } else {
                produto.setCod_produto(0);
                produto.setDatacad("");
                produto.setData_validade("");
                produto.setDescricao("");
                produto.setHoracad("");
                produto.setNome("");
                produto.setQuantidade(0);
                produto.setQuantidademinima(0);
                produto.setTipo("");
                produto.setValor_compra(0);
                produto.setValor_venda(0);

            }
            

        }
        System.out.println("o codigo do produto :"+produto.getCod_produto());
        return produto;

    }

    public void remover_Produto(int id) {
        boolean resultado = new Produto_modelo().remover_Produto(id);
        if (resultado == false) {
            JOptionPane.showMessageDialog(null, "O produto foi removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "OErro na remoçãodo produto!");
        }
    }

    public boolean atualizar_Produto(String cod, String nome, String descricao, String valorCompra, String valorVenda, String qtd, String qtdm, String tipo, String dataValidade) {
        try {
            LocalDateTime data = LocalDateTime.now();
            String datahora = data + "";

            String dataformatada = datahora.substring(0, 10);
            String horaformatada = datahora.substring(11, 19);

            int cod1 = Integer.parseInt(cod);
            String nome1 = nome;
            String descricao1 = descricao;
            double valorCompra1 = Double.parseDouble(valorCompra);
            double valorVenda1 = Double.parseDouble(valorVenda);
            int qtd1 = Integer.parseInt(qtd);
            int qtdm1 = Integer.parseInt(qtdm);
            String tipo1 = tipo;
            String dataValidade1 = dataValidade;
            String datacad1 = dataformatada;
            String horacad1 = horaformatada;
            Produto_modelo produtom = new Produto_modelo(dataValidade1, cod1, nome1, descricao1, valorCompra1, valorVenda1, qtd1, qtdm1, tipo1, datacad1, horacad1);
            return new Produto_modelo().atualizar_Produto(produtom);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise os canpos inserido");
            return true;
        }

    }

    public boolean inserir_Produto(String cod, String nome, String descricao, String valorCompra, String valorVenda, String qtd, String qtdm, String tipo, String dataValidade) {
        try {
            LocalDateTime data = LocalDateTime.now();
            String datahora = data + "";

            String dataformatada = datahora.substring(0, 10);
            String horaformatada = datahora.substring(11, 19);

            int cod1 = Integer.parseInt(0 + "");
            String nome1 = nome;
            String descricao1 = descricao;
            double valorCompra1 = Double.parseDouble(valorCompra);
            double valorVenda1 = Double.parseDouble(valorVenda);
            int qtd1 = Integer.parseInt(qtd);
            int qtdm1 = Integer.parseInt(qtdm);
            String tipo1 = tipo;
            String dataValidade1 = dataValidade;
            String datacad1 = dataformatada;
            String horacad1 = horaformatada;
            Produto_modelo produtom = new Produto_modelo(dataValidade1, cod1, nome1, descricao1, valorCompra1, valorVenda1, qtd1, qtdm1, tipo1, datacad1, horacad1);
            return new Produto_modelo().inserir_Produto(produtom);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise os canpos inserido");
            return true;
        }

    }

}
