/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import model.NotaVenda_modelo;


/**
 *
 * @author sulis
 */
public class NotaVenda_controle {
    public NotaVenda_modelo gerarnota(String codvenda){
        int cod_venda = Integer.parseInt(codvenda);
        ArrayList<NotaVenda_modelo> notas = new NotaVenda_modelo().listarNotas();
        NotaVenda_modelo nota = new NotaVenda_modelo();
        try {
            for(int i=0;i<notas.size();i++){
            if(cod_venda == notas.get(i).getCod_venda()){
                nota.setCod_venda(notas.get(i).getCod_venda());
                nota.setData(notas.get(i).getData());
                nota.setHoracad(notas.get(i).getHoracad());
                nota.setValor_total(notas.get(i).getValor_total());
                
            }else{
        }
        }
        } catch (Exception e) {
            System.out.println("erro no controle"+e);
        }
        
        return nota;
         
    }
    public int inserirNotas(NotaVenda_modelo nota) throws SQLException{
        return new NotaVenda_modelo().inserirNotas(nota);
     }
    
    public ArrayList<NotaVenda_modelo> listarnotas(){
        return new NotaVenda_modelo().listarNotas();
        
         
    }
    
}
