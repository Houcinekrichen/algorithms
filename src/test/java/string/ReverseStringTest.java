package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverse() {
        assertEquals(ReverseString.reverse("houcine krichen"), "nehcirk enicuoh");
    }

    @Test
    public void reverseRecursively() {
        assertEquals(ReverseString.reverseRecursively("houcine krichen"), "nehcirk enicuoh");
    }
}