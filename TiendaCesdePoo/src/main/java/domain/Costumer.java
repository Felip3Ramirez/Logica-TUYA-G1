package domain;

import java.util.Scanner;

public class Costumer {

 Scanner sc = new Scanner(System.in);
 //Atributos
    int userId;
     String userName;
     String userLastName;
     String userPhone;
     String userEmail;
     String costumerType;
     String userPassword;
     int costumerPoints;

     //Productos
     int productId;
     String productName;
     double productDesct;
     double cost;
     double price;
     int quantity;
     String state;


   Object [][] costumers = new Object[2][];
   Object [] costumer = new Object[8];

   Object [][] productos = new Object[2][];
   Object [] producto = new Object[7];
     //Comportamiento

 public Object[] createUser(){



  System.out.println("Ingrese ID de usuario");
  userId = sc.nextInt();
  costumer [0] = userId;

  System.out.println("Ingrese Nombre del usuario");
  userName = sc.next();
  costumer [1] = userName;

  System.out.println("Ingrese Apellido del usuario");
  userLastName = sc.next();
  costumer [2] = userLastName;

  System.out.println("Ingrese Telefono de usuario");
  userPhone = sc.next();
  costumer [3] = userPhone;

  System.out.println("Ingrese Correo de usuario");
  userEmail = sc.next();
  costumer [4] = userEmail;

  System.out.println("Ingrese Contraseña de usuario");
  userPassword = sc.next();
  costumer [5] = userPassword;

  System.out.println("Ingrese si el usuario es empresa o natural");
  costumerType = sc.next();
  costumer [6] = costumerType;

  System.out.println("Ingrese la cantidad de puntos del usuario");
  costumerPoints = sc.nextInt();
  costumer [7] = costumerPoints;

  return costumer;


 }
 public void agregateCostumer(){
  for (int i=0;i<costumers.length;i++){
   costumers[i] = createUser();
  }
 }
 public void listUser(){
  for (int i =0;i<costumers.length;i++){
   for (int j =0;j<costumers[i].length;j++){
    System.out.print(costumers [i] [j]);
    System.out.println("\n");
   }
  }

 }
 public void selectUser(){
  for (int i=0;i<costumers.length;i++){
   System.out.println( createUser());
  }
 }
 public void updateUser(){

 }
 public void deletUser(){

 }
 public Object[] ingresoProducto(){
  System.out.println("Ingrese ID del Producto");
  productId = sc.nextInt();
  producto [0] = productId;

  System.out.println("Ingrese Nombre del Producto");
  productName = sc.next();
  producto [1] = productName;

  System.out.println("Ingrese Descuento del Producto");
  productDesct = sc.nextDouble();
  producto [2] = productDesct;

  System.out.println("Ingrese Costo del Producto");
  cost = sc.nextDouble();
  producto [3] = cost;

  System.out.println("Ingrese Precio del Producto");
  price = sc.nextDouble();
  producto [4] = price;

  System.out.println("Ingrese Cantidad Existente");
  quantity = sc.nextInt();
  producto [5] = quantity;

  System.out.println("Ingrese Estado del Producto");
  state = sc.next();
  producto [6] = state;


  return producto;
 }


}
