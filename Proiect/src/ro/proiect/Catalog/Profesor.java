package ro.proiect.Catalog;

import java.util.ArrayList;
import java.util.HashMap;

public class Profesor {

    private String nume;
    private String prenume;
    private int varsta;
    private String numar_telefon;
    private int vechime;
    private MaterieService v;

    // constructor fara parametri
    public Profesor() {
        this.nume = this.prenume = "nedefinit";
        this.varsta = this.vechime = 0;
        this.numar_telefon = "07XXXXXXXX";
    }

    // constructor cu parametri
    public Profesor(String nume, String prenume, int varsta, String numar_telefon, int vechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.numar_telefon = numar_telefon;
        this.vechime = vechime;
    }

    // constructor de copiere
    public Profesor(Profesor profesor) {
        this.nume = profesor.nume;
        this.prenume = profesor.prenume;
        this.varsta = profesor.varsta;
        this.numar_telefon = profesor.numar_telefon;
        this.vechime = profesor.vechime;
    }

    // getteri
    public String get_nume() {
        return nume;
    }

    public String get_prenume() {
        return prenume;
    }

    public int get_varsta() {
        return varsta;
    }

    public String get_numar_telefon() {
        return numar_telefon;
    }

    public int get_vechime() {
        return vechime;
    }

    // setteri
    public void set_nume(String nume) {
        this.nume = nume;
    }

    public void set_prenume(String prenume) {
        this.prenume = prenume;
    }

    public void set_varsta(int varsta) {
        this.varsta = varsta;
    }

    public void set_numar_telefon(String numar_telefon) {
        this.numar_telefon = numar_telefon;
    }

    public void set_vechime(int vechime) {
        this.vechime = vechime;
    }

    public boolean equals(Profesor x) {
        if(this == x)
            return true;

        if(x == null || getClass() != x.getClass())
            return false;

        Profesor y = (Profesor) x;

        return this.numar_telefon == y.numar_telefon;
    }


    @Override
    public String toString() {
        String str = "Profesor";
        str += "\nNume: " + nume;
        str += "\nPrenume: " + prenume;
        str += "\nVarsta: " + varsta;
        str += "\nNumar de telefon: " + numar_telefon;
        str += "\nAni vechime: " + vechime;
        return str;
    }
}
