package by.epam.tr.main4;

import java.util.ArrayList;
import java.util.List;

public class TextMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text text = new Text();
		text.setTitle("My Title");
		
		List<Word> sl = new ArrayList<Word>();
		sl.add(new Word("aaaa"));
		sl.add(new Word("bbb"));
		sl.add(new Word("ccc"));
		
		List<Word> sl2 = new ArrayList<Word>();
		sl2.add(new Word("abab"));
		sl2.add(new Word("dabab"));
		sl2.add(new Word("fabab"));
		
		Sentence sentence1= new Sentence(sl);
		Sentence sentence2= new Sentence(sl2);
		
		text.add(sentence1);
		text.add(sentence2);
		
		TextPtint print = new TextPtint();
		print.printToConsole(text);
		
	}

}
