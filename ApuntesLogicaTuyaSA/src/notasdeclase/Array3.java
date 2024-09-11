package notasdeclase;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String [] nombre=new String[4];

        int  i  = 0;
        while (i < nombre.length){
            System.out.println("Ingrese el Nombre :" + (i+1));
            nombre[i]= sc.nextLine();
            i++;
        }

        System.out.println("");
        System.out.println("Nombres Ingresados :");
        System.out.println("");

        for (int f= 0; f< nombre.length;f++){
            System.out.println(nombre[f]);
        }
    }
}
