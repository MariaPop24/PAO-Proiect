package ro.proiect.Catalog;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String nume;
    private String prenume;
    private int numar_matricol;
    public ArrayList<Integer> note;

    // constructor fara parametri
    public Student() {
        this.nume = this.prenume = "nedefinit";
        this.numar_matricol = 0;
    }

    // constructor parametrizat
    public Student(String nume1, String prenume1, int numar_matricol1) {
        this.nume = nume1;
        this.prenume = prenume1;
        this.numar_matricol = numar_matricol1;
    }

    // constructor de copiere
    public Student(Student student) {
        this.nume = student.nume;
        this.prenume = student.prenume;
        this.numar_matricol = student.numar_matricol;
    }

    // getteri
    public String get_nume() {
        return nume;
    }

    public String get_prenume() {
        return prenume;
    }

    public int get_numar_matricol() {
        return numar_matricol;
    }

    // setteri
    public void set_nume(String nume1) {
        this.nume = nume1;
    }

    public void set_prenume(String prenume1) {
        this.prenume = prenume1;
    }

    public void set_numar_matricol(int numar_matricol1) {
        this.numar_matricol =  numar_matricol1;
    }

    public boolean equals(Student x) {
        if(this == x)
            return true;

        if(x == null || getClass() != x.getClass())
            return false;

        Student y = (Student) x;

        return this.numar_matricol == y.numar_matricol;
    }

    @Override
    public String toString() {
        String str = "Student";
        str += "\nNume: " + nume;
        str += "\nPrenume: " + prenume;
        str += "\nNumar matricol: " + numar_matricol + "\n";
        return str;
    }
}
