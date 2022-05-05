package ro.proiect.Catalog;

import java.util.HashMap;

public class StudentService {

    private static int id;
    private HashMap<Integer, Student> students;

    public StudentService() {
        students = new HashMap<Integer, Student>();
    }

    public void adauga_student(Student x) {
        id += 1;
        students.put(id, x);
    }

    public void sterge_student(int numar) {
        try {
            students.remove(id);
        }
        catch (Exception e) {
            System.out.println("Student inexistent!");
        }
    }

    public void adauga_nota(int numar, int nota) {
        if(nota <= 10) {
            try {
            }
            catch (Exception e) {
                System.out.println("Student inexistent!");
            }
        }
        else {
            System.out.println("Nota prea mare!");
        }

    }

    public void afiseaza_note(int numar) {

    }
}
