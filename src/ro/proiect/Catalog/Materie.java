package ro.proiect.Catalog;

public class Materie {

    protected String nume;

    // constructor fara parametri
    public Materie() {
        this.nume = "nedefinit";
    }

    // constructor cu parametri
    public Materie(String nume) {
        this.nume = nume;
    }

    // constructor de copiere
    public Materie(Materie materie) {
        this.nume = materie.nume;
    }

    // getter
    public String get_nume() {
        return nume;
    }

    // setter
    public void set_nume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Materie: " + nume;
    }

}
