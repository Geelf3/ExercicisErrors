
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
			System.out.println("Mostrem el misstage de 'getMessage': " + e.getMessage());
			System.out.println("Mostrem el missatge de 'getCause': " + e.getCause());
			System.out.println("Mostrem el missatge de 'getLocalizedMessage': " + e.getLocalizedMessage());
			System.out.println("Missatge de 'getClass': " + e.getClass());
			System.out.println("Missatge de 'getSupressed': " + e.getSuppressed());
			e.printStackTrace();
		} finally {
			System.out.println("Codi de finally");
		}	
		
		// 1.8
		// Probem de fer el try and catch en el main i veiem que l'error prohibeix que s'acabin les funcions cridades.
//		try {
		f1();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("T'has passat de voltes.");
//		}

	}
	// 1.9
	// Posem el try anad catch a cadascuna de les fucions per donar-nos compte de que l'error se soluciona controlant l'error 
	// a la funció on hi ha el possible codi amb l'error.
	public static void f1() {
		System.out.println("Estic a la funció 1");
		try {
		f2();
		} catch (Exception e) {
			System.out.println("T'has passat de voltes.");
		}
		System.out.println("Aqui acaba la funció 1");
	}
	private static void f2() {
		System.out.println("Estic a la funció 2");
//		try {
		f3();
//		} catch (Exception e) {
//			System.out.println("T'has passat de voltes.");
//		}
		System.out.println("Aqui acaba la funció 2");
	}
	private static void f3() {
		System.out.println("Estic a la funció 3: ");
		String[] salutacions= {"hola", "hi", "aloha", "alo"};
		try {
			for (int i = 0; i < salutacions.length + 1; i++) {
				System.out.println(salutacions[i]);
			}
		} catch (Exception e) {
			System.out.println("T'has passat de voltes.");
		}
		System.out.println("Aqui acaba la funció 3");
	} 
	
	
}
