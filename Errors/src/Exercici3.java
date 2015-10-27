public class Exercici3 {
	
	public static void main(String[] args) {
		try {
			// Provem el mètode.
			System.out.println(divisio(8, 4));
			// i agafem l'excepció
		} catch (ArithmeticException e) {
			System.out.println("Error");
		}
	}
	// Fem la funció divisió
	private static double divisio(double a, double b) throws ArithmeticException {
		// Si el divisor és 0 creem l'objecte excepció i el llancem.
		if (b == 0) {
			throw new ArithmeticException();
		} 
		return a/b;
	}

}
