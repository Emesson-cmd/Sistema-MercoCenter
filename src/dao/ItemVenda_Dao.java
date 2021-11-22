/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
//O CODIGO ABAIXO FAZ AS IMPORTAÇÕES NECESSARIAS

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.ItemVenda_modelo;
import java.sql.ResultSet;

/**
 *
 * @author JOSÉ ULISSES DA SILVA
 */
public class ItemVenda_Dao {

    private ArrayList<ItemVenda_modelo> itens = new ArrayList<ItemVenda_modelo>();
    private Connection conexao = null;
    private Conexao con = new Conexao();
// METODO RESPONASAVEL POR INSERIR UMA NOVO ITEM VENDA NO BANCO DE DADOS

    public boolean insert(ArrayList<ItemVenda_modelo> itens, int cod_nota) {
        String sql_formatando = "insert into itemvenda(notavenda_cod_venda,valor,datacad,horacad,quantidade,valor_total,produto_cod_produto) values";

        try {
            this.conexao = con.abricConecxao();
            for (int i = 0; i < itens.size(); i++) {
                String values = ",(" + cod_nota + "," + itens.get(i).getValor() + ",'" + itens.get(i).getDatacad() + "','" + itens.get(i).getHoracad() + "'," + itens.get(i).getQuantidade() + "," + itens.get(i).getValor_total() + "," + itens.get(i).getProduto_cod_produto() + ")";
                sql_formatando += values;

            }
            StringBuilder sql_String = new StringBuilder(sql_formatando);
            sql_String.deleteCharAt(114);
            PreparedStatement preparo = this.conexao.prepareStatement(sql_String + "");
            boolean resultado = preparo.execute();
            return resultado;

        } catch (Exception e) {
            System.out.println("Erro itemvenda_dao inserir item: " + e);
            return false;
        } finally {
            con.fecharConecxao(conexao);
        }
    }
    // METODO RESPONASAVEL POR BUSCAR UM ITEM ATRAVES DE SEU ID NO BANCO DE DADOS

    public ArrayList<ItemVenda_modelo> buscar(int codNota) {
        String sql_formatando = "select * from itemvenda where notavenda_cod_venda = " + codNota + "";

        try {
            this.conexao = con.abricConecxao();

            PreparedStatement preparo = this.conexao.prepareStatement(sql_formatando);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                ItemVenda_modelo item = new ItemVenda_modelo();
                item.setCod_item_venda(resultado.getInt(1));
                item.setDatacad(resultado.getString(4));
                item.setHoracad(resultado.getString(5));
                item.setNotavenda_cod_venda(resultado.getInt(2));
                item.setProduto_cod_produto(resultado.getInt(8));
                item.setQuantidade(resultado.getInt(6));
                item.setValor(resultado.getFloat(3));
                item.setValor_total(resultado.getFloat(7));
                itens.add(item);

            }
            return itens;

        } catch (Exception e) {
            System.out.println("Erro itemvenda_dao buscar item: " + e);
            return null;
        } finally {
            con.fecharConecxao(conexao);
        }
    }

}
