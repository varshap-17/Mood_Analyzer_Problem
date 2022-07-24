package test.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTestTC2 {

	@Test
	public void givenMessagewherenotSad_sholudreturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("happy");
		String mood=moodAnalyser.analyseMood();  //This is a Happy message
		Assert.assertEquals("HAPPY", mood);
	}

}
