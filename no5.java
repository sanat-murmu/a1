// Write a program to implement different methods of the wrapper class.
public class no5 {
    public static void main(String[] args) {
        // Integer Wrapper
        Integer intValue = 100;
        System.out.println("Integer Value: " + intValue);
        System.out.println("String: " + intValue.toString());
        System.out.println("Parsed int: " + Integer.parseInt("200"));
        System.out.println("Max Value: " + Integer.MAX_VALUE);

        // Double Wrapper
        Double doubleValue = 123.45;
        System.out.println("\nDouble Value: " + doubleValue);
        System.out.println("String: " + doubleValue.toString());
        System.out.println("Rounded: " + Math.round(doubleValue));
        System.out.println("Parsed double: " + Double.parseDouble("456.78"));

        // Character Wrapper
        Character charValue = 'b';
        System.out.println("\nCharacter Value: " + charValue);
        System.out.println("Is Letter: " + Character.isLetter(charValue));
        System.out.println("Is Digit: " + Character.isDigit(charValue));
        System.out.println("Uppercase: " + Character.toUpperCase(charValue));
    }
}
