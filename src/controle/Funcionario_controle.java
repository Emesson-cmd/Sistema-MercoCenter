/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import model.Funcionario_modelo;

/**
 *
 * @author emesson
 */
public class Funcionario_controle {
    
    public  ArrayList<Funcionario_modelo> buscarFuncionarios(){
        return new Funcionario_modelo().listarFuncionarios();
    }
    
    public boolean atualizarFuncionario(int cod, String celular, String cpf, String datanasc, String email, String endereco, String nome, String datacad, String horacad, String nume, String rg, String telefone, String uf, String bairro, String cidade, String cep, String cargo, String situacao){
        Funcionario_modelo funcionario_modelo = new Funcionario_modelo(cod, celular, cpf, datanasc, email, endereco, nome, datacad, horacad, nume, rg, telefone, uf, bairro, cidade, cep, cargo, situacao);
        boolean deuCerto = funcionario_modelo.atualizarFuncionario(funcionario_modelo);
        return deuCerto;
    }
    
    public boolean adicionarFuncionario(int cod, String celular, String cpf, String datanasc, String email, String endereco, String nome, String datacad, String horacad, String nume, String rg, String telefone, String uf, String bairro, String cidade, String cep, String cargo, String situacao){
        Funcionario_modelo funcionario_modelo = new Funcionario_modelo(cod, celular, cpf, datanasc, email, endereco, nome, datacad, horacad, nume, rg, telefone, uf, bairro, cidade, cep, cargo, situacao);
        boolean deuCerto = funcionario_modelo.adicionarFuncionario(funcionario_modelo);
        return deuCerto;
    }
    
    public boolean arquivarFuncionario(int id){
        boolean deuCerto = new Funcionario_modelo().inativarFuncionario(id);
        return deuCerto;
    }
}
