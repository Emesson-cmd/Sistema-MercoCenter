package controle;

import Dao.UserDao;
import modelo.Pessoa;
import java.sql.SQLException;
import java.sql.*;
import modelo.User;
/*
 *
 * @author sulis
 */
public class UserControler {

   public String logar(String user, String senha){
       String result=" ";
       try {
           User p1 = new User();
           UserDao pd1 = new UserDao();
           ResultSet rs = pd1.dBusca(user,senha);
 
               while(rs.next()){
                p1.setId(rs.getInt("id"));
                p1.setUser(rs.getString("usuario"));
                p1.setPassword(rs.getString("senha"));
                if((p1.getUser().equals(user))&&(p1.getPassword().equals(senha))){
                  
                     result =  "deu certo";
               }else{
                     result = "deu errado";
                
               }
               
               
           }
           
           return result;
           
           
            
       } catch (SQLException e) {
           return "ouve um erro no controle "+e;
       }
       }
       
   }



