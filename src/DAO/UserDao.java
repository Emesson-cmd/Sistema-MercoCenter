package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class UserDao {
 public Connection conexao =null;
 Conecxao con = new Conecxao();
    public UserDao(){
        
        
    }
   
    
    
    public ResultSet dBusca(String user,String senha) throws SQLException{
        String sql = "select * from usuario where usuario ='"+user+"' and senha='"+senha+"'";
        try {
            this.conexao= con.abricConecxao();
            
            PreparedStatement preparo= conexao.prepareStatement(sql);
            ResultSet resultado = preparo.executeQuery(); 
            return resultado; 
            
            
            
        } catch (SQLException e) {
            System.out.println("o resultado foi false por conta do erro "+e);
            return null;        
        }
      
    
         
    }
}
