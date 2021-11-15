/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
// O CODIGOA ABAIXO FAZ AS IMPORTAÇÕES NECESSARIAS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSÉ ULISSES DA SILVA FILHO
 */
public class Conexao {
// O CODIGO ABAIIXO ABRE A CONEXÃO COM O BANCO DE DADOS SQL E RETORNA ESSA CONEXÃO
    public Connection abricConecxao() throws SQLException {
        Connection conexao = null ;
        try {
            final String url = "jdbc:mysql://localhost:3306/bancomercado";
            final String user = "root";
            final String password = "";
            final String Driver = "com.mysql.cj.jdbc.Driver";

<<<<<<< HEAD
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, password);
=======
            } catch (Exception e) {
                System.out.println("O driver expecificado nao foi encontrado." + e);
                return null;
            }
        return  conexao;
>>>>>>> origin/main

        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        }
        return conexao;

    }
// O CODIGO ABAICHO RECEBE UMA CONEXÃO E FECHA ESSA CONEXÃO 
    public boolean fecharConecxao(Connection con) {
      boolean retorno = false;
            if (con != null) {
                try {
                    con.close();
                    retorno= true;
                } catch (SQLException e) {
                    System.out.println("Não foi possivel fechar conexão " + e);
                    retorno= false;
                   
                }
            
            }
          return  retorno;
    }
<<<<<<< HEAD
}
=======
    
     
    
}
>>>>>>> origin/main
