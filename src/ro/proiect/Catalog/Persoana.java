package ro.proiect.Catalog;

public class Persoana {

    protected String nume;
    protected String prenume;

    // constructor fara parametri
    public Persoana() {
        this.nume = this.prenume = "nedefinit";
    }

    // constructor cu parametri
    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    // contructor de copiere
    public Persoana(Persoana persoana) {
        this.nume = persoana.nume;
        this.prenume = persoana.prenume;
    }

    // getteri
    public String get_nume() {
        return nume;
    }

    public String get_prenume() {
        return prenume;
    }

    // setteri
    public void set_nume(String nume) {
        this.nume = nume;
    }

    public void set_prenume(String prenume) {
        this.prenume = prenume;
    }
}
