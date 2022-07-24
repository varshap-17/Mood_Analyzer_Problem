package test.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class TestCase31 {

	@Test
	void givenNullMoodShouldThrowExcetiontest() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		
		ExpectedException exceptionRule=ExpectedException.none();
		exceptionRule.expect(MoodAnalysisException.class);
		moodAnalyser.analyseMood(null);
		Assert.assertEquals("Please enter the proper message",null);
	}
}
