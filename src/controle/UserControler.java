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
       String result="";
       try {
           User p1 = new User();
           UserDao pd1 = new UserDao();
           ResultSet rs = pd1.dBusca(user,senha);
 
               while(rs.next()){
                p1.setCpf(rs.getString("cpf"));
                p1.setNome(rs.getString("nome"));
                p1.setUser(rs.getString("usuario"));
                p1.setPassword(rs.getString("senha"));
                p1.setTipo(rs.getString("tipo"));
                if((p1.getUser().equals(user))&&(p1.getPassword().equals(senha))&&(p1.getTipo().equals("adm"))){
                  
                     result =  "adm";
               }else if((p1.getUser().equals(user))&&(p1.getPassword().equals(senha))&&(p1.getTipo().equals("caixa"))){
                  
                     result =  "caixa";
               }else if((p1.getUser().equals(user))&&(p1.getPassword().equals(senha))&&(p1.getTipo().equals("gerente"))){
                  
                     result =  "gerente";
               }else if((p1.getUser().equals(user))&&(p1.getPassword().equals(senha))&&(p1.getTipo().equals("almoxarife"))){
                  
                     result =  "almoxarife";
               }else{
                    System.out.println("usuario invalido");
               }
           }
           
           return result;
       } catch (SQLException e) {
           System.out.println("erro "+e);
           return "usuario invalido";
       }
   }
   
   public boolean redefinirSenha(String cpf,String usuario,String senha){
        boolean result=false;
        
        User p1 = new User();
        UserDao pd1 = new UserDao();
        result = pd1.dUpdate(cpf, usuario, senha);
        System.out.println(result);
        return result;
       
   }
}



