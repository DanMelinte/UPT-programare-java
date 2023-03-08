package Lab1.Tema1;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Insert Lungimea : ");
        int Lungime = scan.nextInt();

        System.out.print("Insert Latimea : ");
        int Latimea = scan.nextInt();

        System.out.println("Perimetrul = " + (Lungime * 2 + Latimea * 2));

    }
}
