package test.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RefactorTC2 {

	@Test
	void ReturnHappyMoodtest() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("HAPPY");
		String mood="HAPPY";
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
			Assert.assertEquals("HAPPY", mood);
		}
	}