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
import model.Produto_modelo;
import dao.Conexao;
import java.sql.SQLException;

/**
 *
 * @author T.I
 */
public class Produto_Dao {

    Connection conexao = null;
    Conexao con = new Conexao();

    public ArrayList<Produto_modelo> buscarprodutos() {

        ArrayList<Produto_modelo> produtos = new ArrayList<>();

        try {
            this.conexao = con.abricConecxao();
            String sql = "select * from produto";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                Produto_modelo produto = new Produto_modelo();
                produto.setCod_produto(resultado.getInt("cod_produto"));
                produto.setNome(resultado.getString("nome"));
                produto.setDescrição(resultado.getString("descricao"));
                produto.setValor_compra(resultado.getDouble("valor_compra"));
                produto.setValor_venda(resultado.getDouble("valor_venda"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setQuantidademinima(resultado.getInt("quantidade_minima"));
                produto.setTipo(resultado.getString("tipo"));
                produto.setDatacad(resultado.getDate("datacad") + "");
                produto.setData_validade(resultado.getDate("datavalidade") + "");
                produto.setHoracad(resultado.getTime("horacad") + "");
                System.out.println("hora n bd" + resultado.getDate("horacad") + "");

                produtos.add(produto);
            }

            return produtos;
        } catch (Exception e) {
            System.out.println("erro no dao " + e);
            return null;
        }
    }

    public boolean remover_Produto(int id) {
        boolean result = false;
        try {
            this.conexao = con.abricConecxao();
            String sql = "delete  from produto  where cod_produto=" + id + ";";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            result = preparo.execute();

        } catch (SQLException e) {
            System.out.println("errono sql" + e);
            return false;
        }
        return result;
    }
}
