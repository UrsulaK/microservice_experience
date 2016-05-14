package de.uk.source.administration.service.model;

public class Author extends Node{

	
	public Author(String forename, String surname){
		super();
		addLabel("Author");
		setForename(forename);
		setSurename(surname);
	}
	
	public void setForename(String forename){
		addProperty("Forename", forename);
	}
	public void setSurename(String surname){
		addProperty("Surname", surname);
	}
	
}
