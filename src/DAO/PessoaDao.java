package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {
    Connection conexao =null;
    public PessoaDao() throws SQLException{
        try {
            final String url="jdbc:mysql://servidor/banco";
            final String user="usuario";
            final String password="senha";
            final String Driver="com.mysql.jdbc.Driver";
            Class.forName(Driver);
            this.conexao = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            
        }finally{
            
            if(conexao!=null){
                conexao.close();
                System.out.println("conexão encerrada com sucesso");
            }else{
                System.out.println("conexão não pode ser encerrada");
            }
        }
        
    }
    public boolean dBusca(String use,String senha) throws SQLException{
        String user = "";
        String pass = "";
        String sql = "select user,password from pessoa where user ='"+use+"' and password = '"+senha+"'";
        try {
            
            PreparedStatement preparo= conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery();
            
            if(resultado.next()){
                return true;
            }else{
                
                return false;
            }
            
        } catch (SQLException e) {
            System.out.println("o resultado foi false por conta do erro "+e);
            return false;        
        }
      
    
            
    }
}

