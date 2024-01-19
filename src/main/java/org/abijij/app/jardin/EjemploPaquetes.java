package org.abijij.app;
import org.abijij.app.hogar.*;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = " Edgar";
        p.apellido = "Gutierrez";
        System.out.println(p.nombre);
        System.out.println(p.apellido);

        Perro pe = new Perro();
        pe.nombre = "estopa";
        pe.raza = "corriente";


    }
}
