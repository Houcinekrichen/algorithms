package string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    @Test
    public void isAnagram() {
        verify();
    }

    @Test
    public void isAnagram2() {
        verify();
    }

    @Test
    public void isAnagram3() {
        verify();
    }

    private void verify() {
        assertTrue(Anagrams.isAnagram("word", "wrdo"));
        assertTrue(Anagrams.isAnagram("mary", "army"));
        assertTrue(Anagrams.isAnagram("stop", "tops"));
        assertTrue(Anagrams.isAnagram("boat", "btoa"));
        assertFalse(Anagrams.isAnagram("pure", "in"));
        assertFalse(Anagrams.isAnagram("fill", "fil"));
        assertFalse(Anagrams.isAnagram("b", "bbb"));
        assertFalse(Anagrams.isAnagram("ccc", "ccccccc"));
        assertTrue(Anagrams.isAnagram("a", "a"));
        assertFalse(Anagrams.isAnagram("sleep", "slep"));
    }
}