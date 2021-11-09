/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Relatorio_modelo;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
public class Relatorio_Dao {
   private ArrayList<Relatorio_modelo> relatorios = new ArrayList<Relatorio_modelo>();
    private Connection conexao = null;
    private String sql="";
    private Conexao con = new Conexao();
    
    
    //Metodo utilizado para buscar orelatorio que é feita com inner join da tabela produto e da item venda
    public ArrayList<Relatorio_modelo> buscar_relatorio(String diainicio,String diatemino){
        System.out.println("o dia inicio"+diainicio +" e o dia termino "+diatemino);
              sql= "SELECT  produto.nome,sum(itemvenda.quantidade) as Quantidade_total_vendido,sum(itemvenda.valor_total) as faturamento_geral FROM  itemvenda INNER JOIN  produto ON itemvenda.produto_cod_produto=produto.cod_produto Where itemvenda.datacad BETWEEN '"+diainicio+"' AND '"+diatemino+"' group by produto.nome";
        System.out.println(sql);
         try {
            this.conexao = con.abricConecxao();
            
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();
          
            while (resultado.next()) {
                Relatorio_modelo relatorio = new Relatorio_modelo();
                relatorio.setNome_produto(resultado.getString(1));
                relatorio.setQuantidade_total_vendida(resultado.getInt(2));
                relatorio.setFaturamento_geral(resultado.getFloat(3));
                this.relatorios.add(relatorio);
                
            }
            //aqui e retornado um array list de relatorio_Modelo 
             System.out.println("oq tem"+relatorios.get(0).getNome_produto().equals(""));
            if(relatorios.get(0).getNome_produto().equals("")){
                JOptionPane.showMessageDialog(null, "Não Existem dados na data selecionada escolha outra data.");
            }
            return relatorios;

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não Existem dados na data selecionada escolha outra data.");
            return null;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro no sql."+e);
            return null;
        }finally{
            con.fecharConecxao(conexao);
        }
         
    }
        
    
}
