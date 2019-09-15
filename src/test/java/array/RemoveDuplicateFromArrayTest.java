package array;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class RemoveDuplicateFromArrayTest {

    @Test
    public void removeDuplicates() {
        assertThat(RemoveDuplicateFromArray.removeDuplicates(new int[]{1, 1, 2, 3, 4, 4}), IsEqual.equalTo(new int[]{1, 0, 2, 3, 4, 0}));
        assertThat(RemoveDuplicateFromArray.removeDuplicates(new int[]{1, 2, 2, 3, 3, 4}), IsEqual.equalTo(new int[]{1, 2, 0, 3, 0, 4}));
    }
}