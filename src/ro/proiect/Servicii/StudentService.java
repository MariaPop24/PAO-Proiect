package ro.proiect.Servicii;

import ro.proiect.Catalog.Student;

import java.util.HashMap;

public class StudentService extends Student {

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

    public void adauga_medie(int numar, int nota) {
        try {
            students.put(numar, adauga_medie_student(students.get(numar), nota));
        }
        catch (Exception e) {
            System.out.println("Student inexistent!");
        }
    }

    public void afiseaza_note(int numar) {

    }

    public void f() {
        for(int i = 1; i <= id; i++) {
            System.out.println(toString(students.get(i)));
        }
    }
}
