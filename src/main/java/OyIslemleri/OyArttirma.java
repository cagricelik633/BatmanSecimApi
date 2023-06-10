package OyIslemleri;

public class OyArttirma {
	
	    public static int partiAOy = 0;
	    public static int partiBOy = 0;
	    public static int partiCOy = 0;

	    public static String partiOyArttir(String partiAdi){
	        if (partiAdi.equals("A")) {
	            partiAOy++;
	        } else if (partiAdi.equals("B")) {
	            partiBOy++;
	        } else if (partiAdi.equals("C")) {
	            partiCOy++;
	        }
			return partiAdi;
			
			
	    }

}
