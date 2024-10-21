package cl.duoc.cmartinez.apoyoextra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClaseDeApoyo {
    public static void main(String[] args) {
        // instanciación un objeto de tipo Persona
        Persona p1 = new Persona("Carlos", "Martínez", 38);
        Persona p2 = new Persona("Juan", "Perez", 50);
        Persona p3 = new Persona("Luisa", "Garrido", 30);

        List<Persona> linked = new LinkedList<>();

        List<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(new Persona("Susana", "Lara", 60));

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();

        personas.add(new Persona(nombre, apellido, edad));

        for(Persona p : personas) {
            System.out.println("N. Completo: " + p.getNombreCompleto());
            System.out.println("N. Completo Sr/Sra: " + p.getNombreCompleto("Sr/Sra"));
            System.out.println("Edad: " + p.getEdad());
        }
    }
}
