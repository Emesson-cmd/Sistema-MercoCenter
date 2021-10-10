package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.User;

public class UserDao {

    User user = new User();

    public Connection conexao = null;

    Conecxao con = new Conecxao();

    public UserDao() {

    }

    public ResultSet dBusca(String user, String senha) throws SQLException {
        /*
            Essa consulta vai retornar o CPF, nome do usuário, nome do login,
            a senha do usuário, o tipo de usuário onde o CPF do usuário
            na tabela log deva coincidir com o CPF do usuário na tabela usuario
         */
        String sql = "select usuario.cpf, usuario.nome, log.usuario,log.senha "
                + ",log.tipo\n from usuario\n inner join log\n on log.user_cpf="
                + "usuario.cpf where log.usuario=\'" + user + "';";
        try {
            this.conexao = con.abricConecxao();

            PreparedStatement preparo = conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();
            return resultado;

        } catch (SQLException e) {
            System.out.println("Será retornado false pois houve um erro:\n" + e);
            return null;
        }
    }

    public boolean dUpdate(String cpf, String usuario, String senha) {
        String sql = "UPDATE log SET usuario='" + usuario + "', senha='" + senha + "' WHERE user_cpf = '" + cpf + "';";

        try {
            conexao = con.abricConecxao();
            Statement preparo = conexao.createStatement();
            // Prepare a statement to insert a record
            // Execute the insert statement
            System.out.println(preparo.executeUpdate(sql));
            return true;
        } catch (Exception e) {
            System.out.println("erro" + e);
            return false;
        }
    }

    /**
     * Esse método é responsável por fazer a busca de usuário no banco de dados
     * retornando todos os seus atributos (nome, cpf, etc). As principais
     * informações que eu quero que sejam retornadas do usuário são: Nome,
     * cargos, status e CPF. Essas informações serão inseridas na tabela
     *
     * @return
     */
    public String dBuscaUsuario(String usuario) throws SQLException {
        String sql = "SELECT usuario.nome, usuario.cpf, log.tipo FROM usuario "
                + "INNER JOIN log ON usuario.cpf = log.user_cpf where usuario.nome = \'" + usuario + "\'";
        ResultSet resultado;

        try {
            this.conexao = con.abricConecxao();
            PreparedStatement preparo = conexao.prepareStatement(sql);
            resultado = preparo.executeQuery();
        } catch (Exception e) {
            System.err.println("O seguinte erro aconteceu: " + e);
            return null;
        }

        String tipo = resultado.getString("tipo");

        this.user.setNome(tipo);

        System.out.println("Tipo do usuário" + tipo);

        return tipo;
    }
}
