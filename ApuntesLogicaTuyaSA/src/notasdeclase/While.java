package notasdeclase;

import java.util.Scanner;


public class While {
    static String hola;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("precione 1 para inicializar");
        int iniciar = in.nextInt();

        String userRegi = "";
        int claveRegi = 0;


        while (iniciar!=0){
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
                    System.out.println("Ingresa Usuario");
                    userRegi = in.next();
                    System.out.println("Ingresa Clave");
                    claveRegi = in.nextInt();
                    break;

                case 2:
                    System.out.println("login");
                    System.out.println("usuario");
                    String usuario = in.next();
                    System.out.println("clave");
                    int clave = in.nextInt();

                    if(userRegi.equals(usuario) && claveRegi==clave){
                        System.out.println("Bienvenido "+userRegi);
                    }else {
                        System.out.println("valida credenciales");
                    }
                    break;
                case 3:
                    System.out.println("calcular salario");
                    System.out.println("Ingrese salario de "+userRegi);
                    double salario = in.nextInt();
                    double descSalud = salario*0.04;
                    double descPension = salario*0.04;
                    int auxtransporte = 100000;
                    double salarioNeto = 0;
                    if (salario<2600000){
                        salarioNeto = salario-descPension-descSalud+auxtransporte;
                        System.out.println(salarioNeto);
                    } else if (salario>2600000){
                    salarioNeto = salario-descPension-descSalud;
                    System.out.println(salarioNeto);

                }
                    break;
                case 4:
                    System.out.println("validar categoria de salario");
                    break;
                case 5:
                    System.out.println("ver datos de usuario");
                    break;

                case 6:
                    System.out.println("Salir");
                    iniciar = 0;
                    break;

                default:
                    break;
            }



        }
    }
}
