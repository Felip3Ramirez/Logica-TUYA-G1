package ejercicios;

import java.util.Scanner;

public class Ordenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = sc.nextInt();

        if (n1>n2){
            System.out.println(n1+" es mayor que "+n2);
        }else if (n2>n1){
            System.out.println(n2+" es mayor que "+n1);
        }

    }
}
