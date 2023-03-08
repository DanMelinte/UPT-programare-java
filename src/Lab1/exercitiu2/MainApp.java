package Lab1.exercitiu2;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {

        String nameFis = "in.txt";

        //flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nameFis)));
        //BufferedReader flux_inn = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader flux_in = new BufferedReader(new FileReader(nameFis));

        Scanner input = new Scanner(new File(nameFis));
        while(input.hasNextLine())
        {
            String data = input.nextLine();
            System.out.println(data);
        }

/*
        PrintStream flux_out = new PrintStream(nameFis);
        flux_out.println("assf");
*/

    }

}
