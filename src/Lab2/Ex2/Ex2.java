package Lab2.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
TODO
2. Fișierul cantec_in.txt conține versurile unui cântec la alegere. Să se scrie un program care creează fișierul cantec_out.txt, care conține versurile cântecului original dar în
plus în dreptul fiecărui rând sunt afișate numărul de cuvinte de pe rând şi numărul de vocale de pe fiecare rând.

În dreptul rândurilor care se încheie cu o grupare de litere aleasă se va pune o steluță (*).
Rândurile pentru care un număr generat aleator este mai mic decât 0.1 vor fi scrise cu majuscule (se vor genera aleator numere între 0 şi 1).

Se va defini o clasă Vers, care are o variabilă membră privată un șir de caractere reprezentând versul și se va dezvolta
câte un operator pentru fiecare cerință de mai sus
(o metodă care returnează numărul de cuvinte, o metodă care returnează numărul de vocale, etc).
Se va crea un vector de obiecte de tip Vers care va conține informația preluată din fișierul de intrare.
 */
public class Ex2 {
    public static class Vers {
        private  String sir;

        public Vers(String a)
        {
            this.sir = a;
        }
        public int nrWords()
        {
            StringTokenizer line = new StringTokenizer(sir);
            int nr = line.countTokens();
            return nr;
        }

        public int vocale()
        {
            char[] line;
            line = sir.toCharArray();
            int n = 0;

            for (int i = 0; i < sir.length(); i++)
            {
                if (line[i] == 'a' || line[i] == 'o' || line[i] == 'e' || line[i] == 'u' || line[i] == 'i')
                    n++;
            }
            return  n;
        }

        public int isContain(String let)
        {
            int ok = 1;
            for (int i = 0; i < let.length(); i++)
            {
                if (!sir.substring(sir.length() - let.length()).equals(let)) {
                    ok = 0;
                    break;
                }
            }
            return  ok;
        }

    }
    public static void main(String[] args) throws FileNotFoundException {

        String[] list = new String[25];

        String nameFis = "src/Lab2/Ex2/catec_in.txt";
        Scanner read = new Scanner(new File(nameFis));
        int i;
        for (i = 0; read.hasNextLine(); i++)
            list[i] = read.nextLine();

        int n = i;

        PrintStream flux_out = new PrintStream("src/Lab2/Ex2/catec_out.txt");
        Vers nr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert letters : ");
        String let = scanner.nextLine();

        Random rand = new Random();
        int x;

        for (i = 0; i < n; i++)
        {
            x = rand.nextInt(1);
            nr = new Vers(list[i]);
            flux_out.print(nr.nrWords() + ", ");
            flux_out.print(nr.vocale() + ", ");

            if(nr.isContain(let) == 1)
                flux_out.print("* , ");

            if (x <= 0.1)
                flux_out.println(list[i].toUpperCase());
            else
                flux_out.println(list[i]);
        }

    }
}
