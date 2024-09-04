package ejercicios;

import java.util.Scanner;

public class ArrayConPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edades[]=new int[5];
        int i = 0;
        while (i<edades.length){
            System.out.println("ingrese la edad :"+(i+1));
            edades[i]= sc.nextInt();
            i++;
        }
        System.out.println("Edades registradas :"+"\n"+
                edades[0]+"\n"+
                edades[1]+"\n"+
                edades[2]+"\n"+
                edades[3]+"\n"+
                edades[4]+"\n");
        int suma =0;
        int promedio = 0;
        suma = edades[0]+edades[1]+edades[2]+edades[3]+edades[4];
        promedio = suma/ edades.length;
        System.out.println("Tu promedio es de :"+promedio);
    }
}
