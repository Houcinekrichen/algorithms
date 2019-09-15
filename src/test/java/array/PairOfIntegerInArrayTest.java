package array;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
import static org.junit.Assert.assertThat;

public class PairOfIntegerInArrayTest {

    @Test
    public void firstSolution() {
        assertThat(PairOfIntegerInArray.firstSolution(new int[]{2, 4, 3, 5, 7, 8, 9}, 7), equalTo(2));
        assertThat(PairOfIntegerInArray.firstSolution(new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 7), equalTo(4));
    }

    @Test
    public void secondSolution() {
        assertThat(PairOfIntegerInArray.secondSolution(new int[]{2, 4, 3, 5, 7, 8, 9}, 9), equalTo(2));
        assertThat(PairOfIntegerInArray.secondSolution(new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 10), equalTo(3));
    }

    @Test
    public void thirdSolution() {
        assertThat(PairOfIntegerInArray.thirdSolution(new int[]{2, 4, 3, 5, 7, 8, 9}, 7), equalTo(2));
        assertThat(PairOfIntegerInArray.thirdSolution(new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 7), equalTo(3));
    }
}