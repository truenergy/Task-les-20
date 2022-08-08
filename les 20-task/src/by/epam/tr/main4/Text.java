package by.epam.tr.main4;

import java.util.ArrayList;
import java.util.List;

public class Text {
private String title;
private List<Sentence> text;


public Text() {
	text = new ArrayList<Sentence>();
	
}

public Text (List<Sentence> sentence) {
	text = new ArrayList<Sentence>();
	text.addAll(sentence);
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public List<Sentence> getText() {
	return text;
}

public void setText(List<Sentence> text) {
	this.text = text;
}
public boolean add(Sentence sentence){
	text.add(sentence);
	return true;
}
}
