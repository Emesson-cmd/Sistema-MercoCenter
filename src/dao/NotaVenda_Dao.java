/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.NotaVenda_modelo;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author sulis
 */
public class NotaVenda_Dao {
    Connection conexao = null;
    Conexao con = new Conexao();
    
       public ArrayList<NotaVenda_modelo> listarNotas(){
            ArrayList<NotaVenda_modelo> notas = new ArrayList<NotaVenda_modelo>();

        try {
             this.conexao=con.abricConecxao();
             String sql="select * from notavenda";
             PreparedStatement preparo= this.conexao.prepareStatement(sql);
             ResultSet resultado = preparo.executeQuery(); 
             
             while(resultado.next()){
                 NotaVenda_modelo nota = new NotaVenda_modelo();
                 nota.setCod_venda(resultado.getInt(1));
                 nota.setValor(resultado.getFloat(2));
                 nota.setData(resultado.getString(3)+"");
                 nota.setValor_total(resultado.getFloat(4));
                 nota.setDatacad(resultado.getString(5)+"");
                 nota.setHoracad(resultado.getString(6)+"");
                 nota.setQuantidade(resultado.getInt(7));
                 nota.setFuncionaio_cod_funcionario(resultado.getInt(8));
                 nota.setCliente_cod_cliente(resultado.getInt(9));
                 notas.add(nota);
             }

             return notas;
            
        } catch (Exception e) {
            return null;
        }
    }
    public int inserirNota(NotaVenda_modelo nota) throws SQLException{
        
        Random numeronota = new Random();
        int numero =0;
        this.conexao=con.abricConecxao();
        for(int i =0;i<100;i++){
            int sort = numeronota.nextInt(1000000000);
            try {
                 String sql="insert into notavenda(cod_venda, valor, data, valor_total, datacad, horacad, quantidade, funcionaio_cod_funcionario, cliente_cod_cliente)\n" +
                "values('"+sort+"', '"+nota.getValor()+"', '"+nota.getData()+"', '"+nota.getValor_total()+"', "
                + "'"+nota.getDatacad()+"', '"+nota.getHoracad()+"', '"+nota.getQuantidade()+"', '"+nota.getFuncionaio_cod_funcionario()+"', '"+nota.getCliente_cod_cliente()+"');";
                 PreparedStatement preparo= this.conexao.prepareStatement(sql);
                 boolean rt = preparo.execute(); 
                 if(rt==false){
                     numero = sort;
                     System.out.println(i);
                     System.out.println(sql);
                     break;
                 }else{
                     System.out.println(sql);
                     System.out.println(rt);
                     System.out.println("erro db");
                 }

            } catch (Exception e) {
                System.out.println("Erro notavenda_dao listar nota a: "+e);
                
            }
        }
        System.out.println(numero);
        return numero;
    }
    
    
}
