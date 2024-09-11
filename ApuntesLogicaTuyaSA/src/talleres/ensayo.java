package talleres;

import java.util.Scanner;

public class ensayo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =1;
        while (n1 != 0) {
            System.out.println("Ingrese un numero :");
            n1 = sc.nextInt();
            if (n1 % 2 == 0) {
                System.out.println("Su numero es par :" + n1);
            } else {
                System.out.println("Su numero es impar :" + n1);
            }

        }
    }
}
