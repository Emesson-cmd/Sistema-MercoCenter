package modelo;

public class Pessoa implements InterPessoa{
    private int id;
    private String nome;
    private String user;
    private String password;
 
    public Pessoa(){
        
    }
    public Pessoa(String nome,String user,String password,int id){
        this.id = (id);
        this.nome = (nome);
        this.password = (password);
        this.user = (user);
        
    }
    @Override

    public String getNome() {
        return this.nome;
    }
    @Override

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override

    public String getUser() {
        return this.user;
    }
    @Override

    public void setUser(String user) {
        this.user = user;
    }
    @Override

    public String getPassword() {
        return this.password;
    }
    @Override

    public void setPassword(String password) {
        this.password = password;
    }
    @Override

    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    

        
    
}