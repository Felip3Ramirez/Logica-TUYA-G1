package ejercicios;

import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int points = 0;

        int lifes = 10;

        while (lifes>0 && points < 10){
           // int num = (int)(Math.random()*15+1);
            int num = random.nextInt(20+1);
            if (num%2==0){
                points++;
                System.out.println("+Tienes "+points+" puntos");

            }else {
                lifes--;
                System.out.println("-Pierdes "+lifes+" vidas");
            }

        }
    }
}
