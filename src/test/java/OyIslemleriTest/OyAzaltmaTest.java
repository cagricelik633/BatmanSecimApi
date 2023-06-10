package OyIslemleriTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import OyIslemleri.OyAzaltma;


public class OyAzaltmaTest {
	
	@Test
	
	public void testOyAzalt() {
		// GIVEN
	String OyA = "A";
	String OyB = "B";
	String OyC = "C";
	
	  //WHEN
	String yeniOy = OyAzaltma.oyAzalt(OyA);
	String yeniOy2 = OyAzaltma.oyAzalt(OyB);
	String yeniOy3 = OyAzaltma.oyAzalt(OyC);
	
	//THEN
	assertEquals(0,OyAzaltma.partiAOy);
	assertEquals(0,OyAzaltma.partiBOy);
	assertEquals(0,OyAzaltma.partiCOy);
	
	}

}
