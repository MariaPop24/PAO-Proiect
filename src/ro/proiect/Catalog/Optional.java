package ro.proiect.Catalog;

public class Optional extends Materie {

    private int semestru_studiu;

    public Optional(int semestru_studiu) {
        this.semestru_studiu = semestru_studiu;
    }

    public Optional(String nume, int semestru_studiu) {
        super(nume);
        this.semestru_studiu = semestru_studiu;
    }

    public Optional(Materie materie, int semestru_studiu) {
        super(materie);
        this.semestru_studiu = semestru_studiu;
    }

    public int getSemestru_studiu() {
        return semestru_studiu;
    }

    public void setSemestru_studiu(int semestru_studiu) {
        this.semestru_studiu = semestru_studiu;
    }
}
