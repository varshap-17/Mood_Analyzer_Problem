package test.bridgelabz;

public class MoodAnalyseruc1 {
	public void givenNullMoodShouldReturnnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		@SuppressWarnings("unused")
		String mood=moodAnalyser.analyseMood();
	}
	
}
