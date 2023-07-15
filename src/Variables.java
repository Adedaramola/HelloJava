public class Variables {
    public static void main(String[] args) throws Exception {
        // All data types are signed in java,
        // meaning they can either be positive or negative.

        // Stores from -32,767 to +32,768
        short myAge = 20;

        // Stores from +2,147,483,647 to -2,147,483,648
        int salary = 300000;

        // Group initialization of variables
        double diameter = 40.55, radius = 20.2525;

        // Hold a single character
        // Using single quotes is required
        char firstLetter = 'A';

        // Single quotes are forbidden
        String name = "Adedaramola";

        System.out.println(myAge);
        System.out.println(salary);
        System.out.println(diameter);
        System.out.println(radius);
        System.out.println(firstLetter);
        System.out.println(name);
    }
}
