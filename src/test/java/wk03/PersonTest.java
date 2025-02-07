package wk03;
import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person claudia1;
    private Person claudia2;
    private int calculatedAge;

    @BeforeEach
    void setup() {
        claudia1 = new Person("Claudia Sheinbaum", LocalDate.of(1962, 6, 24));
        claudia2 = new Person("Claudia Sheinbaum Pardo", LocalDate.of(1962, 6, 24));
        calculatedAge = Period.between(claudia1.getDateOfBirth(), LocalDate.now()).getYears();
    }
    @Test
    void getDateOfBirth() {
        assertEquals(LocalDate.of(1962, 6, 24), claudia1.getDateOfBirth());
    }

    @Test
    void getName() {
        assertEquals("Claudia Sheinbaum", claudia1.getName());
    }

    @Test
    void setName() {
        claudia1.setName("Claudia Sheinbaum Pardo");
        assertEquals("Claudia Sheinbaum Pardo", claudia1.getName());
    }

    @Test
    void getAge() {
        assertEquals(calculatedAge, claudia1.getAge());
    }

    @Test
    void testToString() {
        assertEquals("Claudia Sheinbaum, Age " + calculatedAge, claudia1.toString());
    }

    @Test
    void testEquals() {
        assertNotEquals(claudia1, claudia2);
        claudia1.setName("Claudia Sheinbaum Pardo");
        assertEquals(claudia1,claudia2);
    }
}