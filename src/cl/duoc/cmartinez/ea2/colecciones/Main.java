package cl.duoc.cmartinez.ea2.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        System.out.println("Size = " + lista.size());
        lista.add("Hola");
        lista.add("Bye");
        lista.add("Mundo");
        lista.add("Chile");
        System.out.println("Size = " + lista.size());
        lista.add("Hola");
        System.out.println("Size = " + lista.size());
        System.out.println("Elemento 0 = " + lista.get(0));
        lista.remove("Hola");
        System.out.println("Size = " + lista.size());
        System.out.println("Contains Hola = " + lista.contains("Hola"));
        System.out.println("Contains Adios = " + lista.contains("Adios"));
        System.out.println("IndexOf Mundo = " + lista.indexOf("Mundo"));
        System.out.println("Elemento 0 = " + lista.get(0));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: " + lista.get(i));
        }

        for (String el : lista) {
            System.out.println("Elemento: " + el);
        }

        lista.clear();
        System.out.println("Size = " + lista.size());
    }
}
