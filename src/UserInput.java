
public class UserInput {
	public static void main(String[] args) throws Exception {
		ArduinoReader ar1 = new ArduinoReader();
		String x = ar1.getInputLine();
		System.out.println(x);
	}
}
