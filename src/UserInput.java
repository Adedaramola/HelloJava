import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;

        System.out.println("Enter your name: ");
        name = reader.nextLine();
        System.out.println("Your name is " + name);

        reader.close();
    }
}
