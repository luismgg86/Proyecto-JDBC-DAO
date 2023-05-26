
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao =  new UsuarioDAO();
        
        //Usuario usuarioInsertar =  new Usuario("luis.gonz","234");
        
        Usuario usuarioEliminar = new Usuario(3);
        
        System.out.println("Numero de usuarios eliminados: " + usuarioDao.eliminar(usuarioEliminar));
    
        List<Usuario> usuarios = usuarioDao.seleccionar();
    
        for (Usuario usuario : usuarios){
            System.out.println("usuario = " + usuario);
        }
    }
   
}
