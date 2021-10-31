/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Relatorio_modelo;

/**
 *
 * @author sulis
 */
public class Relatorio_Dao {
   private ArrayList<Relatorio_modelo> relatorios = new ArrayList<Relatorio_modelo>();
    private Connection conexao = null;
    private String sql="";
    private Conexao con = new Conexao();
    
    
    //Metodo utilizado para buscar orelatorio que é feita com inner join da tabela produto e da item venda
    public ArrayList<Relatorio_modelo> buscar_relatorio(String diainicio,String diatemino){
        System.out.println("o dia inicio"+diainicio +" e o dia termino "+diatemino);
              sql= "SELECT  produto.nome,sum(itemvenda.quantidade) as Quantidade_total_vendido,sum(produto.valor_compra*itemvenda.quantidade) as valor_investido,sum(itemvenda.valor_total) as faturamento_geral,(sum(itemvenda.valor_total)-sum(produto.valor_compra*itemvenda.quantidade)) as Lucro_sobre_investimento FROM  itemvenda INNER JOIN  produto ON itemvenda.produto_cod_produto=produto.cod_produto Where itemvenda.datacad BETWEEN '"+diainicio+"' AND '"+diatemino+"' group by produto.nome";
        System.out.println(sql);
         try {
            this.conexao = con.abricConecxao();
            
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();
          
            while (resultado.next()) {
                Relatorio_modelo relatorio = new Relatorio_modelo();
                relatorio.setNome_produto(resultado.getString(1));
                relatorio.setQuantidade_total_vendida(resultado.getInt(2));
                relatorio.setValor_investido(resultado.getFloat(3));
                relatorio.setFaturamento_geral(resultado.getFloat(4));
                relatorio.setFaturamento_final(resultado.getFloat(5));
                this.relatorios.add(relatorio);
                
            }
            //aqui e retornado um array list de relatorio_Modelo 
            return relatorios;

        } catch (Exception e) {
            System.out.println("Erro Relatorio_dao buscar item: " + e);
            return null;
        }
         
    }
        
    
}
