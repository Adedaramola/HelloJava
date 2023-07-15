import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String fib_sequence = "";
        int first = 0, second = 1, fibonacci = 0;
        int numbers;

        System.out.println("How many numbers should be printed: ");
        numbers = reader.nextInt();

        for (int i = 0; i <= numbers; i++) {
            if (numbers <= 1) {
                fibonacci = i;
                fib_sequence += String.valueOf(fibonacci) + " ";
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;

                fib_sequence += String.valueOf(fibonacci) + " ";
            }
        }

        System.out.println(fib_sequence);

        reader.close();
    }
}
