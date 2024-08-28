package ejercicios;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "pp@gmail.com";
        int key =1234;
        String nameUser ="pepito";

        System.out.println("Ingrese su usuario");
        String userInput =sc.next();

        System.out.println("Igrese su password");
        int keyInput = sc.nextInt();

        if (userName.equals(userInput) && key == keyInput){
            System.out.println("Bienvenido " + nameUser);
        }else{
            System.out.println("Valide credenciales");
        }

    }

            
}
