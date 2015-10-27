import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {

	public static void main(String[] args) {
		try {
			fitxer();
		} catch (FileNotFoundException e) {
			System.out.println("El fitxer no existeix");
		} catch (SecurityException e) {
			System.out.println("Error de seguretat");
		} catch (IOException e) {
			System.out.println("Error!");
			if (e.getClass().getName() == "java.io.FileNotFoundException") {
				System.out.println("El fitxer no existeix.");
			}
		}
	}
	// 2.1
	// Fem un throw amb les dues excepcions
	public static void fitxer() throws SecurityException, IOException{
		// Obrim un fitxer
		FileOutputStream f = new FileOutputStream("/docs/test.txt");
		f.close();
	}
	// No ens avisa del SecurityException perquè es del tipus RunTimeException
	
	// 2.2 
	// Omet FileNotFoundException perque ja agafem el IOException que és el seu pare.
	
}
