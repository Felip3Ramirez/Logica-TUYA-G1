package talleres;

import java.util.Scanner;

public class ComprobarEvaluacion {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int numero;
      while (true){
          System.out.println("introduce un numero ");
          numero= scanner.nextInt();
          if(numero%2 ==0){
              //break;
          }
          if (numero%2==0){
              System.out.println("El numero "+ numero +" es par");
          }else{
              System.out.println("El numero " +numero+" es impar");
              //scanner.close();

              System.out.println("Programa Terminado");

          }

      }
    }
}
