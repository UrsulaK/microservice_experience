package de.uk.source.administration.service.model;

public class Citation extends Node{

	public Citation(String text, Source source){
		super();
		addLabel("Citation");
		Relation relation = new Relation("EXTRACTED_FROM",source);
		addRelation(relation);
		addProperty("citation", text);
		String timeStamp = String.valueOf(System.currentTimeMillis());
		addProperty("date", timeStamp);
	}

}
