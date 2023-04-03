package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.*;

class Echipamente{
    private String denumire;
    private int nr_inv;
    private int pret;
    private String zona_mag;
    private StareEchipament stareEchipament;

    public Echipamente(String denumire, int nr_inv, int pret, String zona_mag, StareEchipament stareEchipament){
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stareEchipament = stareEchipament;
    }
}

class Imprimante extends Echipamente {
    private int ppm;
    private String rezolutie;
    private int p_car;
    private ModTiparire modTiparire;

    public Imprimante(String denumire, int nr_inv, int pret, String zona_mag, StareEchipament stareEchipament,
                      int ppm, String rezolutie, int p_car, ModTiparire modTiparire) {

        super(denumire, nr_inv, pret, zona_mag, stareEchipament);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.modTiparire = modTiparire;
    }
}

class Copiatoare extends Echipamente{
    private int p_ton;
    private Format format;

    public Copiatoare(String denumire, int nr_inv, int pret, String zona_mag, StareEchipament stareEchipament,
                      int p_ton, Format format) {

        super(denumire, nr_inv, pret, zona_mag, stareEchipament);

        this.p_ton = p_ton;
        this.format = format;
    }
}

class SistemeCalcul extends Echipamente{
    private String tip_mon;
    private float vit_proc;
    private int c_hdd;
    private OS os;

    public SistemeCalcul(String denumire, int nr_inv, int pret, String zona_mag, StareEchipament stareEchipament,
                         String tip_mon, float vit_proc, int c_hdd, OS os) {

        super(denumire, nr_inv, pret, zona_mag, stareEchipament);

        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.os = os;
    }
}

public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {

        List<Echipamente> list = new ArrayList<Echipamente>();

        System.out.println(
                "1.  Afişarea tuturor echipamentelor\n" +
                        "2.  Afişarea imprimantelor\n" +
                        "3.  Afişarea copiatoarelor\n" +
                        "4.  Afişarea sistemelor de calcul\n" +
                        "5.  Modificarea stării în care se află un echipament\n" +
                        "6.  Setarea unui anumit mod de scriere pentru o imprimantă\n" +
                        "7.  Setarea unui format de copiere pentru copiatoare\n" +
                        "8.  Instalarea unui anumit sistem de operare pe un sistem de calcul\n" +
                        "9.  Afişarea echipamentelor vândute\n" +
                        "10. serializarea / deserializarea colecției de obiecte în fișierul echip.bin\n"
        );

        Scanner read = new Scanner(new File("Laborator/src/Lab4/echipamente.txt"));

        while(read.hasNextLine()){

            String line = read.nextLine();
            String atributes[] = new String[line.split(";").length];

            atributes = line.split(";");

            if (atributes[5].compareTo("imprimanta") == 0) {

                Imprimante obj = new Imprimante(
                        atributes[0],
                        Integer.parseInt(atributes[1]),
                        Integer.parseInt(atributes[2]),
                        atributes[3],
                        StareEchipament.valueOf(atributes[4].toUpperCase()),

                        Integer.parseInt(atributes[5]),
                        atributes[6],
                        Integer.parseInt(atributes[7]),
                        ModTiparire.valueOf(atributes[8].toUpperCase()));

                list.add(obj);
            }
            else if (atributes[5].compareTo("copiator") == 0) {
                Copiatoare obj = new Copiatoare(
                        atributes[0],
                        Integer.parseInt(atributes[1]),
                        Integer.parseInt(atributes[2]),
                        atributes[3],
                        StareEchipament.valueOf(atributes[4].toUpperCase()),

                        Integer.parseInt(atributes[5]),
                        Format.valueOf(atributes[6].toUpperCase()));
                list.add(obj);
            }
            else {
                SistemeCalcul obj = new SistemeCalcul(
                        atributes[0],
                        Integer.parseInt(atributes[1]),
                        Integer.parseInt(atributes[2]),
                        atributes[3],
                        StareEchipament.valueOf(atributes[4].toUpperCase()),

                        atributes[5],
                        Float.parseFloat(atributes[6]),
                        Integer.parseInt(atributes[7]),
                        OS.valueOf(atributes[8].toUpperCase()));
                list.add(obj);
            }
        }
    }


}
