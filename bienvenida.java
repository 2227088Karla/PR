package prog_paradigmas;

import java.util.Scanner;

public class bienvenida {

    //KNGH iCO i2
    public static void main(String[] args) {

        String nombre;
        String apellido;

        Scanner usuario = new Scanner(System.in);
        System.out.println("Hola, ingresa tu nombre:");
        nombre = usuario.next();
        System.out.println("Ingresa tu apellido:");
        apellido = usuario.next();

        System.out.println("bienvenido: " + nombre + " " + apellido);
    }

}
