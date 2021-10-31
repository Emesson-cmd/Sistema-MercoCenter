/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Funcionario_Dao;
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
    
}
