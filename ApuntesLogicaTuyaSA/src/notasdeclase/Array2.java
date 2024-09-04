package notasdeclase;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] edades= new int[5];
        int i = 0;

        while (i < edades.length){
            System.out.println("ingrese la edad "+ (i+1));
            edades[i]= sc.nextInt();
            i++;
        }
        System.out.println("Edades registradas :"+"\n"+
                edades[0]+"\n"+
                edades[1]+"\n"+
                edades[2]+"\n"+
                edades[3]+"\n"+
                edades[4]+"\n");

    }
}
