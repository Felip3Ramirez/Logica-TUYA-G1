package notasdeclase;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int [] edades =new int[6];
        int i =0;

        while (i <= edades.length){
            System.out.println(" Ingrese una edad :");
            edades[i]= sc.nextInt();

            i++;
        }
        int promedio = 0;
        int suma = 0;

        while (i <= edades.length){
            suma = suma + edades[i];
            i++;
        }
        promedio = suma / edades.length;
        System.out.println("Promedio :"+promedio);
    }
}
