package controle;

import Dao.PessoaDao;
import modelo.Pessoa;
import java.sql.SQLException;
/*
 *
 * @author sulis
 */
public class PessoaControle {

    /*
        Esse método busca você pode passar como parâmetro um usuário e senha.
        Caso a busca feita tenha um registro correspondente no banco de dados
        será retornado a mensagem "deu certo"
    */
   public String busca(String user, String senha){
       try {
           PessoaDao pd1 = new PessoaDao();
            Pessoa p1 = new Pessoa();
            p1.setUser(user);
            p1.setPassword(senha);
            if(pd1.dBusca(p1.getUser(), p1.getPassword())==false){
                return "deu errado";
            }else{
                return "deu certo";
            }
            
       } catch (SQLException e) {
           return "ouve um erro no controle "+e;
       }
    }
}



