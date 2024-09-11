package practicaJava;

import java.util.Random;

public class orden_de_mayor_a_menor {

        public static void main(String[] args) {
            int[] numbers = new int[5];
            Random random = new Random();

            // Generate 5 random numbers
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100); // generate numbers between 0 and 99
            }

            // Sort the numbers using if-else and else-if statements
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    } else if (numbers[i] == numbers[j]) {
                        // do nothing, as the numbers are already equal
                    }
                }
            }

            // Print the sorted array
            System.out.println("Sorted numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }

}
