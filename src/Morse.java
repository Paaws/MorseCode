import java.util.HashMap;
import java.util.Map;

public class Morse {

    public static void morseToEnglish(String[] code,
                                      String morseCode)
    {
        //morse code to English Hashmap
        Map<String, Character> morseToEnglish
                = new HashMap<>();
        // Map value allocation
        for (int i = 0; i < 26; i++) {
            morseToEnglish.put(code[i], (char)('A' + i));
        }
        //Split morse code in array of string
        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode + " to English is ");
        //Morse code to English
        for (int i = 0; i < array.length; i++) {
            System.out.print(morseToEnglish.get(array[i]) + " ");
        }
    }
    public static void englishToMorse(String[] code,
                                      String englishLang)
    {
        for (int i = 0; i < englishLang.length(); i++) {
            System.out.print(
                    code[englishLang.charAt(i) - 'A'] + " ");
        }
    }

}
