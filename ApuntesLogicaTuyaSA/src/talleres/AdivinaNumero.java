package talleres;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) ;
        int intentos = 0;
        boolean adivinado = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el numero entre 1 y 100");

        while (!adivinado) {
            System.out.print("Que numero piensas que es?: ");
            int suposicion = sc.nextInt();
            intentos++;

            if (suposicion == numeroSecreto) {
                adivinado = true;
                System.out.println("Excelente Lo adivinaste en " + intentos + " intentos, El numero es :"+numeroSecreto);
                if (intentos>=8){
                    System.out.println("No sirves para adivinar y ella te engaña :_)");
                } else if (intentos<8) {
                    System.out.println("Si sirves para adivinar y ella talvez no te engaña :)");
                }
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número es MAYOR. Intenta de nuevo.");
            } else {
                System.out.println("El número es MENOR. Intenta de nuevo.");
            }
        }
    }
}
