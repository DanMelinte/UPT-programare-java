package Lab3.Ex2;

/*
TODO
2. Să se scrie un program care citește din fișierul produse.csv informații referitoare la
produsele dintr-un magazin. Pe fiecare linie se află:
denumirea produsului, preţul (număr real) cantitatea (număr întreg), data expirării (LocalDate).

Cele patru elemente sunt separate prin caracterul "," (zahar, 1.5, 50, 2024-02-25).

Pentru fiecare rând citit se va crea un obiect de tip Produs care se va adăuga unei colecții de obiecte de tip List.
Se va defini o clasă Produs care va conține:

variabile membre private corespunzătoare celor trei elemente care descriu un produs,
cel puţin un constructor, gettere si settere în funcție de necesități şi

redefinirea metodei toString() din clasa Object, metodă care va fi utilizată pentru afișarea produselor.

Să se realizeze un program care va dispune de un meniu și va implementa următoarele cerințe:
a) afișarea tuturor produselor din colecția List
b) afișarea produselor expirate
c) vânzarea unui produs, care se poate realiza doar dacă există suficientă cantitate pe stoc.
Daca produsul ajunge la cantitate zero, se elimina din listă. În clasa Produs se va declara
o variabilă statica încasări care se va actualiza la fiecare vânzare a unui produs, luând în
considerare prețul produsului vândut şi cantitatea vândută .
d) afișarea produselor cu prețul minim (pot fi mai multe cu același preț)
e) salvarea produselor care au o cantitate mai mică decât o valoare citită de la tastatură
într-un fișier de ieșire.
*/

import Lab3.Ex1.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static class Produs{
        private String nume;
        private double pret;
        private int cantitate;
        private LocalDate data;

        public Produs(String nume, double pret, int cantitate, LocalDate data){
            this.nume = nume;
            this.pret = pret;
            this.cantitate = cantitate;
            this.data = data;
        }

        @Override
        public String toString() {
            return nume + ", " + pret + ", " + cantitate + ", " + data;
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        List<Produs> produs = new ArrayList<Produs>();

        Scanner read = new Scanner(new File("src/Lab3/Ex2/produse.csv"));

        String nume;
        double pret;
        int cantitate;
        String data;

        String[] sir;
        /*while(read.hasNextLine()) {
            sir = read.nextLine().split(",");

            nume = sir[0];
            pret = sir[1];
            cantitate = sir[2];
            data = sir[3];

            produs.add(new Produs(nume,pret,cantitate,data));
        }*/

    }
}
