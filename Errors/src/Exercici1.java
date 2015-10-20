
public class Exercici1 {
	
	public static void main(String[] args) {
		
		// 1.1 
		// Creem un array i fem que es passi de voltes perque salti l'error de OutOfBounds
		// veiem que salta l'error de ArrayIndexOutOfBoundsException
		String[] salutacions= {"hola", "hi", "aloha", "alo"};
		// 1.4 
		// Fem el try and catch amb l'excepció corresponent
		// i veiem que el missatge de "Final de programa" si que surt perque l'error esta controlat.
		try {
			for (int i = 0; i < salutacions.length + 1; i++) {
				System.out.println(salutacions[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Execució codi del catch");
		// 1.5 
		// Afegim un block finally amb un Syso per veure com actua.
		// mentre duri l'error el finally es compleix.
		// Si triem l'error el finally es segueix executant.
		} finally {
			System.out.println("Codi de finally");
		}	

		// 1.2
		// Posem un Syso despres de produirse l'error aviam si ho printa:
		System.out.println("Final del programa");
		// Veiem que no s'executa res després de l'error.
		
		// 1.3
		// Perque s'executi el syso hauriem d'atrapar l'error amb un Try and  Catch.
		
		// 1.6
		// El codi del catch no s'executa perque no estem treballant amb un String
		// sino amb un array.
		// Si capturem amb exception si que s'executa el codi del catch.
		try {
			for (int i = 0; i < salutacions.length + 1; i++) {
				System.out.println(salutacions[i]);
			}
		} catch (Exception e) {
			// 1.7
			// Mostrem les propietats de "Exception"
			System.out.println("Execució codi del catch");
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		} finally {
			System.out.println("Codi de finally");
		}	

	}
}
