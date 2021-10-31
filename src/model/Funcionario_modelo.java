/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Funcionario_Dao;
import java.util.ArrayList;

/**
 *
 * @author emesson
 */
public class Funcionario_modelo {
    int cod;
    String celular;
    String cpf;
    String datanasc;
    String email;
    String endereco; 
    String nome;
    String datacad;
    String horacad;
    String nume; // numero da casa?
    String rg;
    String sexo;
    String telefone;
    String uf;
    String bairro;
    String cidade;
    String cep;
    String cargo;
    String situacao;

    public Funcionario_modelo(int cod, String celular, String cpf, String datanasc, String email, String endereco, String nome, String datacad, String horacad, String nume, String rg, String sexo, String telefone, String uf, String bairro, String cidade, String cep, String cargo, String situacao) {
        this.cod = cod;
        this.celular = celular;
        this.cpf = cpf;
        this.datanasc = datanasc;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.datacad = datacad;
        this.horacad = horacad;
        this.nume = nume;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
        this.uf = uf;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.cargo = cargo;
        this.situacao = situacao;
    }
    
    
    public Funcionario_modelo(){
    
    };

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public ArrayList<Funcionario_modelo> listarFuncionarios(){
        return new Funcionario_Dao().buscarFuncionarios();
    }
    
}
