package TroyMain;

import com.revature.eval.java.core.EvaluationService;

public class TroyMain{

	public static void main(String[] args) {
		
		acronym("Portable Network Graphics");
		acronym("First In, First Out");
		acronym("GNU Image Manipulation Program");
		acronym("Complementary metal-oxide semiconductor");
		
		
	}
	public static void acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		
		
		String[] words = phrase.split(" ");
		char[] acr = new char[words.length];
		
		
		for (String w : words) {
			System.out.println(w);
		}
		
		System.out.println();
			
	}

}
