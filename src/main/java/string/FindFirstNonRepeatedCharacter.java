package string;

import java.util.*;

/**
 * Java Program to find first duplicate, non-repeated character in a String.
 * time complexity of this solution O(n)
 */
public class FindFirstNonRepeatedCharacter {

    public static void main(String... args) {
        System.out.println(firstSolution("swiss"));
        System.out.println(secondSolution("people"));
    }

    public static Character firstSolution(String given) {
        HashMap<Character, Integer> charOccurs = new LinkedHashMap<>();
        for (char character : given.toCharArray())
            charOccurs.put(character, charOccurs.containsKey(character) ? charOccurs.get(character) + 1 : 1);

        for (Map.Entry<Character, Integer> entry : charOccurs.entrySet())
            if (entry.getValue() == 1) return entry.getKey();

        return null;
    }

    public static Character secondSolution(String given) {
        List<Character> repeating = new ArrayList<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (Character character : given.toCharArray()) {
            if (repeating.contains(character)) {
                continue;
            }
            if (nonRepeating.contains(character)) {
                nonRepeating.remove(character);
                repeating.add(character);
            } else {
                nonRepeating.add(character);
            }
        }
        return nonRepeating.size() != 0 ? nonRepeating.get(0) : null;
    }
}
