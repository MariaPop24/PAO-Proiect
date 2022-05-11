package ro.proiect.Catalog;

import java.util.ArrayList;

public class Profesor extends Persoana {

    private int varsta;
    private String numar_telefon;
    private int vechime;
    private ArrayList<String> materii;

    // constructor fara parametri
    public Profesor() {
        super("nedefinit", "nedefinit");
        this.varsta = this.vechime = 0;
        this.numar_telefon = "07XXXXXXXX";
        this.materii = new ArrayList<String>();
    }

    // constructor cu parametri
    public Profesor(String nume, String prenume, int varsta, String numar_telefon, int vechime) {
        super(nume, prenume);
        this.varsta = varsta;
        this.numar_telefon = numar_telefon;
        this.vechime = vechime;
        this.materii = new ArrayList<String>();
    }

    // constructor de copiere
    public Profesor(Profesor profesor) {
        super(profesor.nume, profesor.prenume);
        this.varsta = profesor.varsta;
        this.numar_telefon = profesor.numar_telefon;
        this.vechime = profesor.vechime;
        this.materii = profesor.materii;
    }

    // getteri
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
    public void set_varsta(int varsta) {
        this.varsta = varsta;
    }

    public void set_numar_telefon(String numar_telefon) {
        this.numar_telefon = numar_telefon;
    }

    public void set_vechime(int vechime) {
        this.vechime = vechime;
    }

    public Profesor adauga_materie(Profesor profesor, String materie) {
        profesor.materii.add(materie);
        return profesor;
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
