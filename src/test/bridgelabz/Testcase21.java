package test.bridgelabz;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class Testcase21 {

	private static final String mood = "HAPPY";

	@Test
	void givenNullMoodShouldReturnHappytest() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("HAPPY");
		try {
			@SuppressWarnings("unused")
			String mood=moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("HAPPY",mood);
		}
	}

}
