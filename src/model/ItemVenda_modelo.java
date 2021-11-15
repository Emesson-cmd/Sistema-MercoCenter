/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ItemVenda_Dao;
import java.util.ArrayList;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
//CRIAÇÃO DA CLASSE MODELO
public class ItemVenda_modelo {

    //ATRIVUTOS PRIVADOS
    private int cod_item_venda;
    private int notavenda_cod_venda;
    private float valor;
    private String datacad;
    private String horacad;
    private int quantidade;
    private float valor_total;
    private int produto_cod_produto;
//CONSTRUTOR QUE RECEBE E PREENCHE OS ATRIBUTS NA INICIALIZAÇÃO

    public ItemVenda_modelo(int cod_item_venda, int notavenda_cod_venda, float valor, String datacad, String horacad, int quantidade, float valor_total, int produto_cod_produto) {
        this.cod_item_venda = cod_item_venda;
        this.notavenda_cod_venda = notavenda_cod_venda;
        this.valor = valor;
        this.datacad = datacad;
        this.horacad = horacad;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
        this.produto_cod_produto = produto_cod_produto;
    }
//CONSTRUTOR VAZIO

    public ItemVenda_modelo() {
    }
//GETTERS E SETTERS

    public int getCod_item_venda() {
        return cod_item_venda;
    }

    public void setCod_item_venda(int cod_item_venda) {
        this.cod_item_venda = cod_item_venda;
    }

    public int getNotavenda_cod_venda() {
        return notavenda_cod_venda;
    }

    public void setNotavenda_cod_venda(int notavenda_cod_venda) {
        this.notavenda_cod_venda = notavenda_cod_venda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDatacad() {
        return datacad;
    }

    public void setDatacad(String datacad) {
        this.datacad = datacad;
    }

    public String getHoracad() {
        return horacad;
    }

    public void setHoracad(String horacad) {
        this.horacad = horacad;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public int getProduto_cod_produto() {
        return produto_cod_produto;
    }

    public void setProduto_cod_produto(int produto_cod_produto) {
        this.produto_cod_produto = produto_cod_produto;
    }

    //METODO USADOPARA INSERÇÃO DE ITEM VENDA RECEBE UM ARRAY LIST E EXECUTA O METODO DO DAO E REPASSA O RESULT PARA O CONTROLER
    public boolean inseriritens(ArrayList<ItemVenda_modelo> itens, int cod_nota) {
        return new ItemVenda_Dao().insert(itens, cod_nota);
    }
    //METODO USADOPARA BUSCA DE ITEM VENDA RECEBE UM CODIGO DA NOTA E EXECUTA O METODO DO DAO E REPASSA O RESULT PARA O CONTROLER

    public ArrayList<ItemVenda_modelo> buscar(int codNota) {
        return new ItemVenda_Dao().buscar(codNota);
    }
}
