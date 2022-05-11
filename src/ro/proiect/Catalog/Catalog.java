package ro.proiect.Catalog;

import ro.proiect.Servicii.MaterieService;
import ro.proiect.Servicii.ProfesorService;
import ro.proiect.Servicii.StudentService;

import java.util.Scanner;


public class Catalog {

    public void meniu() {

        System.out.println("Optiunile disponibile in cadrul acestui program sunt:");
        System.out.println("1. Adauga student");
        System.out.println("2. Adauga profesor");
        System.out.println("3. Adauga materie");
        System.out.println("4. Sterge student");
        System.out.println("5. Sterge profesor");
        System.out.println("6. Sterge materie");
        System.out.println("7. Adauga nota pentru un student");
        System.out.println("8. Adauga materie pentru un profesor");
        System.out.println("9. Sterge materie pentru un profesor");
        System.out.println("10. Afiseaza notele pentru un student");
        System.out.println("11. Iesirea din program\n");

        boolean interactiv = true;

        StudentService student_service = new StudentService();
        ProfesorService profesor_service = new ProfesorService();
        MaterieService m1 = new MaterieService();
        CitireVerificareDate a = new CitireVerificareDate();

        while(interactiv) {

            System.out.print("Alegerea dumneavoastra: ");
            Scanner in = new Scanner(System.in);
            Scanner fin = new Scanner(System.in);
            int optiune = in.nextInt();

            switch (optiune) {
                case 1:
                    try {
                        System.out.print("Nume student: ");
                        String name = fin.nextLine();

                        System.out.print("Prenume student: ");
                        String prenume = fin.nextLine();

                        int numar = a.citire_numar_matricol();

                        student_service.adauga_student(new Student(name, prenume, numar));
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Nume profesor: ");
                        String name = fin.nextLine();

                        System.out.print("Prenume profesor: ");
                        String prenume = fin.nextLine();

                        int varsta = a.citire_varsta();

                        String numar_telefon = a.citire_numar_telefon();

                        int ani_vechime = a.citire_ani_vechime();

                        Profesor y = new Profesor(name, prenume, varsta, numar_telefon, ani_vechime);
                        profesor_service.adauga_profesor(y);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Nume materie: ");
                        String name = fin.nextLine();
                        Materie m = new Materie(name);

                        m1.adauga_materie(m);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("ID-ul studentului pe care vreti sa-l stergeti: ");
                        int numar = in.nextInt();
                        student_service.sterge_student(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("ID-ul profesorului pe care vreti sa-l stergeti: ");
                        int numar = in.nextInt();
                        profesor_service.sterge_profesor(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.print("ID-ul materiei pe care doriti sa o stergeti: ");
                        int numar = in.nextInt();
                        m1.sterge_materie(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        System.out.print("ID student: ");
                        int numar = in.nextInt();

                        int medie = a.citire_medie();

                        student_service.adauga_medie(numar, medie);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        System.out.print("ID profesor: ");
                        int numar = in.nextInt();

                        System.out.print("Nume materie: ");
                        String nume_materie = fin.nextLine();

                        profesor_service.adauga_materie_profesor(numar, nume_materie);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.print("ID profesor: ");
                        int numar = in.nextInt();
                        System.out.print("ID materie: ");
                        int numar1 = in.nextInt();
                        profesor_service.sterge_materie_profesor(numar, numar1);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        System.out.print("Numarul de ordine al studentului din lista:");
                        int numar = in.nextInt();
                        student_service.afiseaza_note(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 11:
                    System.out.println("Ati ajuns la finalul programului!");
                    interactiv = false;
                    break;
                default:
                    System.out.println("Optiune invalida!");
                    break;
            }
        }
    }


}
