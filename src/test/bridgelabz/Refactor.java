package test.bridgelabz;

public class Refactor {
	private String message;
	
	public Refactor() {
		this.message=message;
	}
	public Refactor(String message) {
		this.message=message;
	}
	public String analyseMood(String message) {
		this.message=message;
		return message;
	}
	public String analyseMood() {
		try {
			if(message.contains("Sad")) {
				return "SAD";
			}else
				return "HAPPY";
		}catch(NullPointerException e) {
			return "Happy";
		}
	}
}