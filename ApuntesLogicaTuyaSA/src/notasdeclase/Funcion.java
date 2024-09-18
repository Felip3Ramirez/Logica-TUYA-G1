package notasdeclase;

import java.util.Scanner;

public class Funcion {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String [] prendas = new String[5];
        String [] preferencias = new String[5];
        guardarPrendas(prendas);
        listarPrendas(prendas);
        preferenciaPrendas(preferencias,prendas);
    }

    public static void guardarPrendas(String[] prendas){
        for (int i= 0;i< prendas.length; i++) {
            System.out.println("Ingrese la prenda "+ (i+1));
            prendas[i]= sc.nextLine();
        }
    }
    public static void listarPrendas(String[] prendas){
        System.out.println("LISTA DE PRENDAS INGRESADAS");
        for (int i=0;i < prendas.length; i++){
            System.out.println(prendas[i]);
        }
    }
    public static void preferenciaPrendas(String[] preferencias,String [] prendas){
        for (int j=0;j< preferencias.length; j++) {
            System.out.println("Especifica si te gusta esta prenda");
            System.out.println(prendas[j]);
            preferencias[j] = sc.nextLine();
        }

            for (int j =0 ;j < preferencias.length; j++) {
                System.out.println(prendas[j]+" : "+preferencias[j]);
            }

    }
}
