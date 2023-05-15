package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();
        
        Persona personaModificar = new Persona(1, "Mario", "Gonzalez", "margon@mail.com", "5566778899");
        Persona personaEliminar = new Persona (7);
//        System.out.println("Numero de registros insertados = " + personaDao.insertar(personaNueva));
        //de esta manera aplicamos el bajo acoplamiento ya que el codigo esta segmentado
        //y cada clase tiene las relaciones minimas con cada una de las otras clase
        //ademas aplicamos alta cohesion ya que cada clase realiza unicamente su tarea
        //el metodo seleccionar retorna una lista de objetos de tipo persona
        System.out.println("Numero de registros eliminados = " + personaDao.eliminar(personaEliminar));
        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
        
    }
}
