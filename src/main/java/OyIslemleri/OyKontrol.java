package OyIslemleri;

public class OyKontrol {
	
	public static int partiAOy = 0;
	public static int partiBOy = 0;
	public static int partiCOy = 0;
	
	   public static String oyKontrolEt(String partiAdi){
	        if (partiAdi.equals("A")) {
	           System.out.print(partiAOy);
	        } else if (partiAdi.equals("B")) {
	        	System.out.print(partiBOy);;
	        } else if (partiAdi.equals("C")) {
	        	System.out.print(partiCOy);;
	        }
			return partiAdi;
			
	    }

}
