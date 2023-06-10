package OyIslemleriTest;

import static org.junit.Assert.*;

import org.junit.Test;

import OyIslemleri.OyArttirma;

public class OyArttirmaTest {
	@Test
	public void testOyArttir() {
		// GIVEN
	String OyA = ("A");
	String OyB = ("B");
	String OyC = ("C");
	
	  //WHEN
	String yeniOy = OyArttirma.partiOyArttir(OyA);
	String yeniOy2 = OyArttirma.partiOyArttir(OyB);
	String yeniOy3 = OyArttirma.partiOyArttir(OyC);
	
	//THEN
	assertEquals(1,OyArttirma.partiAOy);
	assertEquals(1,OyArttirma.partiBOy);
	assertEquals(1,OyArttirma.partiCOy);
	
	}

}
