package ro.proiect.Catalog;

import java.util.ArrayList;
import java.util.Collections;

public class Student extends Persoana {

    private int numar_matricol;
    public ArrayList<Integer> note;

    // constructor fara parametri
    public Student() {

        super("nedefinit", "nedefinit");
        this.numar_matricol = 0;
        this.note = new ArrayList<>();
    }

    // constructor parametrizat
    public Student(String nume, String prenume, int numar_matricol) {

        super(nume, prenume);
        this.numar_matricol = numar_matricol;
        this.note = new ArrayList<>();
    }

    // constructor de copiere
    public Student(Student student) {

        super(student.nume, student.prenume);
        this.numar_matricol = student.numar_matricol;
        this.note = student.note;
    }

    public Student adauga_medie_student(Student student, int medie) {
        student.note.add(medie);
        return student;
    }

    // getteri
    public int get_numar_matricol() {
        return numar_matricol;
    }

    // setteri
    public void set_numar_matricol(int numar_matricol1) {
        this.numar_matricol =  numar_matricol1;
    }

    public String toString(Student student) {
        String str = "Student";
        str += "\nNume: " + student.nume;
        str += "\nPrenume: " + student.prenume;
        str += "\nNumar matricol: " + student.numar_matricol + "\n";
        return str;
    }
}
