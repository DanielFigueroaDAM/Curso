package org.example;

public class SentenciaReves {
    public static void main(String[] args) {
        String frase = "hola buenos dias";
        String[] palabras = frase.split(" ");
        for(int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
        System.out.println("--------");
        for(int i = 0; i < palabras.length; i++) {
            char[] palabra = palabras[i].toCharArray();
            for(int j=palabras[i].length() - 1; j >= 0; j--) {
                System.out.print(palabra[j]);
            }
            System.out.print(" ");
        }
    }
}
