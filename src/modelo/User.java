package modelo;

public class User extends Pessoa implements InterPessoa{
 
    public User(){
        
    }
   public User(String user,String nome,String password,String cpf,String tipo){
    
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
        this.password = password;
        this.user = user;
   }
    
    

        
    
}