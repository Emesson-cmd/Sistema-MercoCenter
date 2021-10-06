/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sulis
 */
public class Pessoa implements InterPessoa{
    protected int id;
    protected String cpf;
    protected String nome;
    protected String user;
    protected String password;
    protected String tipo;
 
    public Pessoa(){
        
    }
    public Pessoa(String user,String nome,String password,int id,String cpf,String tipo){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
        this.password = password;
        this.user = user;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
    @Override

    public String getUser() {
        return this.user;
    }
    @Override

    public void setUser(String user) {
        this.user = user;
    }
    @Override

    public String getPassword() {
        return this.password;
    }
    @Override

    public void setPassword(String password) {
        this.password = password;
    }
 
    

        
}
