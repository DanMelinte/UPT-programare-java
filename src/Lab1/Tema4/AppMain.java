package Lab1.Tema4;

/*TODO
4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt(); */

import java.util.Random;

public class AppMain {
    public static int Euclid(int a, int b) {
        int aux = 1;
        while (aux != 0) {
            aux = a % b;
            a = b;
            b = aux;
        }
        return a;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int n1, n2;

        n1 = rand.nextInt(31);
        n2 = rand.nextInt(31);

        System.out.println(n1 + " " + n2);
        int aux;

        if (n1 > n2)
            aux = Euclid(n1, n2);
        else
            aux = Euclid(n2, n1);

        System.out.println("CMMDC = " + aux);
    }
}
