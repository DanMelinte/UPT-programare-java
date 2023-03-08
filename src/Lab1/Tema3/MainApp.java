package Lab1.Tema3;

/*
3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.*/

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert n : ");
        int n = scanner.nextInt();
        int nr = 0;

        System.out.println("Divizorii lui n : ");

        for (int i = 1; i <= n; i++ ) {
            if (n % i == 0) {
                System.out.print(i + " ");
                nr++;
            }
        }

        if (nr == 2)
            System.out.println("\nn - este prim");

    }
}
