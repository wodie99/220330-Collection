package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentDBTest {

    Student heidi = new Student("Heidi", 1004);
    Student horst = new Student("Horst", 1005);
    Student inge = new Student("Inge", 1006);


    @Test
    void shouldAddNewStudent() {
        // given

        StudentDB studentDB = new StudentDB();
        studentDB.add(heidi);


        // when

        studentDB.add(horst);
        Map<Integer, Student> actual = studentDB.getStudentDB();


        // then

        Map<Integer, Student> expected = new HashMap<>();
        expected.put(1004, heidi);
        expected.put(1005, horst);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given

        StudentDB studentDB = new StudentDB();
        studentDB.add(heidi);
        studentDB.add(horst);
        studentDB.add(inge);

        // when
        studentDB.remove(heidi);
        Map<Integer, Student> actual = studentDB.getStudentDB();

        // then
        Map<Integer, Student> expected = new HashMap<>();
        expected.put(1005, horst);
        expected.put(1006, inge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given

        StudentDB studentDB = new StudentDB();
        studentDB.add(heidi);
        studentDB.add(horst);
        studentDB.add(inge);

        // when
        studentDB.remove(inge);
        Map<Integer, Student> actual = studentDB.getStudentDB();

        // then
        Map<Integer, Student> expected = new HashMap<>();
        expected.put(1004, heidi);
        expected.put(1005, horst);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given

        StudentDB studentDB = new StudentDB();
        studentDB.add(heidi);
        studentDB.add(horst);
        studentDB.add(inge);

        // when
        studentDB.remove(horst);
        Map<Integer, Student> actual = studentDB.getStudentDB();

        // then
        Map<Integer, Student> expected = new HashMap<>();
        expected.put(1004, heidi);
        expected.put(1006, inge);

        Assertions.assertEquals(expected, actual);
    }
}