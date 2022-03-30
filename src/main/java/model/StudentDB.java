package model;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {

    protected ArrayList<Student> studentDB;

    public StudentDB() {
        studentDB = new ArrayList<Student> ();
    }

    public StudentDB(Student[] studentArray) {
        studentDB = new ArrayList<Student>(Arrays.asList(studentArray));
    }

    public void add(Student student) {
        studentDB.add(student);
    }

    public void remove(Student student) {
        studentDB.remove(student);
    }

    public ArrayList<Student> getAllStudents() {
        return studentDB;
    }

    public Student getRandomStudent() {
        int random = (int) (Math.random()*(studentDB.size()-1));
        return studentDB.get(random);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + studentDB +
                '}';
    }
}
