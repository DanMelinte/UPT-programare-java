package Lab3.Laborator;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static class Punct {
        private int x;
        private static int y;
        public Punct(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
    public static void main(String[] args) {

        List<Punct> puncte = new ArrayList<Punct>();

        puncte.add(new Punct(1, 2));
        puncte.add(new Punct(3, 4));
        puncte.add(new Punct(5, 6));

        System.out.println("Lista contine punctele:");
        for (Punct p : puncte) {
            System.out.println(p);
        }

        puncte.remove(0);

        System.out.println("Dupa stergerea primului element lista contine punctele:");
        for (int i = 0; i < puncte.size(); i++)
            System.out.println(puncte.get(i));
    }
}
