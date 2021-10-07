/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;

/**
 *
 * @author sulis
 */
public class Conecxao {

    // Esse método fará a conexão com o banco de dados
    public Connection abricConecxao() throws SQLException{
        Connection conexao;
        try {
                final String url="jdbc:mysql://localhost:3306/mercocenter";
                final String user="root";
                final String password="";
                final String Driver="com.mysql.jdbc.Driver";

                Class.forName(Driver);
                conexao = DriverManager.getConnection(url, user, password);

            } catch (ClassNotFoundException e) {
                System.out.println("O driver expecificado nao foi encontrado.");
                return null;
            }
        return  conexao;

    } 
    
    public boolean fecharConecxao(Connection con){
        try {
            con.close();
            System.out.println("Conexão fechada");
            return true;
        } catch (Exception erro) {
            System.out.println("Não foi possivel fechar conexão "+erro);
            return false;
        }
    }

}
