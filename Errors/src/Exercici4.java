
public class Exercici4 {
	
	public static void main(String[] args) {
		try {
			Persona p = new Persona();
			p.setEdat(4);
		} catch (IllegalArgumentException e) {
			System.out.println("L'edat ha de ser major de 0");
		}
	}
		
	public static class Persona {
	    private int edat;
	    
	    public void setEdat(int edat) throws IllegalArgumentException {
	        this.edat = edat;
	        if (edat < 0) {
	        	throw new IllegalArgumentException();
	        }
	        System.out.println("L'edat és: " + this.edat);
	    }
	}
}
