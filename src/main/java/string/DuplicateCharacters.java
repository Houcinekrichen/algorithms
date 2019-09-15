package string;

import java.util.HashMap;
import java.util.Map;

/**
 * print duplicate characters in string.
 */
public class DuplicateCharacters {

    public static void main(String... args) {
        printDuplicateCharacters("test character");
    }

    private static void printDuplicateCharacters(String str) {
        System.out.println("Duplicate characters for " + str);
        Map<Character, Integer> occurrences = new HashMap<>();
        for (Character element : str.toCharArray())
            occurrences.put(element, occurrences.containsKey(element) ? occurrences.get(element) + 1 : 1);
        for (Map.Entry<Character, Integer> element : occurrences.entrySet()) {
            if (element.getValue() > 1) {
                System.out.printf("%s : %d %n", element.getKey(), element.getValue());
            }
        }

    }
}
