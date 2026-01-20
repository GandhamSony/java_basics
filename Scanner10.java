import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        // Float
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        // Double
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Long
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();

        // Short
        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        // Byte
        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        // Boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = sc.nextBoolean();

        // Character
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0);

        sc.nextLine(); // Clear buffer

        // String (single word)
        System.out.print("Enter a single word: ");
        String singleWord = sc.next();

        sc.nextLine(); // Clear buffer

        // String (full line)
        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();

        System.out.println("\n---- OUTPUT ----");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("Character: " + charValue);
        System.out.println("Single Word: " + singleWord);
        System.out.println("Sentence: " + sentence);

        sc.close();
    }
}
