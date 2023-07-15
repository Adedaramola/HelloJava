public class Strings {
    public static void main(String[] args) {
        // Strings are immutable, once created, any changes
        // afterwards are assigned to entirely new strings

        String description = "   He is a good boy";
        description.trim();

        // This will print the initial string
        System.out.println(description);

        description = description.trim();

        // This will output the new changes
        // since the variable was re-assigned
        System.out.println(description);

        // Split strings
        String[] words = description.split(" ");
        System.out.println(words[0]);

        description = description.toUpperCase();
        System.out.println(description);
    }
}
