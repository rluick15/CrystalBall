package com.example.crystalball;

import java.util.Random;

import android.app.Activity;
import android.content.res.Resources;


public class CrystalBall extends Activity {
	
//	protected String[] mAnswers;
	
	public String[] mAnswers = {
			"It is certain",
	        "It is decidedly so",
	        "All signs say YES",
	        "The stars are not aligned",
	        "My reply is no",
	        "It is doubtful",
	        "Better not tell you now",
	        "Concentrate and ask again",
	        "Unable to answer now"
			
	};
	
//	public void onCreate() { 
//		Resources resources = getResources();
//		mAnswers = resources.getStringArray(R.array.ball_answers);
//	}
	
     public String getAnAnswer() {
		String answer = "";
		
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		return answer;
	}
}
