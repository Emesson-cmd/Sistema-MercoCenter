
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Usuario_Dao;
import java.util.ArrayList;

/**
 *
 * @author JOSÉ ULISSES DA SILVA
 *
 * ESSA CLASSE SERVE COMO MODELO PARA RECEBER DADOS DO BANCO E REPASSSANDO PARA
 * AS CAMADAS DE CONTROLE E VISÃO
 */
public class Usuario_Modelo {

    private int cod_usuario;
    private String senha;
    private String permissao;
    private int funcionario_cod_funcionario;
    private String nome;
    private int ativo;

//CONSTRUTOR PARA INSERÇÃ DE DADOS NA INSTANCIOA DA CLASSE
    public Usuario_Modelo(int cod_usuario, String senha, String permissao, int funcionario_cod_funcionario, String nome, int ativo) {
        this.cod_usuario = cod_usuario;
        this.senha = senha;
        this.permissao = permissao;
        this.funcionario_cod_funcionario = funcionario_cod_funcionario;
        this.nome = nome;
        this.ativo = ativo;
    }

//CONSTRUTOR VAZIO
    public Usuario_Modelo() {
    }

//    METODOS GETTERS E SETTERS
    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public int getFuncionario_cod_funcionario() {
        return funcionario_cod_funcionario;
    }

    public void setFuncionario_cod_funcionario(int funcionario_cod_funcionario) {
        this.funcionario_cod_funcionario = funcionario_cod_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
//O METODO ABAIXO E RESPONSAVEL POR REDIRECIONAR O RESULTADO VINDODO DO METODO LOGAR EM DAO PARA O CONROLER   

    public ArrayList<Usuario_Modelo> logar(int user, String senha) {
        return new Usuario_Dao().buscar(user, senha);
    }
//O METODO ABAIXO E RESPONSAVEL POR REDIRECIONAR O RESULTADO VINDODO DO METODO LOGAR DO ADMINISTRADOR EM DAO PARA O CONROLER   

    public ArrayList<Usuario_Modelo> logarAdm(int user, String senha) {
        return new Usuario_Dao().buscar(user, senha);
    }
//O METODO ABAIXO E RESPONSAVEL POR REDIRECIONAR O RESULTADO VINDODO DO METODO REDEFINIR SENHA EM DAO PARA O CONROLER   

    public boolean Redefinirsenha(int usuario, String senha, int cod_funcionario) {
        return new Usuario_Dao().Update(usuario, senha, cod_funcionario);
    }
<<<<<<< HEAD
//O METODO ABAIXO E RESPONSAVEL POR REDIRECIONAR O RESULTADO VINDODO DO METODO LISTAR USUARIO EM DAO PARA O CONROLER   
=======
>>>>>>> origin/main

    public ArrayList<Usuario_Modelo> listarUsuarios() {
        return new Usuario_Dao().buscarUsuarios();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/main
