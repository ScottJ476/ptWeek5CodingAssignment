package ptWeek5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		String message = "Hello";
		
		asteriskLogger.log(message);
		
		System.out.println("");
		asteriskLogger.error(message);
		
		System.out.println("");
		spacedLogger.log(message);
		
		System.out.println("");
		spacedLogger.error(message);

	}

}
