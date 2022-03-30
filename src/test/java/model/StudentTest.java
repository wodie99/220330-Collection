package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAge() {
        ComputerScienceStudent test = new ComputerScienceStudent("Test", 1000);
        test.setAge(28);
        assertEquals(28, test.getAge());
    }

    @Test
    void testEquals() {
        ComputerScienceStudent test1 = new ComputerScienceStudent("Uwe", 1000, "Java");
        ComputerScienceStudent test2 = new ComputerScienceStudent("Uwe", 1000, "Java");
        assertTrue(test1.equals(test2));
    }
}
