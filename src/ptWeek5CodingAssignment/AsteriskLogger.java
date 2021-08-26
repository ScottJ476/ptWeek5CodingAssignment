package ptWeek5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String message = "***ERROR: " + error + "***";
		
		System.out.println(printStars(message));
		System.out.println(message);
		System.out.println(printStars(message));
		
		
	}
	
	private String printStars (String message) {
		StringBuilder stars = new StringBuilder();
		
		for(int i = 0; i < message.length(); i++) {
			stars.append('*');
		}
		
		return stars.toString();
	}

}
