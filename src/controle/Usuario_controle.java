/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

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
        return new Usuario_Modelo().Redefinirsenha(usuario, senha, cod_funcionario);

    }

}
