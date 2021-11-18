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
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
public class Produto_Dao {

    private Connection conexao = null;
    private Conexao con = new Conexao();
//O CODIGO ABAIXO TRAZ OS PRODUTOS D BANCO DE DADOS PREENCHE UM ARRAYLIST DE PRODUTOS E RETORNA ESSE ARRAYLIST

    public ArrayList<Produto_modelo> buscarprodutos() {

        ArrayList<Produto_modelo> produtos = new ArrayList<>();

        try {
            this.conexao = con.abricConecxao();
            String sql = "select * from produto order by nome";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                Produto_modelo produto = new Produto_modelo();
                produto.setCod_produto(resultado.getInt("cod_produto"));
                produto.setNome(resultado.getString("nome"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setValor_compra(resultado.getDouble("valor_compra"));
                produto.setValor_venda(resultado.getDouble("valor_venda"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setQuantidademinima(resultado.getInt("quantidade_minima"));
                produto.setTipo(resultado.getString("tipo"));
                produto.setDatacad(resultado.getDate("datacad") + "");
                produto.setData_validade(resultado.getDate("datavalidade") + "");
                produto.setHoracad(resultado.getTime("horacad") + "");

                produtos.add(produto);
            }

            return produtos;
        } catch (Exception e) {
            System.out.println("erro no dao " + e);
            return null;
        }
    }
//O CODIGO ABAIXO FAZ UMA PESQUISA POR UM PRODUTO ATRAVES DO ID QUE É RECEBIDO COMO PARAMETRO E REMOVE ESSE PRODUTO

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
        } finally {
            con.fecharConecxao(conexao);
            return result;
        }

    }

    //OCODGO ABAIXO RECEBE UM OBJETO PRODUTO MODELO E ATUALIZA O BANCO DE DADOS COMOS DADOSDO PRODUTO MODELO RECEBIDO
    public boolean atualizar_Produto(Produto_modelo produto) {
        boolean result = false;
        try {
            this.conexao = con.abricConecxao();
            String sql = "update produto set nome = '" + produto.getNome() + "' ,descricao = '" + produto.getDescricao() + "',valor_compra = " + produto.getValor_compra() + ",valor_venda =" + produto.getValor_venda() + ",quantidade=" + produto.getQuantidade() + ",tipo='" + produto.getTipo() + "',datacad='" + produto.getDatacad() + "',horacad='" + produto.getHoracad() + "',quantidade_minima=" + produto.getQuantidademinima() + ",datavalidade='" + produto.getData_validade() + "'where cod_produto = " + produto.getCod_produto() + ";";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            result = preparo.execute();

        } catch (SQLException e) {
            System.out.println("erro no sql atualizar" + e);
            return false;
        } finally {
            con.fecharConecxao(conexao);
            return result;
        }
    }

// OCODIGO ABAIXO RRECEBE UM OBJETO PRODUTO MODELOE INSERE ELE NO BANCODE DADOS
    public boolean inserir_Produto(Produto_modelo produto) {
        boolean result = false;
        try {
            this.conexao = con.abricConecxao();
            String sql = "INSERT INTO `produto` ( `nome`, `descricao`, `valor_compra`, `valor_venda`, `quantidade`, `tipo`, `datacad`, `horacad`, `quantidade_minima`,`datavalidade`)VALUES( '" + produto.getNome() + "', '" + produto.getDescricao() + "', " + produto.getValor_compra() + ", " + produto.getValor_venda() + ", " + produto.getQuantidade() + ", '" + produto.getTipo() + "', '" + produto.getDatacad() + "', '" + produto.getHoracad() + "', " + produto.getQuantidademinima() + ",'" + produto.getData_validade() + "');";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            result = preparo.execute();

        } catch (SQLException e) {
            System.out.println("errono sql inserir" + e);
            return false;
        } finally {
            con.fecharConecxao(conexao);
            return result;
        }
    }

}
