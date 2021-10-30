/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.*;
import java.util.ArrayList;
import model.ItemVenda_modelo;


/**
 *
 * @author sulis
 */
public class ItemVenda_controle {
    public boolean salvaritens(ArrayList<ItemVenda_modelo> itens,int cod_nota){
        return new ItemVenda_modelo().inseriritens(itens,cod_nota);
    }
     public ArrayList<ItemVenda_modelo> buscar(int codNota) {
       return new ItemVenda_modelo().buscar( codNota);
   }
    
}
