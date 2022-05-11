package ro.proiect.Catalog;

import java.util.Scanner;

public class CitireVerificareDate {

    public CitireVerificareDate() {

    }

    public int citire_numar_matricol() {

        System.out.print("Numar matricol student (numar format din 4 cifre): ");
        Scanner in = new Scanner(System.in);
        int numar = in.nextInt();

        if(numar >= 1000 && numar <= 9999) {
            return numar;
        }
        else {
            System.out.println("\nNumar matricol invalid! Mai incercati o data!\n");
            return citire_numar_matricol();
        }
    }

    public int citire_varsta() {

        System.out.print("Varsta: ");
        Scanner in = new Scanner(System.in);
        int varsta = in.nextInt();

        if(varsta >= 20 && varsta <= 65) {
            return varsta;
        }
        else {
            System.out.println("\nVarsta invalida! Mai incercati o data!\n");
            return citire_varsta();
        }
    }

    public String citire_numar_telefon() {

        System.out.print("Numar telefon: ");
        Scanner in = new Scanner(System.in);
        String numar_telefon = in.nextLine();

        if(numar_telefon.length() != 10 || numar_telefon.charAt(0) != '0' || numar_telefon.charAt(1) != '7') {
            System.out.println("\nNumar de telefon invalid! Mai incercati o data!\n");
            return citire_numar_telefon();
        }
        else {
            for(int i = 2; i <= 9; i++) {
                if(numar_telefon.charAt(i) < '1' || numar_telefon.charAt(i) > '9') {
                    System.out.println("\nNumar de telefon invalid! Mai incercati o data!\n");
                    return citire_numar_telefon();
                }
            }
            return numar_telefon;
        }
    }

    public int citire_ani_vechime() {

        System.out.print("Ani vechime: ");
        Scanner in = new Scanner(System.in);
        int ani_vechime = in.nextInt();

        if(ani_vechime < 0 || ani_vechime >= 45) {
            System.out.println("\nNumar de ani vechime invalid! Mai incercati o data!\n");
            return citire_ani_vechime();
        }
        else {
            return ani_vechime;
        }
    }

    public int citire_medie() {

        System.out.print("Medie: ");
        Scanner in = new Scanner(System.in);
        int medie = in.nextInt();

        if(medie < 0 || medie > 10) {
            System.out.println("\nMedie invalida! Mai incercati o data!\n");
            return citire_medie();
        }
        else {
            return medie;
        }
    }
}
