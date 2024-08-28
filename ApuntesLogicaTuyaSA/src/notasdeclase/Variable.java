package notasdeclase;

public class Variable {
    public static void main(String []args){
        int idCliente;  //Esto es declarar una valriable

        idCliente =12345678;

        String nombreCliente ="pepito";

        int num1,num2;

        num1=5;
        num2=10;

        byte edad =127;  //limite de rango
        short mesada = 32767; //limite de rango
        short ahorroMesada = mesada;

        // Usar casteo de variables

        int ahorro = (int) ahorroMesada;
        ahorro = ahorro+mesada;
        System.out.println();

        //saque promedio de las edades
        //parceo de variable
        int edad1 = 19;
        String edad2 = "22";

        int edadConver2 = Integer.parseInt(edad2);

        float promedio = (edad1 +edadConver2)/2;

        System.out.println(promedio);

        String promedioConv =promedio+ "";

        System.out.println(promedioConv);

        //tipos de datos

        float nota = 480f;

        long bigNumber = 53562765427l;



    }
}
