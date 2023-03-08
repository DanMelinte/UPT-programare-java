package Lab1.Tema5;

/*TODO
 5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci.
0, 1, 1, 2, 3, 5, 8, 13, 21.*/

import java.util.Random;

public class AppMain {

    public static int Fib(int a) {
        int aux;
        int n[] = {1, 1};

        for (int i = 0; i <= a; i++) {
            if (a == n[1] || a == 0) {
                a = -1;
                break;
            }
            aux = n[1];
            n[1] = n[0] + n[1];
            n[0] = aux;
        }

        return a;
    }
    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt(20);
        System.out.print(a + " - ");

        if (Fib(a) == -1)
            System.out.println("Apartine lui Fibonacci");
        else
            System.out.println("Nu Apartine lui Fibonacci");
    }
}
