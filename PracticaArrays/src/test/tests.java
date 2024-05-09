package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;
class tests {
	static int[]notasB;
	static int[]notasM;

    @BeforeAll
    public static void arrays() {
        notasB = new int[]{7, 8, 9, 10};
        notasM = new int[]{12,2,4};
    }
    

    @Test
    public void testMedia() {

        float esperado = (float) 8.5; 
        float obtenido = MisArrays.mediaNota(notasB);
        assertEquals(esperado, obtenido);
    }

	

}
