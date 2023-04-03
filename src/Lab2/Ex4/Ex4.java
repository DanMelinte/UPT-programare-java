package Lab2.Ex4;

import java.util.Scanner;

/*
TODO
4. Să se realizeze un program care citește numele si CNP-ul pe care îl au n persoane.
Valoarea lui n se citește de la tastatură.

Programul va afișa informațiile introduse și în plus pentru fiecare persoana va afișa vârsta.

Cât timp un CNP-ul este introdus greșit programul va cere reintroducerea acestuia.
Pentru simplitate se consideră că CNP-ul este valid dacă îndeplinește următoarele condiții:
• Are 13 caractere
• Toate caracterele sunt cifre
• Prima cifră are una din valorile 1, 2, 5, 6
• Cifra de control a CNP-ului are o valoare validă.

Detalii legate de semnificația cifrelor din codul numeric personal şi de modul de calcul al cifrei de control se găsesc pe link-ul:
https://www.scientia.ro/stiinta-la-minut/128-cultura-economie/459-cnp-codulnumeric-personal.html

Se va crea clasa Persoana cu variabile membre private nume (String) şi cnp (String).

Clasa va avea constructor cu parametri, gettere si settere în funcție de necesități şi metoda
getVarsta() care va calcula şi va returna vârsta persoanei extrăgând data nașterii din CNP şi
citind din sistem data curentă. Se va utiliza clasa LocalDate. Se va crea un vector în care se
vor adăuga obiectele de tip Persoana. Fiecare element din vectorul va fi afișat pe un rând în
formatul nume, CNP, varsta.
 */
public class Ex4 {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ok;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert n : ");
        int n = Integer.parseInt(scanner.nextLine());

        String[][] List;

        for (int i = 0; i < n; i++) {
            List = new String[i + 1][2];

            System.out.print("Insert Name : ");
            List[i][0] = scanner.nextLine();

            do {
                ok = true;
                System.out.print("Insert CNP : ");
                List[i][1] = scanner.nextLine();

                ok = isNumeric(List[i][1]);

            } while (List[i][1].length() != 13 || ok != true || List[i][1].charAt(0) != '1');
        }



    }
}
