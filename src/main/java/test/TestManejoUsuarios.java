
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao =  new UsuarioDAO();
        
        Usuario usuarioInsertar =  new Usuario("luis.gonz","234");
        
        System.out.println("Numero de usuarios insertados: " + usuarioDao.insertar(usuarioInsertar));
    
        List<Usuario> usuarios = usuarioDao.seleccionar();
    
        for (Usuario usuario : usuarios){
            System.out.println("usuario = " + usuario);
        }
    }
   
}
