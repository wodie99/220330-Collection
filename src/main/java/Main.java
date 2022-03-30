import model.Citizen;
import model.ComputerScienceStudent;
import model.Student;
import model.StudentDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ComputerScienceStudent heidi = new ComputerScienceStudent("Heidi", 1004);
        ComputerScienceStudent horst = new ComputerScienceStudent("Horst", 1005, "Fortran");

        StudentDB studentDB = new StudentDB();

        studentDB.add(heidi);
        studentDB.add(horst);

        System.out.println(studentDB);

        studentDB.remove(heidi);

        System.out.println(studentDB);










    }
}

