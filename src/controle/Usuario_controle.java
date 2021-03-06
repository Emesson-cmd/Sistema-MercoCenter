/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Usuario_Dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario_Modelo;

/**
 *
 * @author T.I
 */
public class Usuario_controle {
    
//    NESSE METODO ELE RECEBE COMO PARAMETRO O USUARIO E A SENHA DA CAMADA VIW E O RETORNA UM OBJETO
//    DE MODELO DE PRODUTO COM OS DADOS QUE VINHERAM DA CAMADA DAO E FORMAR REPASSADOS DA CAMADA MODEL 
    public Usuario_Modelo efetuarLogin(int user, String senha) {
        try {
            ArrayList<Usuario_Modelo> users = new ArrayList<Usuario_Modelo>();
            Usuario_Modelo usuario = new Usuario_Modelo();
            users = usuario.logar(user, senha);
            for (int i = 0; i < users.size(); i++) {
                if ((users.get(i).getCod_usuario() == user) && (users.get(i).getSenha().equals(senha))) {
                    usuario.setCod_usuario(users.get(i).getCod_usuario());
                    usuario.setFuncionario_cod_funcionario(users.get(i).getFuncionario_cod_funcionario());
                    usuario.setNome(users.get(i).getNome());
                    usuario.setPermissao(users.get(i).getPermissao());
                    usuario.setSenha(users.get(i).getSenha());
                    usuario.setAtivo(users.get(i).getAtivo());
                }if (users.get(i).getCod_usuario() == 0){
                    usuario=users.get(i);
                } else {
                    

                }
                return usuario;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos(s). Tente Novamente!");
        }
        return null;
    }

    //    NESSE METODO ELE RECEBE COMO PARAMETRO O USUARIO E A SENHA DA CAMADA VIW E RETORNA UM DADO BOOLEANO 
    public boolean efetuarLoginAdm(int user, String senha) {
        ArrayList<Usuario_Modelo> users = new ArrayList<Usuario_Modelo>();
        boolean result = false;
        Usuario_Modelo u = new Usuario_Modelo();
        users = u.logarAdm(user, senha);
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getCod_usuario() == user) && (users.get(i).getSenha().equals(senha)) && (users.get(i).getPermissao().equals("adm"))) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;

    }
    
//    NESSE METODO ELE SERVE PARA REPASSAR OS DADOS QUE VEM DE MODELO PARA VIW ELE RECEBE 
//    O CODIGO DO FUNCIONARIO O NOVO USUARIO E A NOVA SENHHE
    public boolean RedefinirUsuario(int usuario, String senha, int cod_funcionario) {
        ArrayList<Usuario_Modelo> users = new ArrayList<Usuario_Modelo>();
        boolean result = false;
        Usuario_Modelo u = new Usuario_Modelo();
        users = u.listarUsuariosidfun(cod_funcionario);
        if(users.size()==0){
            JOptionPane.showMessageDialog(null, "o id informado não e compativelcom nhenhum funcionario");
            return false;
        }else{
            return new Usuario_Modelo().Redefinirsenha(usuario, senha, cod_funcionario);
        }
       
        
        

    }

    // Retorna todos os usuários do banco de dados
    public ArrayList<Usuario_Modelo> buscarUsuarios() {
        return new Usuario_Modelo().listarUsuarios();
    }
    
    // Chama método em Usuario_Dao que Adiciona usuário no banco de dados
    public void adicionarUsuario(Usuario_Modelo usuario_modelo){
        Usuario_Dao usuario_dao = new Usuario_Dao();
        usuario_dao.adicionarUsuario(usuario_modelo);
    }
    
    // Chama método em Usuario_Dao que Adiciona usuário no banco de dados - semfuncionario
    public void adicionarUsuarioSemFuncionario(Usuario_Modelo usuario_modelo){
        Usuario_Dao usuario_dao = new Usuario_Dao();
        usuario_dao.adicionarUsuarioSemFuncionario(usuario_modelo);
    }
    
    // Chama método em Usuario_Dao que Atualiza usuário no banco de dados
    public void atualizarUsuario(Usuario_Modelo usuario_modelo){
        boolean temUsuario = false;
        ArrayList<Usuario_Modelo> usuarios = new Usuario_Modelo().listarUsuarios();
        
        for (int i = 0; i < usuarios.size(); i++){
            if (usuario_modelo.getCod_usuario() == usuarios.get(i).getCod_usuario()) {
                Usuario_Dao usuario_dao = new Usuario_Dao();
                usuario_dao.atualizarUsuario(usuario_modelo);
                temUsuario = true;
            } 
        }  
        
        if (temUsuario == false){
            JOptionPane.showMessageDialog(null, "Usuário não pôde ser atualizado pois não existe. Por favor, crie um usuário antes de atualiza-lo.");
        }
        
    }
    
    // Chama método em Usuario_Dao que Deleta usuário no banco de dados
    public void deletarUsuario(int codigo_usuario){
        Usuario_Dao usuario_dao = new Usuario_Dao();
        usuario_dao.deletarUsuario(codigo_usuario);
    }
}
