package teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import Ex2.*;

public class TesteEx2 {
    //@Test
    //void test1_Fib() {
    //    PerecheNumere c = new PerecheNumere(4, 5);
    //    assertEquals(9, c.isFibonaci(c));
    //}

    @Test
    void test2_Fib() {
        PerecheNumere c = new PerecheNumere(1, 2);
        assertTrue(c.isFibonaci(c) == true);
    }

    @Test
    void test3_Fib() {
        PerecheNumere c = new PerecheNumere(4, 5);
        assertFalse(c.isFibonaci(c) == false);
    }

    void test3_Fib() {
        PerecheNumere c = new PerecheNumere(4, 5);
        assertFalse(c.isFibonaci(c) == false);
    }
}


