package test.bridgelabz;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood(String message) {
		this.message=message;
		return analyseMood(message);
	}
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()==0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter the proper message");
			if(message.contains("Sad")) {
				return "SAD";
			}else
				return "HAPPY";
		}catch(NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper message");
		}
	}
	public String analyseMoodAgain() {
		// TODO Auto-generated method stub
		return null;
	}
}
