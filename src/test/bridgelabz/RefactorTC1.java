package test.bridgelabz;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class RefactorTC1 {

	@Test
	void ReturnSadMoodtest() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("SAD");
		String mood = "SAD";
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		Assert.assertEquals("SAD", mood);
	}
	}
}
