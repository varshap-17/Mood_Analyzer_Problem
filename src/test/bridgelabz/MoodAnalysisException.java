	//UC3

package test.bridgelabz;

@SuppressWarnings("serial")
public class MoodAnalysisException extends Exception{
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType type;
	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}
}
