package com.richluick.crystalball;

import java.util.Random;

import android.app.Activity;
import android.content.res.Resources;


public class CrystalBall extends Activity {
	
	protected String[] mAnswers;
	
	public void onCreate() { 
		Resources resources = getResources();
		mAnswers = resources.getStringArray(R.array.ball_answers);
	}
	
     public String getAnAnswer() {
		String answer = "";
		
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		return answer;
	}
}
