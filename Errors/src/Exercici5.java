import java.util.LinkedList;

public class Exercici5 {

	public static void main(String[] args) {
		// 1: Create the LinkedList
		LinkedList<Cotxe> llistaCotxes = new LinkedList<Cotxe>();

		// 2: add 5 cars with the given params in the exercise.
		llistaCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		llistaCotxes.add(new Cotxe("Dacia", "Sadero", 1200, 4));
		llistaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		llistaCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		llistaCotxes.add(new Cotxe("Seat", "Ibiza", 1600, 4));

		// 3: Add 2 cars
		// a) This one at the beginning
		llistaCotxes.offerFirst(new Cotxe("Hyundai", "Atos", 1500, 3));
		// b) This one at the end
		llistaCotxes.offerLast(new Cotxe("Ford", "Focus", 2000, 4));

		// 4: We try to add a duplicate
		if (llistaCotxes.offer(new Cotxe("Hyundai", "Atos", 1500, 3))) {
			System.out.println("S'ha pogut afegir el duplicat");
		}

		// 5: We try to insert a car in the 1rs position
		llistaCotxes.add(1, new Cotxe("Audi", "A8", 4600, 8));

		// 6: Replace Seat Ibiza for a Seat Mii
		for (int i = 0; i < llistaCotxes.size(); i++) {
			if (llistaCotxes.get(i).getMarca() == "Seat" && llistaCotxes.get(i).getModel() == "Ibiza") {
				llistaCotxes.set(i, new Cotxe("Seat", "Mii", 1000, 3));
			}
		}

		// 7: Delete the first car of the linkedList.
		llistaCotxes.removeFirst();

		// 8: Which position has the Hyundai?
		for (int i = 0; i < llistaCotxes.size(); i++) {
			if (llistaCotxes.get(i).getMarca() == "Hyundai") {
				System.out.println("La posició del Hyundai és: " + i);
			}
		}

	}

}
