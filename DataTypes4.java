public class DataTypes4{
    public static void main(String[] args) {
        
        // ---------- PRIMITIVE DATA TYPES ----------
        
        // 1. byte (1 byte) → Range: -128 to 127
        byte myByte = 20;
        
        // 2. short (2 bytes) → Range: -32,768 to 32,767
        short myShort = 3000;
        
        // 3. int (4 bytes) → Default integer type
        int myInt = 50000;
        
        // 4. long (8 bytes) → Add 'L' at the end
        long myLong = 15000000000L;
        
        // 5. float (4 bytes) → Add 'f' at the end
        float myFloat = 5.75f;
        
        // 6. double (8 bytes) → Default decimal type
        double myDouble = 19.86d;
        
        // 7. char (2 bytes) → Stores a single character
        char myChar = 's';
        
        // 8. boolean (1 bit) → true/false values
        boolean myBool = true;
        
        
        //----------NON-PRIMITIVE DATA TYPE----------
        
        // String → Sequence of characters.
        String myString = "Hello Java!";
        
        
        
        // ---------- DISPLAY ALL VALUES ----------
        
        System.out.println("byte value:"+ myByte);
        System.out.println("short value: " + myShort);
        System.out.println("int value: " + myInt);
        System.out.println("long value: " + myLong);
        System.out.println("float value: " + myFloat);
        System.out.println("double value: " + myDouble);
        System.out.println("char value: " + myChar);
        System.out.println("boolean value: " + myBool);
        System.out.println("String value: " + myString);
    }
}
