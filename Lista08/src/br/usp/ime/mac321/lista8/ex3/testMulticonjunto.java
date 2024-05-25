package br.usp.ime.mac321.lista8.ex3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class testMulticonjunto {
    @Test
    public void testMCAL() {
        MulticonjuntoAL<String> conj1 = new MulticonjuntoAL<>();
        MulticonjuntoAL<String> conj2 = new MulticonjuntoAL<>();

        conj1.add("ABC");
        conj2.add("DEF");

        assertFalse(conj1.equals(conj2));
    }
}
