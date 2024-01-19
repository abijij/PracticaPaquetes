package org.abijij.app.jardin;
import org.abijij.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

    public String comer(Persona persona){
        return persona.daDeComer();
    }
}
