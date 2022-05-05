package ro.proiect.Catalog;

import java.util.HashMap;

public class ProfesorService{

    private static int id;
    private HashMap<Integer, Profesor> profesori;
    private MaterieService m;

    public ProfesorService() {
        profesori = new HashMap<Integer, Profesor>();
        m = new MaterieService();
    }

    public void adauga_profesor(Profesor y) {
        id += 1;
        profesori.put(id, y);
    }

    public void sterge_profesor(int numar) {
        try {
            profesori.remove(id);
        }
        catch (Exception e) {
            System.out.println("Profesor inexistent!");
        }
    }

    public void adauga_materie_profesor(int numar, String nume) {
        try {

            for(int i = 1; i <= id; i++) {
                if(i == numar) {
                    Profesor x = profesori.get(i);

                }
            }
        }
        catch (Exception e) {
            System.out.println("Profesor inexistent!");
        }
    }

    public void sterge_materie_profesor(int numar, int numar1) {
        try {

        }
        catch (Exception e) {
            System.out.println("Profesor inexistent!");
        }
    }
}
