
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Morse code by indexing
        String[] code
                = {".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."};

        // Given Strings
        try {
            System.out.println("Please input morse you want to translate");
            String morseCode = scan.nextLine();
            System.out.println("Please input english you want to translate");
            String englishLang = scan.nextLine();

            // morse to English
            Morse.morseToEnglish(code, morseCode);

            System.out.println();

            // English to morse code
            Morse.englishToMorse(code, englishLang);
        } catch (Exception e) {
            System.out.println("Something went wrong, try again!");
        }
    }
}
