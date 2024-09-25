package ejercicios;

import java.util.Scanner;

public class MatrizAlex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombreProducto = new String[5];

        int idProducto = 0;
        double precio = 0;
        int cantidad = 0;
        boolean estado = true;

        for (int i=0;i< nombreProducto.length;i++){
            System.out.println("Ingrese el Nombre del Producto :");
            nombreProducto[i]=sc.next();
        }
        System.out.println("Productos Ingresados");
        for (int i=0;i<nombreProducto.length;i++){
            System.out.println(nombreProducto[i]);
        }



    }
}
