package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 al 9");

        numero = sc.nextInt();

        for(int contador = 1; contador <= 10; contador ++){
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + " = " + resultado);
        }

    } 


}

