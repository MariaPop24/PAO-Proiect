package ro.proiect.Servicii;

import ro.proiect.Catalog.Materie;

import java.util.HashMap;

public class MaterieService {

    private static int id;
    private HashMap<Integer, Materie> materii;

    public MaterieService() {
        materii = new HashMap<Integer, Materie>();
    }

    public void adauga_materie(Materie m) {
        id += 1;
        materii.put(id, m);
    }

    public void sterge_materie(int numar) {
        try {
            materii.remove(id);
        }
        catch (Exception e) {
            System.out.println("Materie inexistenta!");
        }
    }
}
