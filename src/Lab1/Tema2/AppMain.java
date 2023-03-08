package Lab1.Tema2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) throws FileNotFoundException {

        String nameFis = "src/Lab1.Tema2/in.txt";
        Scanner read = new Scanner(new File(nameFis));
        int Suma = 0, n = 0;
        double Media;
        int MinValue = Integer.MAX_VALUE, MaxValue = Integer.MIN_VALUE;

        while(read.hasNextLine())
        {
            int data =read.nextInt();
            System.out.println(data);

            n++;
            Suma += data;

            if (MinValue > data) MinValue = data;
            if (MaxValue < data) MaxValue = data;
        }

        Media = (float)Suma / n;

        System.out.println("Suma = " + Suma);
        System.out.println("Media = " + Media);
        System.out.println("Min = " + MinValue);
        System.out.println("Max = " + MaxValue);

        PrintStream flux_out = new PrintStream("src/Lab1.Tema2/out.txt");
        flux_out.println("Suma = " + Suma);
        flux_out.println("Media = " + Media);
        flux_out.println("Min = " + MinValue);
        flux_out.println("Max = " + MaxValue);
    }
}
