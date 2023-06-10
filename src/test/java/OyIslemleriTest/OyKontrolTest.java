package OyIslemleriTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import OyIslemleri.OyKontrol;



public class OyKontrolTest {
	@Test
	public void testOyKontrol() {
		// GIVEN
	String OyA = "A";
	String OyB = "B";
	String OyC = "C";
	
	  //WHEN
	String yeniOy = OyKontrol.oyKontrolEt(OyA);
	String yeniOy2 = OyKontrol.oyKontrolEt(OyB);
	String yeniOy3 = OyKontrol.oyKontrolEt(OyC);
	
	//THEN
	assertEquals(0,OyKontrol.partiAOy);
	assertEquals(0,OyKontrol.partiBOy);
	assertEquals(0,OyKontrol.partiCOy);
	
	}
}
