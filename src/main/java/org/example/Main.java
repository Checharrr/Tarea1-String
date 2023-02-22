package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! por favor ingresa tu nombre, profesión y nacionalidad: ");
        String cadena = sc.nextLine();
        sc.close();

        String[] partes =
                cadena.split(" ");
        String nombre = partes[0].toUpperCase();
        String profesion = partes[1].toUpperCase();
        String pais = partes[2].toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("País: " + pais);
    }
}





