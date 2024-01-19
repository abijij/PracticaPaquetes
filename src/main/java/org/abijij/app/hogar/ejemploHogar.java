package org.abijij.app.hogar;

import org.abijij.app.jardin.Perro;


import org.abijij.app.hogar.Persona;

import static org.abijij.app.hogar.Persona.saludar;

public class ejemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Edgar");
        p.setApellido("Gutierrez");
        Perro pe = new Perro();
        String comer = pe.comer(p);
        System.out.println(comer);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
    }
}
