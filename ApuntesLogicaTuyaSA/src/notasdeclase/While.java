package notasdeclase;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("precione 1 para inicializar");
        int iniciar = in.nextInt();

        while (iniciar!=0){
            System.out.println("algo");



            System.out.println("Seleccione 1. para crear un usuario");
            System.out.println("Seleccione 2. para iniciar sesion");
            System.out.println("Seleccione 3. para calcular el salario");
            System.out.println("Seleccione 4. para validar su categoria de salario");
            System.out.println("Seleccione 5. para ver datos de usuario");
            System.out.println("Seleccione 6. para salir");
            int opc = in.nextInt();


            switch (opc){
                case 1 :
                    System.out.println("crear usuario");
                    break;

                case 2:
                    System.out.println("login");
                    break;
                case 3:
                    System.out.println("calcular salario");
                    break;
                case 4:
                    System.out.println("validar categoria de salario");
                    break;
                case 5:
                    System.out.println("ver datoa de usuario");
                    break;

                case 6:
                    System.out.println("Salir");
                    iniciar = 0;

                default:
                    break;
            }



        }
    }
}
