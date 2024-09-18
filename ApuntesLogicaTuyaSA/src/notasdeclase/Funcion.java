package notasdeclase;

import java.util.Scanner;

public class Funcion {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String [] prendas = new String[5];
        String [] preferencias = new String[5];

        menu(preferencias,prendas);

    }

    public static void guardarPrendas(String[] prendas){
        for (int i= 0;i< prendas.length; i++) {
            System.out.println("Ingrese la prenda "+ (i+1));
            prendas[i]= sc.next();
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
            System.out.println("ESPECIFICA SI TE GUSTA ESTA PRENDA");
            System.out.println(prendas[j]);
            preferencias[j] = sc.next();
        }
    }
    public static void listaPreferencias(String[] preferencias, String [] prendas){
        System.out.println("PREFERENCIA DE PRENDAS");
        for (int j =0 ;j < preferencias.length; j++) {
            System.out.println(prendas[j]+" : "+preferencias[j]);
        }
    }
    public static void menu (String[] preferencias, String [] prendas){
        int salir =0;

        while (salir!=5){
            System.out.println("MENU DE PRENDAS Y PREFERENCIAS");
            System.out.println("1. INGRESAR PRENDAS");
            System.out.println("2. MOSTRAR PRENDAS");
            System.out.println("3. INGRESAR PREFERENCIA DE PRENDA");
            System.out.println("4. MOSTRAR PREFERENCIA DE PRENDA");
            System.out.println("5. SALIR");
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    guardarPrendas(prendas);
                    break;

                case 2:
                    listarPrendas(prendas);
                    break;

                case 3:
                    preferenciaPrendas(preferencias,prendas);
                    break;

                case 4:
                    listaPreferencias(preferencias,prendas);
                    break;

                case 5:
                    salir = 5;
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }

    }
}
