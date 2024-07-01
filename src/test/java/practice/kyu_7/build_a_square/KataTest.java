package practice.kyu_7.build_a_square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", Kata.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Kata.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Kata.generateShape(8));
    }
}