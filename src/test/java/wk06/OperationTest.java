package wk06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    Operation o1;
    static Operation o2;
    static final int left1 = 7;
    static final int right1 = 5;
    static final int result1 = 12;
    static final String s1 = "7 + 5 = 12";

    @BeforeAll
    static void init() {
        o2 = new Addition(12, 16);
    }

    @BeforeEach
    void setUp() {
        o1 = new Addition(left1, right1);
    }

    @Test
    void execute() {
        assertEquals(result1, o1.execute());
        assertEquals(28, o2.execute());
    }

    @Test
    void testToString() {
        assertEquals(s1, o1.toString());
    }
}