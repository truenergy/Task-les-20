package by.epam.tr.main4;

public class TextPtint {

	public  void printToConsole(Text text) {
		System.out.println(text.getTitle().toUpperCase());
	for(Sentence s: text.getText()) {
		System.out.print(createAsString(s));
		System.out.print(" ");
	}
	
	}
	private String createAsString(Sentence s) {
		String sentence = "";
		for (Word w: s.getSentence()) {
			sentence= sentence+w.getWord()+" ";
		}
		sentence.trim();
		return sentence;
	}

}
