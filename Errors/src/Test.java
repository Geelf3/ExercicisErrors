
public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		}
		catch (Exception e){
			System.out.println("Vigila, estàs dividint per 0");
		}
	}
}
