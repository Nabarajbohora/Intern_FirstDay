package ClassObj;

// ===========================================
// PROGRAM: Check if a string starts with another
// USING: startsWith() method
// ===========================================

public class CheckStartWith {

    public static void main(String[] args) {

        String mainString = "Nepal is a beautiful country.";

        String prefix1 = "Nepal";
        String prefix2 = "nepal";
        String prefix3 = "India";

        System.out.println("=== startsWith() Method ===");

        System.out.println("mainString starts with 'Nepal'? " + mainString.startsWith(prefix1));

        System.out.println("mainString starts with 'nepal'? " + mainString.startsWith(prefix2));

        System.out.println("mainString starts with 'India'? " + mainString.startsWith(prefix3));

        System.out.println("\n=== Case Insensitive Check (ठूलो/सानो नहेर्ने) ===");
        boolean result = mainString.toLowerCase().startsWith(prefix2.toLowerCase());
        System.out.println("Ignore case: 'Nepal' vs 'nepal'? " + result);

        System.out.println("\n=== Check from specific position (index 6) ===");
        System.out.println("From index 6, starts with 'is'? " + mainString.startsWith("is", 6));

    }
}