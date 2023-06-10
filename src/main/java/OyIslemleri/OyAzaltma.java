package OyIslemleri;

public class OyAzaltma {
	
	    public static int partiAOy = 1;
	    public static int partiBOy = 1;
	    public static int partiCOy = 1;

	    public static String oyAzalt(String partiAdi){
	        if (partiAdi.equals("A")) {
	            partiAOy--;
	        } else if (partiAdi.equals("B")) {
	            partiBOy--;
	        } else if (partiAdi.equals("C")) {
	            partiCOy--;
	        }
			return partiAdi;
			
	    }

}
