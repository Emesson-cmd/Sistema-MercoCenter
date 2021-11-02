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
 * @author T.I
 */
public class Produto_modelo {

    private int cod_produto;
    private String nome;
    private String descrição;
    private double valor_compra;
    private double valor_venda;
    private int quantidade;
    private String data_validade;
    private int quantidademinima;

    public int getQuantidademinima() {
        return quantidademinima;
    }

    public void setQuantidademinima(int quantidademinima) {
        this.quantidademinima = quantidademinima;
    }
    private String tipo;
    private String datacad;
    private String horacad;

    public Produto_modelo(String d_validade, int cod_produto, String nome, String descrição, double valor_compra, double valor_venda, int quantidade, int quantidademin, String tipo, String datacad, String horacad) {
        this.cod_produto = cod_produto;
        this.nome = nome;
        this.descrição = descrição;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.quantidademinima = quantidademin;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.datacad = datacad;
        this.horacad = horacad;
        this.data_validade = d_validade;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    public Produto_modelo() {
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
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

    public ArrayList<Produto_modelo> listarprodutos() {
        return new Produto_Dao().buscarprodutos();
    }
    public boolean remover_Produto(int id){
    return new Produto_Dao().remover_Produto(id);
    } 

}
