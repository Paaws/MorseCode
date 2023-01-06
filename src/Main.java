
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
            // morse to English
            System.out.println("Please input morse you want to translate");
            String morseCode = scan.nextLine();

            if (morseCode.equals("")) {
                throw new Exception("");
            } else {
                Morse.morseToEnglish(code, morseCode);
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("Morse code went wrong!");
        }

        try {
            // English to morse code
            System.out.println("Please input english you want to translate");
            String englishLang = scan.nextLine();

            Morse.englishToMorse(code, englishLang);

        } catch (Exception e) {
            System.out.println("English went wrong!");
        }
    }
}
