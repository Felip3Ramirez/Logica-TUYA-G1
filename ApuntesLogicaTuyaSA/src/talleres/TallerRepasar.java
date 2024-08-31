package talleres;

import java.util.Scanner;


public class TallerRepasar {
    static String hola;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("precione 1 para inicializar");
        int iniciar = in.nextInt();

        String userRegi = "";
        int claveRegi = 0;

        double salario = 0;
        double salarioNeto = 0;

        String categoria ="";


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
                    salario = in.nextInt();
                    double descSalud = salario*0.04;
                    double descPension = salario*0.04;
                    int auxtransporte = 100000;
                    if (salario<2600000){
                        salarioNeto = salario-descPension-descSalud+auxtransporte;
                        System.out.println(
                                "Salario de :"+userRegi+"\n"+
                                "Descuento de Salud :"+descSalud+"\n"+
                                "Descuento Pension :"+descPension+"\n"+
                                "Auxuilio de Transporte :"+auxtransporte+"\n"+
                                "Salario :"+salarioNeto);
                    } else if (salario>2600000){
                    salarioNeto = salario-descPension-descSalud;
                        System.out.println(
                                "Salario de :"+userRegi+"\n"+
                                        "Descuento de Salud :"+descSalud+"\n"+
                                        "Descuento Pension :"+descPension+"\n"+
                                        "Salario :"+salarioNeto);

                }
                    break;
                case 4:
                    System.out.println("validar categoria de salario");
                    if (salario<2600000){
                        System.out.println("Sr."+userRegi+" eres categoria A");
                        categoria = "A";
                    }else if(salario>=2600000){
                        System.out.println("Sr."+userRegi+" eres categoria B");
                        categoria = "B";
                    } else if (salario>=3900000) {
                        System.out.println("Sr."+userRegi+" eres categoria C");
                        categoria = "C";
                    }
                    System.out.flush();
                    break;
                case 5:
                    System.out.println("ver datos de usuario");
                    System.out.println(
                            "Sr."+userRegi+"\n"+
                            "salario :"+salarioNeto+"\n"+
                            "Categoria :"+categoria);
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
