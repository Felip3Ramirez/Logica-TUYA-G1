package notasdeclase;

public class While2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100){
            System.out.println(+i);
            i++;
            if (i % 2 == 0){
                System.out.print("el numero es par ");
            }else {
                System.out.print("el numero es inpar ");
            }
        }

    }
}
