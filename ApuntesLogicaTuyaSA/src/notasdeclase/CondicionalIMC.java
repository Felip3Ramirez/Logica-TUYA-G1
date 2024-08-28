package notasdeclase;

import java.util.Scanner;

public class CondicionalIMC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double balance = 170000;

        System.out.println("Ingrese el valor de la compra");
        double purchase =in.nextDouble();

        if(purchase > 0 && purchase<=balance){
            System.out.println("Compra exitosa");
            balance -= purchase;
            System.out.println("Su nuevo saldo es " + balance);
        }else if (purchase == 0){
            System.out.println("revisar valor");
        }else {
            System.out.println("saldo insuficiente");
        }
    }
}
