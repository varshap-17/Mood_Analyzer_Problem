package test.bridgelabz;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
class TestCase32 {

	@Test
	void givenEmptyMoodShouldThrowMoodAnalysisExcetiontest() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		moodAnalyser.analyseMood(null);
		Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,null);
}
}
