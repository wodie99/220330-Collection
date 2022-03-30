import model.Citizen;
import model.ComputerScienceStudent;
import model.Student;
import model.StudentDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ComputerScienceStudent heidi = new ComputerScienceStudent("Heidi", 1004);
        ComputerScienceStudent horst = new ComputerScienceStudent("Horst", 1005, "Fortran");

        Citizen gert = new ComputerScienceStudent("Gert", 1006);
        Student[] test = new Student[] {heidi, horst};

        heidi.setAdress("Hauptstr. 12");
        heidi.setIdentityCardNumber(12345);

        if (heidi instanceof Citizen) {
            System.out.println("Ich habe die Klasse Citizen implentiert!");
        } else {
            System.out.println("Ich habe die Klasse Citizen nicht implentiert!");
        }



        StudentDB studentDB = new StudentDB(test);

        System.out.println("\nAusgabe der Values von StudentDB");

        ArrayList<Student> Studenttemp= studentDB.getAllStudents();
        for (int i = 0; i < Studenttemp.size(); i++) {
            System.out.println(Studenttemp.get(i));
        }
//
        System.out.println(studentDB);







    }
}

