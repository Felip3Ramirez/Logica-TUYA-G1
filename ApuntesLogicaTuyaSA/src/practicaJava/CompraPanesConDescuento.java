package practicaJava;

import java.util.Scanner;

public class CompraPanesConDescuento {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cantPiezas=0;
        double totalPago=0;
        System.out.println("Ingrese la cantidad de piezas de pan a comprar");
        cantPiezas= sc.nextInt();
        if(cantPiezas>=50 && cantPiezas<100){
            totalPago=cantPiezas*4.5;
        } else if (cantPiezas>=100) {
            totalPago=cantPiezas*4;
        }else{
            totalPago=cantPiezas*5;
        }
        System.out.println("El cliente compro "+cantPiezas+" piezas de pan");
        System.out.println("El total a pagar es :"+totalPago);
    }
}
