package ptWeek5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ").trim());
		
	}

	@Override
	public void error(String error) {
		String spacedMessage = error.replace("", " ").trim();
		
		System.out.println("ERROR: " + spacedMessage);
		
	}

}
