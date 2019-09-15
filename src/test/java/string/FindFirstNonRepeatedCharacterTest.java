package string;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstNonRepeatedCharacterTest {

    @Test
    public void firstSolution() {
        assertThat(FindFirstNonRepeatedCharacter.firstSolution("swiss"), IsEqual.equalTo('w'));
        assertThat(FindFirstNonRepeatedCharacter.firstSolution("hello"), IsEqual.equalTo('h'));
        assertThat(FindFirstNonRepeatedCharacter.firstSolution("people"), IsEqual.equalTo('o'));
    }

    @Test
    public void secondSolution() {
        assertThat(FindFirstNonRepeatedCharacter.secondSolution("swiss"), IsEqual.equalTo('w'));
        assertThat(FindFirstNonRepeatedCharacter.secondSolution("hello"), IsEqual.equalTo('h'));
        assertThat(FindFirstNonRepeatedCharacter.secondSolution("people"), IsEqual.equalTo('o'));
    }
}