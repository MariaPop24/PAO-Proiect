package ro.proiect.Catalog;

import java.util.ArrayList;

public class NoteStudent extends Student{

    ArrayList<Integer> medii;

    public NoteStudent() {
    }

    public NoteStudent(ArrayList<Integer> note) {
        this.medii = note;
    }

    public ArrayList<Integer> get_note() {
        return medii;
    }

    public void adauga_nota(int x) {
        if(x > 10) {
            System.out.println("Nota incorecta!");
        }
        else {
            this.medii.add(x);
        }
    }


}
