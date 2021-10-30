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
import model.Funcionario_modelo;

/**
 *
 * @author emesson
 */
public class Funcionario_Dao {

    Connection conexao = null;
    Conexao con = new Conexao();

    public ArrayList<Funcionario_modelo> buscarFuncionarios() {

        ArrayList<Funcionario_modelo> funcionarios = new ArrayList();

        try {
            this.conexao = con.abricConecxao();
            String sql = "select * from funcionario";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                Funcionario_modelo funcionario = new Funcionario_modelo();
                funcionario.setCod(resultado.getInt(1));
                funcionario.setCelular(resultado.getString(2));
                funcionario.setCpf(resultado.getString(3));
                funcionario.setDatanasc(resultado.getString(4));
                funcionario.setEmail(resultado.getString(5));
                funcionario.setEndereco(resultado.getString(6));
                funcionario.setNome(resultado.getString(7));
                funcionario.setDatacad(resultado.getString(8));
                funcionario.setHoracad(resultado.getString(9));
                funcionario.setNume(resultado.getString(10));
                funcionario.setRg(resultado.getString(11));
                funcionario.setSexo(resultado.getString(12));
                funcionario.setTelefone(resultado.getString(13));
                funcionario.setUf(resultado.getString(14));
                funcionario.setBairro(resultado.getString(15));
                funcionario.setCidade(resultado.getString(16));
                funcionario.setCep(resultado.getString(17));
                
                funcionarios.add(funcionario);
            }

            return funcionarios;
        } catch (Exception e) {
            System.out.println("Erro no DAO ao tentar alimentar o array de funcionários: " + e);
            return null;
        }
    }
}
