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
import javax.swing.JOptionPane;
import model.Funcionario_modelo;

/**
 *
 * @author emesson
 */
public class Funcionario_Dao {

    Connection conexao = null;
    Conexao con = new Conexao();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    // Desativa funcionário tendo como parâmetro seu código
    public boolean desativarFuncionario(int id){
        String sql = "update funcionario set situacao = \"inativo\" where cod = ?";
        
        try {
            conexao = con.abricConecxao();
            
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);
           
            pst.executeUpdate();
    
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // método responsavel por alterar dados do usuario
    public boolean atualizarFuncionario(Funcionario_modelo funcionario) {

        try {
            this.conexao = con.abricConecxao();

            String sql = "update funcionario set "
                    + "celular=?, cpf=?, datanasc=?, "
                    + "email=?, endereco=?, nome=?, "
                    + "datacad=?, horacad=?, nume=?, "
                    + "rg=?, telefone=?, "
                    + "uf=?, bairro=?, cidade=?, "
                    + "cep=?, cargo=?, situacao=? "
                    + "where cod = ?";

            PreparedStatement pst = this.conexao.prepareStatement(sql);
            
            pst.setString(1, funcionario.getCelular());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getDatanasc());
            pst.setString(4, funcionario.getEmail());
            pst.setString(5, funcionario.getEndereco());
            pst.setString(6, funcionario.getNome());
            pst.setString(7, funcionario.getDatacad());
            pst.setString(8, funcionario.getHoracad());
            pst.setString(9, funcionario.getNume());
            pst.setString(10, funcionario.getRg());
            pst.setString(11, funcionario.getTelefone());
            pst.setString(12, funcionario.getUf());
            pst.setString(13, funcionario.getBairro());
            pst.setString(14, funcionario.getCidade());
            pst.setString(15, funcionario.getCep());
            pst.setString(16, funcionario.getCargo());
            pst.setString(17, funcionario.getSituacao());
            pst.setInt(18, funcionario.getCod());

            int atualizaremFuncionario = pst.executeUpdate();

            if (atualizaremFuncionario > 0) {
                return true;
            }

            return true;
        } catch (Exception e) {
            System.out.println("Erro no DAO ao tentar atualizar o funcionário: " + e);
            return false;
        }

    }

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
                funcionario.setTelefone(resultado.getString(13));
                funcionario.setUf(resultado.getString(14));
                funcionario.setBairro(resultado.getString(15));
                funcionario.setCidade(resultado.getString(16));
                funcionario.setCep(resultado.getString(17));
                funcionario.setCargo(resultado.getString(18));
                funcionario.setSituacao(resultado.getString(19));

                funcionarios.add(funcionario);
            }

            return funcionarios;
        } catch (Exception e) {
            System.out.println("Erro no DAO ao tentar alimentar o array de funcionários: " + e);
            return null;
        }
    }

    // método para adicionar usuários
    public boolean adicionarFuncionario(Funcionario_modelo funcionario) {
        String sqlFuncionario = "INSERT INTO `funcionario` (`celular`, `cpf`, "
                + "`datanasc`, `email`, `endereco`, `nome`, `datacad`, `horacad`, `nume`, "
                + "`rg`, `telefone`, `uf`, `bairro`, `cidade`, `cep`, `cargo`, `situacao`) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            this.conexao = con.abricConecxao();

            pst = conexao.prepareStatement(sqlFuncionario);

            pst.setString(1, funcionario.getCelular());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getDatanasc());
            pst.setString(4, funcionario.getEmail());
            pst.setString(5, funcionario.getEndereco());
            pst.setString(6, funcionario.getNome());
            pst.setString(7, funcionario.getDatacad());
            pst.setString(8, funcionario.getHoracad());
            pst.setString(9, funcionario.getNume());
            pst.setString(10, funcionario.getRg());
            pst.setString(11, funcionario.getTelefone());
            pst.setString(12, funcionario.getUf());
            pst.setString(13, funcionario.getBairro());
            pst.setString(14, funcionario.getCidade());
            pst.setString(15, funcionario.getCep());
            pst.setString(16, funcionario.getCargo());
            pst.setString(17, funcionario.getSituacao());

            // a linha abaixo executa uma atualização do banco de dados com os dados do formulário
            pst.executeUpdate();

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
