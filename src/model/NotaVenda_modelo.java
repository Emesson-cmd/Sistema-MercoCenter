/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.NotaVenda_Dao;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**F
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
//CRIAÇÃO DA CLASSE NOTA VENDA MODELO
public class NotaVenda_modelo {
    //METODOS PRIVADOS
    private int funcionaio_cod_funcionario;
    private int cliente_cod_cliente;
    private int cod_venda;
    private float valor;
    private String data;
    private String datacad;
    private String horacad;
    private int quantidade;
    private float valor_total;
    
    //CONSTRUTOR QUE RECEBE OS VALORES DOS ATRIBUTOS E OS PREENCHE NA INICIALIZAÇÃO DA CLASSE
    public NotaVenda_modelo(int funcionaio_cod_funcionario, int cliente_cod_cliente, int cod_venda, float valor, String data, String datacad, String horacad, int quantidade, float valor_total) {
        this.funcionaio_cod_funcionario = funcionaio_cod_funcionario;
        this.cliente_cod_cliente = cliente_cod_cliente;
        this.cod_venda = cod_venda;
        this.valor = valor;
        this.data = data;
        this.datacad = datacad;
        this.horacad = horacad;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
    }
    //CONTRUTOR VAZIO
    public NotaVenda_modelo() {
    }

    //GETTERS E SETTERS
    public int getFuncionaio_cod_funcionario() {
        return funcionaio_cod_funcionario;
    }

    public void setFuncionaio_cod_funcionario(int funcionaio_cod_funcionario) {
        this.funcionaio_cod_funcionario = funcionaio_cod_funcionario;
    }

    public int getCliente_cod_cliente() {
        return cliente_cod_cliente;
    }

    public void setCliente_cod_cliente(int cliente_cod_cliente) {
        this.cliente_cod_cliente = cliente_cod_cliente;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
    
    //METODO QUE FAZ A BUSCA DAS NOTAS E RETORNA O RESULT PARA O CONTROLER
     public ArrayList<NotaVenda_modelo> listarNotas(){
        return new NotaVenda_Dao().listarNotas();
     }
    //METODO QUE FAZ A INSERÇÃO DAS NOTAS E RETORNA O RESULT PARA O CONTROLER
     public int inserirNotas(NotaVenda_modelo nota) throws SQLException{
        return new NotaVenda_Dao().inserirNota(nota);
     }
    
    
    
}
