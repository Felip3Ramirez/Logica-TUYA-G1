package coffee;

import java.util.Date;
import java.util.Scanner;

public class GroceryStore {

    static Scanner sc = new Scanner(System.in);

    //Users
    static int id;
    static String name;
    static String email;
    static String password;

    //Producto

    static int productId;
    static String productName;
    static double productPrice;
    static double quantity;

    //Venta

    static int ventaId;
    static Date date;

    static String costumer;
    static String product;
    static double price;
    static double quantityToSale;
    static double total;


    static String [] [] costumers = new String[2][4];
    static String [] [] productos = new String[2][4];


    public static void main(String[] args) {
        agregateToCostumers();
        listCostumers();
        agregateToProducts();
        listProduct();


    }

    public static String[] ingresoProduct(){
        String [] producto = new String[4];

        System.out.println("Ingrese ID del Producto");
        productId = sc.nextInt();
        producto[0] = productId+"";

        System.out.println("Ingrese Nombre del Producto");
        productName= sc.next();
        producto[1] = productName;

        System.out.println("Ingrese Precio del Producto");
        productPrice =sc.nextDouble();
        producto[2] =productPrice+"";

        System.out.println("Ingrese Cantidad del Producto");
        quantity =sc.nextDouble();
        producto[3] =quantity+"";

        return producto;
    }
    public static void agregateToProducts(){

        int i= 0;
        while (i<productos.length){

            System.out.println("Producto "+(i+1));
            productos[i] = ingresoProduct();

            i++;
        }


    }

    public static void listProduct(){
        for (int i =0;i<productos.length;i++){
            System.out.println("PRODUCTO "+(i+1));
            for (int j =0;j<productos[i].length;j++){
                System.out.print(productos[i][j]);
                System.out.println("\n");
            }
        }
    }


    public static String[] createCostumer(){
        String [] costumer = new String[4];

        System.out.println("Ingrese ID");
        id = sc.nextInt();
        costumer[0] = id+"";

        System.out.println("Ingrese Nombre");
        name= sc.next();
        costumer[1] = name;

        System.out.println("Ingrese Correo");
        email =sc.next();
        costumer[2] =email;

        System.out.println("Ingrese Contraseña");
        password =sc.next();
        costumer[3] =password;

        return costumer;


    }

    public static void listCostumers(){
        for (int i =0;i<costumers.length;i++){
            System.out.println("CLIENTE "+(i+1));
            for (int j =0;j<costumers[i].length;j++){
                System.out.print(costumers[i][j]);
                System.out.println("\n");
            }
        }
    }

    public static void agregateToCostumers(){

        int i= 0;
        while (i<costumers.length){

            System.out.println("Cliente "+(i+1));
            costumers[i] = createCostumer();

            i++;
        }


    }

    public static void createAdmin(){
        String [] admin = new String[4];

        System.out.println("Ingrese ID");
        id = sc.nextInt();
        admin[0] = id+"";

        System.out.println("Ingrese Nombre");
        name= sc.nextLine();
        admin[1] = name;

        System.out.println("Ingrese Correo");
        email =sc.nextLine();
        admin[2] =email;

        System.out.println("Ingrese Contraseña");
        password =sc.nextLine();
        admin[3] =password;


    }
}
