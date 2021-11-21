
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sulis
 */
public class mi {
    public static void main(String[] args) {
          String ano = LocalDate.now()+"";
    int ano_frormatado = Integer.parseInt(ano.substring(0,4));
    ArrayList<String> anos = new ArrayList<String>();
    if(ano_frormatado==2021){
        anos.add(ano_frormatado+"");
    }else if(ano_frormatado>2021){
        for(int i=2021;i<ano_frormatado;i++){
            anos.add(i+"");
        }
    }
    for(int i=0;i<anos.size();i++){
        System.out.println(anos.get(i));
    }
    }
    
}
