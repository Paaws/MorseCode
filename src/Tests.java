import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testMorseToEnglish() {

        Morse morseToEnglish = new Morse();

        String[] code
                = { ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--..", "|" };
        String morseCode = ".- .--. .";
        morseToEnglish.morseToEnglish(code,morseCode);

        String actual = ".- .--. .";

        assertEquals(morseCode,actual);

    }

    @Test
    public void testEnglishToMorse() {

        Morse englishToMorse = new Morse();

        String[] code = { ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--..", "|" };
        String eng = "APE";
        englishToMorse.englishToMorse(code,eng);


        String actual = ".- .--. .";
        assertEquals(".- .--. .", actual);
    }

    @Test
    public void testInput() {

        String[] code
                = { ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."};

        String morseCode = "-.. .- -.--";
        String englishLang = "Z";


        Morse.morseToEnglish(code, morseCode);

        System.out.println();


        Morse.englishToMorse(code, englishLang);

        assertEquals(englishLang,"Z");
    }
}
