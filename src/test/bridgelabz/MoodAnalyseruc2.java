package test.bridgelabz;

public class MoodAnalyseruc2 {
	public void givenNullMoodShouldThrowException() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		@SuppressWarnings("unused")
		String mood=moodAnalyser.analyseMood();
	}
}
