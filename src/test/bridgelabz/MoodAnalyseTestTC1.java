package test.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyseTestTC1 {

	@Test
	public void giveMessage_whereSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("SAD");
		String mood=moodAnalyser.analyseMood(); //this is a sad message
		Assert.assertEquals("SAD", mood);
	}

}
