package talleres;

import java.util.Scanner;

public class HotelProyecto {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("-----REGISTRO DE CLIENTES-----");

        String [] tipoHabitacion = {"Basica","Familiar","Ejecutiva"};
        Double [] precioHabitacion = { 50.0 , 90.0 , 120.0};

        String [] nombreCliente = new String[5];
        int[] habiatcionCliente = new int[5];
        int[] diasEstadia = new int[5];
        int cliente=0;
        int opc = 0;
        int salir=1;

        menu(opc,cliente,salir,diasEstadia,nombreCliente,tipoHabitacion,habiatcionCliente,precioHabitacion);






    }
    public static void menu (int opc,int cliente, int salir,int[] diasEstadia, String [] nombreCliente,String [] tipoHabitacion,int[] habiatcionCliente,Double [] precioHabitacion){
        while (salir != 0){
            salir=1;
            System.out.println("1.INGRESAR CLIENTE");
            System.out.println("2.GENERAR FACTURA A CLIENTE");
            System.out.println("3.SALIR");
            opc=sc.nextInt();
            switch (opc){
                case 1:
                    ingresarCliente(cliente,salir,diasEstadia,nombreCliente,tipoHabitacion,habiatcionCliente,precioHabitacion);
                    break;
                case 2:
                    mostrarInfoCliente(cliente,salir,diasEstadia,nombreCliente,tipoHabitacion,habiatcionCliente,precioHabitacion);
                    break;
                case 3:
                    salir=0;
                    break;
                default:
                    System.out.println("Ocion Invalida");
            }
        }
    }

    public static void ingresarCliente (int cliente, int salir,int[] diasEstadia, String [] nombreCliente,String [] tipoHabitacion,int[] habiatcionCliente,Double [] precioHabitacion){
        while (cliente<5&&salir != 0){
            System.out.println("---INGRESAR CLIENTE---");

            System.out.print("Nombre del cliente: ");
            nombreCliente[cliente]=sc.next();

            System.out.println("Tipos de habitación disponibles:");
            for (int j = 0; j < tipoHabitacion.length; j++) {
                System.out.println((j + 1) + ". " + tipoHabitacion[j] + " - $" + precioHabitacion[j] + " por noche");
            }

            System.out.print("Seleccione el tipo de habitación (1-3): ");
            habiatcionCliente [cliente]= sc.nextInt() - 1;

            System.out.print("Número de noches: ");
            diasEstadia[cliente] = sc.nextInt();

            System.out.print("¿Desea registrar otro cliente? (s:1/n:0): ");
            salir = sc.nextInt();

            cliente++;


        }
    }
    public static void mostrarInfoCliente (int cliente, int salir,int[] diasEstadia, String [] nombreCliente,String [] tipoHabitacion,int[] habiatcionCliente,Double [] precioHabitacion){
        for (int i=0;i<cliente; i++ ){
            System.out.println("Cliente :"+nombreCliente[i]);
            System.out.println("Habitacion :"+tipoHabitacion[habiatcionCliente[i]]);
            System.out.println("Noches de Estadia :"+ diasEstadia[i]);

        }

    }
}

