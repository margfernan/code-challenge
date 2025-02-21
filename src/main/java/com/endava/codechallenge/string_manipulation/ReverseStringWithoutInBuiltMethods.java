package com.endava.codechallenge.string_manipulation;

/* 1.	Reverse a string without using built-in functions. */
public class ReverseStringWithoutInBuiltMethods {


    public static void main(String[] args) {

        String mensaje = "lo doy vuelta";

        reserveStringUsingFor(mensaje);
        reserveStringUsingWhile(mensaje);

    }

    private static void reserveStringUsingFor(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = mensaje.length() -1 ; i >=0; i--) {
            sb.append(mensaje.charAt(i));
        }
        System.out.print("********** USING FOR ********************");
        System.out.print("\nMensaje original: " + mensaje + "\n");
        System.out.print("Reverse " + sb + "\n");
    }

    private static void reserveStringUsingWhile(String mensaje) {
        int i =mensaje.length() - 1 ; // ultima posicion
        StringBuilder sb = new StringBuilder();
        while (i >=0) {
            sb.append(mensaje.charAt(i));
            i--;
        }
        System.out.print("********** USING WHILE ********************");
        System.out.print("\n" + "Mensaje original using while: " + mensaje + "\n");
        System.out.print("Reverse " + sb);
    }
}
