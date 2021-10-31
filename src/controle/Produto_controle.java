/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Produto_Dao;
import java.util.ArrayList;
import model.Produto_modelo;

/**
 *
 * @author T.I
 */
public class Produto_controle {
    public  ArrayList<Produto_modelo> buscarprodutos(){
        return new Produto_Dao().buscarprodutos();
    }
    
}
