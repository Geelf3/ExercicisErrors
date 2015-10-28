

public class Node {
	
	Object value;
	Node next;
	
	
	public Node(Object value) {
		super();
		if (value == null) {
			throw new AlertaNulls("Error: valor nul");
		}
		this.value = value;
	}


	public Object getValue() {
		if (value == null) {
			throw new AlertaNulls("Error: no retorno valor");
		}
		return value;
	}


	public void setValue(Object value) {
		if (value == null) {
			throw new AlertaNulls("Error: no assigno valor");
		}
		this.value = value;
	}


	public Node getNext() {
		if (next == null) {
			throw new AlertaNulls("Error: No hi ha següent");
		}
		return next;
	}


	public void setNext(Node next) {
		if (next == null) {
			throw new AlertaNulls("Error: No es pot afegir un següent que sigui nul");
		}
		this.next = next;
	}
	

}
