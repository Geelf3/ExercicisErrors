
public class AlertaNulls extends NullPointerException {
	
	private static final long serialVersionUID = 1L;
	
	String msg;
	
	public AlertaNulls(String c) {
		this.msg = c;
	}
	
	public String toString() {
		return "Avís en gestió de cues: " + msg;
	}

}
