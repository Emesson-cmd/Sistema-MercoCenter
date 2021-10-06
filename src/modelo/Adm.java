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

public class Adm extends Pessoa{
 
    public Adm(){
        
    }
    public Adm(String user,String nome,String password,int id,String cpf,String tipo){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
        this.password = password;
        this.user = user;
        
    }
    
 
    

        
    
}