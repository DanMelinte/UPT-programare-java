package Ex2;

public class PerecheNumere {
    private int a, b;

    public PerecheNumere() {
    }

    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + ", " + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //o metodă care va returna o valoare booleana care indică dacă cele două numere care
    //formează perechea sunt numere consecutive în șirul lui Fibonaci
    public boolean isFibonaci(PerecheNumere n) {
        long square1 = n.getA();
        long square2 = n.getB();

        double a1 = Math.sqrt((5 * square1) + 4);
        double a2 = Math.sqrt((5 * square1) - 4);

        double b1 = Math.sqrt((5 * square2) + 4);
        double b2 = Math.sqrt((5 * square2) - 4);

        if ((a1 % 1 == 0 || a2 % 1 == 0) && (b1 % 1 == 0 || b2 % 1 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    //o metodă care returnează cel mic multiplu comun al celor două numere
    public int cmmc(PerecheNumere n) {

        int number1 = n.getA();
        int number2 = n.getB();

        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

}
