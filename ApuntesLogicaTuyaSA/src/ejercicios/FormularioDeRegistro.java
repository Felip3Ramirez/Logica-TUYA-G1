package ejercicios;

import java.util.Scanner;

public class FormularioDeRegistro {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("FORMULARIO");
        System.out.println("***********");
        System.out.println("Ingrese ID:");
        int id = leer.nextInt();
        System.out.println("Ingrese NOMBRE:");
        String nombre =leer.nextLine();
        System.out.println("Ingrese APELLIDO:");
        String apellido =leer.nextLine();
        System.out.println("Ingrese GENERO:");
        String genero = leer.nextLine();
        System.out.println("Ingrese EDAD:");
        int edad = leer.nextInt();
        System.out.println("Ingrese TELEFONO:");
        int telefono = leer.nextInt();
        System.out.println("Ingrese ESTATURA:");
        float estatura = leer.nextFloat();
        System.out.println("Ingrese CORREO:");
        String correo = leer.nextLine();
        System.out.println("Ingrese CONTRASEÑA:");
        int contraseña = leer.nextInt();
        System.out.println("Ingrese ESTADO:");
        String estado = leer.nextLine();

        System.out.println("**************");
        System.out.println("TU INFORMACION");
        System.out.println("**************");
        System.out.println("");
        System.out.println(
                "ID :"+id+
                "NOMBRE :"+nombre+"\n"+
                "APELLIDO :"+apellido+"\n"+
                "GENERO :"+genero+"\n"+
                "EDAD :"+edad+"\n"+
                "TELEFONO :"+telefono+"\n"+
                "ESTATURA :"+estatura+"\n"+
                "CORREO :"+correo+"\n"+
                "CONTRASEÑA :"+contraseña+"\n"+
                "ESTADO"+estado+"\n"

        );
    }
}
