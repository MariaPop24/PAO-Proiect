package ro.proiect.Catalog;

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
        System.out.println("11. Iesirea din program");

        boolean interactiv = true;

        while(interactiv) {

            System.out.print("Alegerea dumneavoastra: ");
            Scanner in = new Scanner(System.in);
            Scanner fin = new Scanner(System.in);
            int optiune = in.nextInt();
            StudentService student_service = new StudentService();
            ProfesorService profesor_service = new ProfesorService();
            MaterieService m1 = new MaterieService();

            switch (optiune) {
                case 1:
                    try {
                        System.out.print("Nume student: ");
                        String name = fin.nextLine();
                        System.out.print("Prenume student: ");
                        String prenume = fin.nextLine();
                        System.out.print("Numar matricol student: ");
                        int numar = in.nextInt();
                        Student x = new Student(name, prenume, numar);

                        student_service.adauga_student(x);
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
                        System.out.print("Varsta: ");
                        int varsta = in.nextInt();
                        System.out.print("Numar telefon: ");
                        String telefon = fin.nextLine();
                        System.out.print("Ani vechime: ");
                        int vechime = in.nextInt();
                        Profesor y = new Profesor(name, prenume, varsta, telefon, vechime);

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
                        System.out.print("Numarul de ordine al studentului din lista: ");
                        int numar = in.nextInt();
                        student_service.sterge_student(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Numarul de ordine al profesorului din lista: ");
                        int numar = in.nextInt();
                        profesor_service.sterge_profesor(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Id materie: ");
                        int numar = in.nextInt();
                        m1.sterge_materie(numar);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        System.out.print("Numarul de ordine al studentului din lista: ");
                        int numar = in.nextInt();
                        System.out.print("Medie: ");
                        int medie = in.nextInt();
                        student_service.adauga_nota(numar, medie);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        System.out.print("Id profesor: ");
                        int numar = in.nextInt();
                        System.out.print("Nume materie: ");
                        String name = fin.nextLine();
                        profesor_service.adauga_materie_profesor(numar, name);
                    }
                    catch (Exception e) {
                        System.out.println("Eroarea: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.print("Id profesor: ");
                        int numar = in.nextInt();
                        System.out.print("Id materie: ");
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
