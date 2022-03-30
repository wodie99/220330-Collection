package model;


import java.util.HashMap;
import java.util.Map;

public class StudentDB {

    private Map<Integer, Student> studentDB;

    public StudentDB() {
        studentDB = new HashMap<Integer, Student> ();
    }

    public void add(Student student) {
        studentDB.put(student.getId(), student);
    }

    public void remove(Student student) {
        studentDB.remove(student.getId());
    }

    public Map<Integer, Student> getStudentDB() {
        return studentDB;
    }

//    public Student getRandomStudent() {
//        int random = (int) (Math.random()*(studentDB.size()-1));
//        return studentDB.get(random);
//    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + studentDB +
                '}';
    }
}
