/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author T.I
 */
public class Conexao {
    public Connection abricConecxao() throws SQLException{
        Connection conexao;
        try {
                final String url="jdbc:mysql://localhost:3306/bancomercado";
                final String user="root";
                final String password="";
                final String Driver="com.mysql.cj.jdbc.Driver";

                Class.forName(Driver);
                conexao = DriverManager.getConnection(url, user, password);

            } catch (Exception e) {
                System.out.println("O driver expecificado nao foi encontrado." + e);
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
