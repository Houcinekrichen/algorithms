package string;

import java.util.Arrays;

/**
 * checks if two Strings are anagrams or not
 */
public class Anagrams {

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) return false;

        for (Character elem : first.toCharArray()) {
            int index = second.indexOf(elem);
            if (index != -1) {
                second = second.substring(0, index) + second.substring(index + 1);
            } else {
                return false;
            }
        }
        return second.isEmpty();
    }

    public static boolean isAnagram2(String first, String second) {
        char[] charactersFirst = first.toCharArray();
        char[] charactersSecond = second.toCharArray();
        Arrays.sort(charactersFirst);
        Arrays.sort(charactersSecond);
        return Arrays.equals(charactersFirst, charactersSecond);
    }

    public static boolean isAnagram3(String first, String second) {
        if (first.length() != second.length()) return false;
        StringBuilder builder = new StringBuilder(second);
        for (Character elem : first.toCharArray()) {
            int index = builder.indexOf("" + elem);
            if (index != -1) {
                builder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return builder.length() == 0;
    }
}
