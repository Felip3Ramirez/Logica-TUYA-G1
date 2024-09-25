package notasdeclase;

import java.util.Scanner;

public class FuncionRetorno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double salario = 0;
        double descSalud = 0.04;
        double descPension = 0.04;
        double auxTrans = 162000;
        double salarioNeto = 0;
        double smlv = 1300000;
        int opc =0;
        int salir = 0;



        while (salir != 1){
            System.out.println("1.CAlCULAR DESCUENTO SALUD");
            System.out.println("2.CAlCULAR DESCUENTO PENSION");
            System.out.println("3.CAlCULAR SALARIO NETO");
            System.out.println("4.VALIDAR SI REQUIERE AUXILIO DE TARNSPORTE");
            System.out.println("5.SALIR");
            opc= sc.nextInt();

            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese Salario");
                    salario = sc.nextDouble();
                    salarioNeto=calcularSalarioNeto(salario,auxTrans,smlv,descPension,descSalud);
                    System.out.println("El salario neto es :"+salarioNeto);
                    break;
                case 4:
                    break;
                case 5:
                    salir=1;
                    break;
                default:
                    break;
            }
        }


    }
    //Tuya va a pagar el salario de los nuevos developers, si el nivel del contrato es
    //junior su salario es de 2500000 y si es junior advance es de 3100000
    //se requiere calcular los descuentos de salud y pension si el salario es de 1 a 2 smlv se le debe pagar auxilio de transporte
    //de lo contrario no se le paga auxT
    //cree una funcion que permita calcular el pago a cada uno de los nuevos developers

    public static  double calcularSalud(double salario,double descuentoSalud){
        return salario*descuentoSalud;
    }
    public  static  double calcularPension(double salario,double descuentoPension){
        return salario*descuentoPension;
    }
    public static  double calcularSalarioNeto(double salario, double auxTransporte , double smlv ,double descuentoPension, double descuentoSalud){
        if(salario<=2*smlv){
            return salario - calcularPension(salario,descuentoPension)- calcularSalud(salario,descuentoSalud)+auxTransporte;
        }else {
            return salario - calcularPension(salario, descuentoPension) - calcularSalud(salario, descuentoSalud);
        }
    }
}
