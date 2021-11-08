/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Relatorio_Dao;
import java.util.ArrayList;

/**
 *
 * @author sulis
 */
public class Relatorio_modelo {

    private String nome_produto;
    private int quantidade_total_vendida;
    private float Faturamento_geral;

    public Relatorio_modelo(String nome_produto, int quantidade_total_vendida, float Valor_investido, float Faturamento_geral, float Faturamento_final) {
        this.nome_produto = nome_produto;
        this.quantidade_total_vendida = quantidade_total_vendida;
        this.Faturamento_geral = Faturamento_geral;
     
    }

    public Relatorio_modelo() {
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade_total_vendida() {
        return quantidade_total_vendida;
    }

    public void setQuantidade_total_vendida(int quantidade_total_vendida) {
        this.quantidade_total_vendida = quantidade_total_vendida;
    }

    

    public float getFaturamento_geral() {
        return Faturamento_geral;
    }

    public void setFaturamento_geral(float Faturamento_geral) {
        this.Faturamento_geral = Faturamento_geral;
    }

   
    
    public ArrayList<Relatorio_modelo> buscar_relatorio(String diainicio,String diatermino){
        return new Relatorio_Dao().buscar_relatorio(diainicio, diatermino);
    }
     
    
    
    
}
