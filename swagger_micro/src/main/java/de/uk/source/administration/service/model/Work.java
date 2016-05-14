package de.uk.source.administration.service.model;

public class Work extends Node{

	public Work(String title, Author author){
		super();
		setLabel("Work");
		setTile(title);
		setAuthorRelation(author);
	}
	public void setTile(String title){
		addProperty("Title", title);
	}
	public void setLabel(String label){
		addLabel(label);
	}
	public void setAuthorRelation(Author author){
		Relation relation = new Relation("WRITTEN_BY",author);
		addRelation(relation);
	}
}
