/*
CLASSE UTILIZADA PARA ACESSO AO DADOS REFERENTE AO LOGIN DE USUARIO

 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario_Modelo;

/**
 *
 * @author JOSÉ ULISSES DA SILVA
 */
public class Usuario_Dao {

//    DOIS OBJETOS QUE SERVEM PARA ABRIR E FECHAR A CONEXÃO
    private Conexao con = new Conexao();
    private Connection conexao = null;

    // Retorna uma lista de todos os usuários do banco de dados
    public ArrayList<Usuario_Modelo> buscarUsuarios() {

        ArrayList<Usuario_Modelo> usuarios = new ArrayList();

        try {
            this.conexao = con.abricConecxao();
            String sql = "select * from usuario";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                Usuario_Modelo usuario = new Usuario_Modelo();

                usuario.setCod_usuario(resultado.getInt("usuario.cod_usuario"));
                usuario.setSenha(resultado.getString("usuario.senha"));
                usuario.setPermissao(resultado.getString("usuario.permissao"));
                usuario.setFuncionario_cod_funcionario(resultado.getInt("usuario.funcionario_cod_funcionario"));
                usuario.setNome(resultado.getString("usuario.nome"));
                usuario.setAtivo(resultado.getInt("usuario.ativo"));

                usuarios.add(usuario);
            }

            return usuarios;
        } catch (Exception e) {
            System.out.println("Erro no DAO ao tentar alimentar o array de usuários: " + e);
//            return null;
            return usuarios;
<<<<<<< HEAD
        }finally{
            con.fecharConecxao(conexao);
=======
>>>>>>> origin/main
        }
    }

//METODO QUE REALIZA A BUSCA DOS DADOS NO BANCO E RETORNA UM ARRAY LIST DE USUARIO MODELO COM OS DADOS
    public ArrayList<Usuario_Modelo> buscar(int user, String senha) {

        ArrayList<Usuario_Modelo> usuarios = new ArrayList<>();

        try {
            this.conexao = con.abricConecxao();
            String sql = "select * from usuario where cod_usuario=" + user + " and senha=" + senha + "";
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();

            while (resultado.next()) {
                Usuario_Modelo usuario = new Usuario_Modelo();
                usuario.setCod_usuario(resultado.getInt("cod_usuario"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setPermissao(resultado.getString("permissao"));
                usuario.setFuncionario_cod_funcionario(resultado.getInt("funcionario_cod_funcionario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setAtivo(resultado.getInt("ativo"));

                usuarios.add(usuario);

            }

            return usuarios;
        } catch (Exception e) {
            System.out.println("erro ba busca " + e);
            Usuario_Modelo usuario = new Usuario_Modelo(0, "2", "a", 1, "aaa", 1);
            usuarios.add(usuario);
            return usuarios;
        }finally{
            con.fecharConecxao(conexao);
        }

    }
    
//    METODO UTILIZADO PARA ATUALIZAR OS DADOS DE USUARIO
    public boolean Update(int usuario, String senha, int cod_funcionario) {
        try {
            this.conexao = con.abricConecxao();
            String sql = ("UPDATE usuario SET cod_usuario=" + usuario + " , senha=" + senha + " WHERE funcionario_cod_funcionario=" + cod_funcionario + ";");;
            PreparedStatement preparo = this.conexao.prepareStatement(sql);
            preparo.executeUpdate();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "acesso negado");
            return false;
        }finally{
            con.fecharConecxao(conexao);
        }

    }

    // Adiciona um novo usuário no banco de dados
    public void adicionarUsuario(Usuario_Modelo usuario) {
        String sql = "insert into usuario (cod_usuario, senha, permissao, funcionario_cod_funcionario, nome, ativo)"
                + "values"
                + "(?, ?, ?, ?, ?, ?)";

        try {
            this.conexao = con.abricConecxao();
            PreparedStatement preparo = this.conexao.prepareStatement(sql);

            preparo.setInt(1, usuario.getCod_usuario());
            preparo.setString(2, usuario.getSenha());
            preparo.setString(3, usuario.getPermissao());
            preparo.setInt(4, usuario.getFuncionario_cod_funcionario());
            preparo.setString(5, usuario.getNome());
            preparo.setInt(6, usuario.getAtivo());

            int confirmacaoDeInsercap = preparo.executeUpdate();

            if (confirmacaoDeInsercap < 0) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao tentar aicionar um novo usuário!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Houve um erro ao  tentar executar método de adicionar usuário no banco de dados: \n" + e);
<<<<<<< HEAD
        }finally{
            con.fecharConecxao(conexao);
=======
>>>>>>> origin/main
        }
    }

    // Atualiza um usuário no banco de dados
    public void atualizarUsuario(Usuario_Modelo usuario) {
        String sql = "update usuario set "
                + "cod_usuario = ?, "
                + "senha = ?, "
                + "permissao = ?,"
                + "nome = ?, "
                + "ativo = ? "
                + "where funcionario_cod_funcionario = ?";

        try {
            this.conexao = con.abricConecxao();
            PreparedStatement preparo = this.conexao.prepareStatement(sql);

            preparo.setInt(1, usuario.getCod_usuario());
            preparo.setString(2, usuario.getSenha());
            preparo.setString(3, usuario.getPermissao());
            preparo.setString(4, usuario.getNome());
            preparo.setInt(5, usuario.getAtivo());
            preparo.setInt(6, usuario.getFuncionario_cod_funcionario());

            int confirmacaoDeAtualizacao = preparo.executeUpdate();
            System.out.println("Numero da confirmação de atualização: " + confirmacaoDeAtualizacao);

            if (confirmacaoDeAtualizacao < 0) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao tentar atualizar um usuário!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Houve um erro ao  tentar executar método de atualizar usuário no banco de dados: \n" + e);
<<<<<<< HEAD
        }finally{
            con.fecharConecxao(conexao);
=======
>>>>>>> origin/main
        }
    }

    // Deleta um usuário no banco de dados usando como parâmetro o cod_usuario
    public void deletarUsuario(int cod_usuario) {
        String sql = "delete from usuario where cod_usuario = " + cod_usuario;

        try {
            conexao = con.abricConecxao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            int confirmacao = pst.executeUpdate();

            if (confirmacao < 0) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao tentar excluir um usuário no banco de dados");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            System.out.println("Houve um erro ao  tentar executar método de excluir usuário no banco de dados: \n" + e);
<<<<<<< HEAD
        }finally{
            con.fecharConecxao(conexao);
=======
>>>>>>> origin/main
        }
    }
}