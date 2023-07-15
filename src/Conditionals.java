import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = reader.nextInt();

        if (age < 18) {
            System.out.println("You are not up to the legal age");
        }

        System.out.println("Welcome to our app");

        reader.close();
    }
}
