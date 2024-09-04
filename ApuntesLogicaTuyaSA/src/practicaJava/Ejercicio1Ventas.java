package practicaJava;

import java.util.Scanner;

public class Ejercicio1Ventas {
    public static void main(String[] args) {
        double ventas[]=new double[30];
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese las 30 ventas del mes");
        for (int i=0;i<ventas.length;i++){
            System.out.println((i+1)+" Venta ");
            ventas[i]=sc.nextDouble();

            }
        int k= 0;
        int total =0;
        System.out.println("Ventas mayores o iguales a $2000");
        while(k<30){
            if (ventas[k]>=2000) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayor a 2000 es :"+total);

    }
}
