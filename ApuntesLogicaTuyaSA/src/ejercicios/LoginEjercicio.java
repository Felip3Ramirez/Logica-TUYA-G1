package ejercicios;

import java.util.Scanner;

public class LoginEjercicio {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String userName = "pepito";
        int userClave = 1234;
        int userTel = 313713;

        System.out.println("Ingrese usuario o telefono ");
        System.out.println("usuario");
        String userinput = in.next();
        System.out.println("telefono");
        int telInput = in.nextInt();
        System.out.println("Ingrese clave ");
        int claveInput = in.nextInt();

        if (userName.contains(userinput) && userClave == claveInput || userTel == telInput && userClave == claveInput){
            System.out.println("bienvenido");
        }else{
            System.out.println("Verifique credenciales");
        }



    }
}
