package practicaJava;

import java.util.Scanner;

public class PracticaArray {
    public static void main(String[] args) {
        String [] apellidos = new String [5];

        apellidos [0] ="labrada";
        apellidos [1] ="Garcia";
        apellidos [2] ="Lopez";
        apellidos [3] ="Martinez";
        apellidos [4] ="Cardona";

        for(int i=0; i<apellidos.length; i++){
            System.out.println(apellidos[i]);
        }
        Scanner sc = new Scanner(System.in);
        int [] precios = new int [3];

        for(int i=0; i<precios.length; i++) {
            System.out.println("Dame el precio");
            precios[i] = sc.nextInt();
        }
        for(int i=0; i<precios.length; i++) {
            System.out.println((i+1)+": Precio"+"\n"+precios [i]);
        }
        int suma=0;
        for(int i=0;i< precios.length;i++){
            suma=suma+precios[i];
        }
        System.out.println("Suma de los precios "+suma);


        double promedio = suma/ precios.length;
        System.out.println("Promedio :"+promedio);
    }
}
