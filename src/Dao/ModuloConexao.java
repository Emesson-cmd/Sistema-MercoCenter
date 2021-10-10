/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author emesson
 */
public class ModuloConexao {
    // método responsável por estabelecer conexão com o banco
    public static Connection conector() {
        // estou indicando que a conexão ainda não existe ou se existe eu a estou 
        // fechando para nao haver varias conexões abertas
        java.sql.Connection conexao = null;

        // a linha abaixo chama o driver importado na biblioteca
        String driver = "com.mysql.jdbc.Driver";

        // armazenando informações refentes ao banco
        String url = "jdbc:mysql://localhost:3306/mercocenter";
        String user = "root";
        String password = "";

        // Estabelecendo conexão com o banco
        try {
            // executa o driver
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para mostrar o erro específco ao se conectar o banco de dados
            System.out.println(e);
            return null;
        }
    }
}
