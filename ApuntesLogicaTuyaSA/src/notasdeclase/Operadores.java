package notasdeclase;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //operadores aritmeticos (+,-,*,/,%,)

        int data = (100/4) * 25 + (4*2);

        //Operadores de comparacion (<,>,==,<=,>=)
        int clave = 1234;
        int claveUser = 1234;

        if (clave == claveUser){
            System.out.println("tiene acceso");
        }

        //--------------------
        float estatura = 1.76f;
        float estaturaIngresada = 1.80f;

        if ( estatura  > estaturaIngresada){
            System.out.println("cobrar 5000");
        }else {
            System.out.println("no paga nada");
        }

        //Operadores logicos

        float estatura1 = 1.50f;
        float estaturaIngre = 1.60f;
        int edad = 18;
        int edadIngre = 19;

        if (estaturaIngre > estatura1 && edadIngre >= edad){
            System.out.println("Bienevenido");
        }else {
            System.out.println("Acceso prohibido");
        }

        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingresee el segundo numero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println(num1+" + "+num2+ "\n"+" = "+suma);


    }
}
