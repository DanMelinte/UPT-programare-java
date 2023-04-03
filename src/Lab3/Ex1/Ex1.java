package Lab3.Ex1;

/*
TODO
1. Funcţia f(x) = ax^2 + bx + c

Se cere să se definească o clasă Parabola ai cărei membri vor fi:
• 3 variabile de tip int care reprezintă coeficienţii a, b şi c
• un constructor cu 3 parametrii de tip int
• se va redefini metoda toString() din clasa Object, astfel încât să returneze un String de
forma f(x) = a x^2 + b x + c. Caracteristicile a, b și c ale parabolei se vor înlocui cu
valorile efective. Metoda va fi utilizată pentru afișarea parabolei sub forma unei funcții

• o metodă care primește ca și parametru de intrare o parabolă și returneză coordonatele
mijlocului segmentului de dreptă care uneşte vârful parabolei curente cu varful
parabolei transmisă ca și parametru de intrare

• o metodă statică ce primeşte ca parametri de intrare două parabole şi calculează
coordonatele mijlocului segmentului de dreptă care uneşte vârfurile celor două parabole.
• o metodă care primește ca și parametru de intrare o parabolă și returneză lungimea
segmentului de dreptă care unește vârful parabolei curente cu varful parabolei transmisă
ca și parametru de intrare. Se va utiliza metoda statică Math.hypot
• o metodă statică care primește ca și parametri de intrare două parabole și calculează
lungimea segmentului de dreapta ce unește vârfurile celor două parabole. Se va utiliza
metoda statică Math.hypot
 */

import Lab3.Laborator.MainApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static class Parabola {
        private int a,b,c;

        public Parabola(int a, int b, int c) {
            //super();
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public String Varf(){
            double x = -this.b / 2 * this.a;
            double y = (-this.b * this.b + 4 * this.a * this.c) / 4 * this.a;
            return x + " " + y;
        }

        public String CenterCoordonates(Parabola p) {
            double x1 = -this.b / 2 * this.a;
            double y1 = (-this.b * this.b + 4 * this.a * this.c) / 4 * this.a;

            double x2 = -p.b / 2 * p.a;
            double y2 = (-p.b * p.b + 4 * p.a * p.c) / 4 * p.a;

            double centerX = (x1 + x2 ) / 2;
            double centerY = (y1 + y2 ) / 2;

            return centerX + " " + centerY;
        }

        public static String CenterCoordonates(Parabola p1, Parabola p2) {
            double x1 = -p1.b / 2 * p1.a;
            double y1 = (-p1.b * p1.b + 4 * p1.a * p1.c) / 4 * p1.a;

            double x2 = -p2.b / 2 * p2.a;
            double y2 = (-p2.b * p2.b + 4 * p2.a * p2.c) / 4 * p2.a;

            double centerX = (x1 + x2 ) / 2;
            double centerY = (y1 + y2 ) / 2;

            return centerX + " " + centerY;
        }

        public double LungimeSegment(Parabola p) {
            double x1 = -this.b / 2 * this.a;
            double y1 = (-this.b * this.b + 4 * this.a * this.c) / 4 * this.a;

            double x2 = -p.b / 2 * p.a;
            double y2 = (-p.b * p.b + 4 * p.a * p.c) / 4 * p.a;

            return Math.hypot(x2 - x1, y2 - y1);
        }

        public static double LungimeSegment(Parabola p1, Parabola p2) {
            double x1 = -p1.b / 2 * p1.a;
            double y1 = (-p1.b * p1.b + 4 * p1.a * p1.c) / 4 * p1.a;

            double x2 = -p2.b / 2 * p2.a;
            double y2 = (-p2.b * p2.b + 4 * p2.a * p2.c) / 4 * p2.a;

            return Math.hypot(x2 - x1, y2 - y1);
        }

        @Override
        public String toString() {
            return a + "x^2 + " + b + "x + " + c;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        List<Parabola> parabola = new ArrayList<Parabola>();

        Scanner read = new Scanner(new File("src/Lab3/Ex1/in.txt"));
        while(read.hasNextLine()) {
            parabola.add(new Parabola(Integer.parseInt(read.next()), Integer.parseInt(read.next()), Integer.parseInt(read.next())));
        }

        System.out.println("Lista contine parabolele :");
        for (Parabola p : parabola) {
            System.out.println(p);
            System.out.println(p.Varf());
            System.out.println();
        }

        System.out.println(parabola.get(0).CenterCoordonates(parabola.get(1)));
        System.out.println(Parabola.CenterCoordonates(parabola.get(0), parabola.get(1)));

        System.out.println(parabola.get(0).LungimeSegment(parabola.get(1)));
        System.out.println(Parabola.LungimeSegment(parabola.get(0), parabola.get(1)));
    }
}
