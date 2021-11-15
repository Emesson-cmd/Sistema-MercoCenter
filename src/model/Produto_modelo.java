/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Produto_Dao;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import model.Produto_modelo;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
//CRIAÇÃODA CLASSE MODELO DE PRODUTO
public class Produto_modelo {
<<<<<<< HEAD
//ATRIBUTOSPRIVADOS
=======
>>>>>>> origin/main

    private int cod_produto;
    private String nome;
    private String descricao;
    private double valor_compra;
    private double valor_venda;
    private int quantidade;
    private String data_validade;
    private int quantidademinima;
<<<<<<< HEAD
    private String tipo;
    private String datacad;
    private String horacad;
//CONSTRUTOR QUE PREENCHE OS ATRIBUTOS NA INICIALIZAÇÃO DA CLASSE
=======

    public int getQuantidademinima() {
        return quantidademinima;
    }

    public void setQuantidademinima(int quantidademinima) {
        this.quantidademinima = quantidademinima;
    }
    private String tipo;
    private String datacad;
    private String horacad;

>>>>>>> origin/main
    public Produto_modelo(String d_validade, int cod_produto, String nome, String descrição, double valor_compra, double valor_venda, int quantidade, int quantidademin, String tipo, String datacad, String horacad) {
        this.cod_produto = cod_produto;
        this.nome = nome;
        this.descricao = descrição;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.quantidademinima = quantidademin;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.datacad = datacad;
        this.horacad = horacad;
        this.data_validade = d_validade;
<<<<<<< HEAD
=======
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
>>>>>>> origin/main
    }
    //CONSTRUTOR VAZIO
    public Produto_modelo() {
    }

    
    //GETTERS E SETTERS

    public int getQuantidademinima() {
        return quantidademinima;
    }

    public void setQuantidademinima(int quantidademinima) {
        this.quantidademinima = quantidademinima;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    
    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
<<<<<<< HEAD
// O METODO ABAIXO EXECUTA O METSO DE BUSCAPRODUTOS DO DAO E REPASA O RESULTADO PARA O CONTROLER
    public ArrayList<Produto_modelo> listarprodutos() {
        return new Produto_Dao().buscarprodutos();
    }
// O METODO ABAIXO EXECUTA O METSO DE REMOVERPRODUTO DO DAO E REPASA O RESULTADO PARA O CONTROLER
    public boolean remover_Produto(int id) {
        return new Produto_Dao().remover_Produto(id);
    }
// O METODO ABAIXO EXECUTA O METSO DE ATUALIZARPRODUTOS DO DAO E REPASA O RESULTADO PARA O CONTROLER
    public boolean atualizar_Produto(Produto_modelo produto) {
        return new Produto_Dao().atualizar_Produto(produto);
    }
// O METODO ABAIXO EXECUTA O METSO DE INSERIRPRODUTOS DO DAO E REPASA O RESULTADO PARA O CONTROLER
=======

    public ArrayList<Produto_modelo> listarprodutos() {
        return new Produto_Dao().buscarprodutos();
    }

    public boolean remover_Produto(int id) {
        return new Produto_Dao().remover_Produto(id);
    }

    public boolean atualizar_Produto(Produto_modelo produto) {
        return new Produto_Dao().atualizar_Produto(produto);
    }
>>>>>>> origin/main
    public boolean inserir_Produto(Produto_modelo produto) {
        return new Produto_Dao().inserir_Produto(produto);
    }

<<<<<<< HEAD
=======
   
>>>>>>> origin/main
}
