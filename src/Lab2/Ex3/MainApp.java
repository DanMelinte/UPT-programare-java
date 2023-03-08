package Lab2.Ex3;

/*
TODO
3. Să se insereze într-o anumită poziție a unui șir de caractere, un alt șir. Datele vor fi
preluate de la tastatură sau din fișier. Să se șteargă o porțiune a unui șir de caractere care
începe dintr-o anumită poziție și are un anumit număr de caractere. Se recomandă utilizarea
clasei StringBuilder.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sir = new StringBuilder();

        String aux;
        int pos;

        System.out.print("From file(0) or keyboard : ");
        int ok = Integer.parseInt(scan.nextLine());

        if (ok == 0) {
            Scanner read = new Scanner(new File("src/Lab2/Ex3/a.txt"));

            sir = new StringBuilder(read.next());
            pos = read.nextInt();
            aux = read.next();
        } else {
            System.out.print("Insert string : ");
            sir.insert(0, scan.nextLine());

            System.out.print("Index to make insertion : ");
            pos = Integer.parseInt(scan.nextLine());

            System.out.print("Insert second string : ");
            aux = scan.nextLine();
        }

        System.out.print("Sa inserat in \"" + sir + "\" pe pozitia " + pos + " \"" + aux + "\" => ");
        sir.insert(pos, aux);
        System.out.println(sir);
    }
}
