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
        }

    }
}
//   

