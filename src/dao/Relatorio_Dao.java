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
    public ArrayList<Relatorio_modelo> buscar_relatorio(String diainicio,String diatemino){
              sql= "\"SELECT  produto.nome,sum(itemvenda.quantidade) as Quantidade_total_vendido,sum(produto.valor_compra*itemvenda.quantidade) as valor_investido,sum(itemvenda.valor_total) as faturamento_geral,(sum(itemvenda.valor_total)-sum(produto.valor_compra*itemvenda.quantidade)) as Lucro_sobre_investimento\\n\"\n" +
"            + \"FROM  itemvenda\\n\"\n" +
"            + \"  INNER JOIN  produto\\n\"\n" +
"            + \"  ON itemvenda.produto_cod_produto=produto.cod_produto    \\n\"\n" +
"            + \"Where itemvenda.datacad BETWEEN '"+diainicio+"' AND '"+diatemino+"' group by produto.nome;\";";
        
         try {
            this.conexao = con.abricConecxao();
            
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();
          
            while (resultado.next()) {
                Relatorio_modelo relatorio = new Relatorio_modelo();
                
                this.relatorios.add(relatorio);
                
            }
            return relatorios;

        } catch (Exception e) {
            System.out.println("Erro itemvenda_dao buscar item: " + e);
            return null;
        }
         
    }
        
    
}
