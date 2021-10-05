/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sulis
*/

public class Adm extends Pessoa{
 
    public Adm(){
        
    }
    public Adm(String user,String password,int id){
        this.id = (id);

        this.password = (password);
        this.user = (user);
        
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