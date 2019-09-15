package array;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MissingNumberInArrayTest {

    @Test
    public void getMissingNumber() {
        assertThat(MissingNumberInArray.getMissingNumber(new int[]{1, 2, 3, 5}, 5), equalTo(4));
        assertThat(MissingNumberInArray.getMissingNumber(new int[]{1, 2, 4, 5, 6, 7}, 7), equalTo(3));
        assertThat(MissingNumberInArray.getMissingNumber(new int[]{1, 2, 4, 5, 6}, 6), equalTo(3));
    }
}