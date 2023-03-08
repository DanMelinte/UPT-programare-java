package Lab2.Ex1;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

/*
TODO
1. Fișierul judete_in.txt, conține lista neordonată a județelor din țară.
Să se încarce datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei sort() din clasa Arrays.
Să se returneze pe ce poziție se află în vectorul ordonat un județ introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays.
 */
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {

        String[] list = new String[25];

        String nameFis = "src/Lab2/Ex1/judete_in.txt";
        Scanner read = new Scanner(new File(nameFis));

        int i = 0;

        while(read.hasNextLine())
        {
            list[i] = read.nextLine();
            System.out.println(list[i]);
            i++;
        }

        int n = i;

        System.out.println("===============================");
        Arrays.sort(list, 0,n);

        for (i = 0; i < n; i++)
            System.out.println(list[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert wanted Judet : ");
        String search = scanner.nextLine();

        //Arrays.binarySearch(list,search);
        int a = Arrays.binarySearch(list,0,n,search);
        System.out.println(a);
    }
}
