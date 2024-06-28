package practice.kyu_6.sum_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {
    @Test
    public void Test1() {
        assertEquals(DRoot.digital_root(16), 7,"Nope!" );
    }

    @Test
    public void Test2() {
        assertEquals(DRoot.digital_root(456), 6, "Nope!");
    }
}