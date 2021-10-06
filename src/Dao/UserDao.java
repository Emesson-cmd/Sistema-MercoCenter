package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class UserDao {
 public Connection conexao =null;
 Conecxao con = new Conecxao();
    public UserDao(){
        
        
    }
   
    
    
    public ResultSet dBusca(String user,String senha) throws SQLException{
        String sql = "select usuario.cpf, usuario.nome, log.usuario,log.senha ,log.tipo\n from usuario\n inner join log\n on log.user_cpf=usuario.cpf where log.usuario=\'"+user+"';";
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
    public boolean dUpdate(String cpf,String usuario,String senha){
        String sql = "UPDATE log SET usuario='"+usuario+"', senha='"+senha+"' WHERE user_cpf = '"+cpf+"';";
        
        try {
            conexao = con.abricConecxao();
          Statement preparo = conexao.createStatement();
        // Prepare a statement to insert a record
        // Execute the insert statement
            System.out.println(preparo.executeUpdate(sql));
        return true;
    } catch (Exception e) {
            System.out.println("erro"+e);
        return false;
    }
        
    }
}
