package talleres;

import java.util.Scanner;

public class PruebaConocimientoM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc =0;

        System.out.println("Elije una opcion");
        System.out.println("1 :Par o impar");
        opc=sc.nextInt();

        int i =5;
        int n1 =0;


        switch (opc){
            case 1: {
                while (i == 0) {
                    System.out.println("Ingrese un numero :");
                    n1 = sc.nextInt();
                    if (n1 % 2 == 0) {
                        System.out.println("Su numero es par :" + n1);
                    } else {
                        System.out.println("Su numero es impar :" + n1);
                    }
                    i--;
                }
            } break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

        }
    }
}
