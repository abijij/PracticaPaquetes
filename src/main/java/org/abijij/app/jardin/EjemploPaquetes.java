package org.abijij.app.jardin;

import org.abijij.app.hogar.*;

import static org.abijij.app.hogar.Persona.*;

import static org.abijij.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Edgar");
        p.setApellido("Gutierrez");
        p.setColorPelo(RUBIO);
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());

        Perro pe = new Perro();
        pe.nombre = "estopa";
        pe.raza = "corriente";

        String jugando = pe.jugar(p);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoHombre = GENERO_MASCULINO;

        System.out.println("generoHombre = " + generoHombre);

        String generoFemenino = GENERO_FEMENINO;

        System.out.println("generoFemenino = " + generoFemenino);

    }
}
