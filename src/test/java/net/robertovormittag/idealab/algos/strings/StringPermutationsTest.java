package net.robertovormittag.idealab.algos.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringPermutationsTest {

    private StringPermutations sp;

    @Before
    public void setUp() throws Exception {
        String stringToPermutate = "eat";
        sp = new StringPermutations(stringToPermutate);
    }

    @After
    public void tearDown() throws Exception {
        sp = null;
    }

    @Test
    public void testPermutate() throws Exception {
        List<String> permutations = sp.permutate();
        permutations.forEach(item -> System.out.println(item));
    }
}
