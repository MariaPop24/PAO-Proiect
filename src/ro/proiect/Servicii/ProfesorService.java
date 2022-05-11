package ro.proiect.Servicii;

import ro.proiect.Catalog.Profesor;

import java.util.HashMap;

public class ProfesorService{

    private static int id;
    private HashMap<Integer, Profesor> profesori;

    public ProfesorService() {
        profesori = new HashMap<Integer, Profesor>();
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
        Profesor a = new Profesor();
        try {
            profesori.put(numar, a.adauga_materie(profesori.get(numar), nume));
        }
        catch (Exception e) {
            System.out.println("Profesor inexistent!");
        }
    }

    public void sterge_materie_profesor(int numar, int numar1) {
        Profesor a = new Profesor();
        try {
            //a.ster_materie()
        }
        catch (Exception e) {
            System.out.println("Profesor inexistent!");
        }
    }
}
