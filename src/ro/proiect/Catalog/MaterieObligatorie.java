package ro.proiect.Catalog;

public class MaterieObligatorie extends Materie {

    private boolean teza;

    public MaterieObligatorie(boolean teza) {
        this.teza = teza;
    }

    public MaterieObligatorie(String nume, boolean teza) {
        super(nume);
        this.teza = teza;
    }

    public MaterieObligatorie(Materie materie, boolean teza) {
        super(materie);
        this.teza = teza;
    }

    public boolean isTeza() {
        return teza;
    }

    public void setTeza(boolean teza) {
        this.teza = teza;
    }
}
