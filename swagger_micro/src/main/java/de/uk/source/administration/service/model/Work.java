package de.uk.source.administration.service.model;

public class Work extends Node{

	public Work(String title, Author author, String type, String theme){
		super();
		addLabel("Work");
		addLabel(type);
		setTitle(title);
		setTheme(theme);
		setAuthorRelation(author);
	}
	public void setTheme(String theme){
		addProperty("Thema", theme);
	}
	public void setTitle(String title){
		addProperty("Title", title);
	}
	public void setType(String type){
		addLabel(type);
	}
	public void setAuthorRelation(Author author){
		Relation relation = new Relation("WRITTEN_BY",author);
		addRelation(relation);
	}
	
}
