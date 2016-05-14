package de.uk.source.administration.service.model;

public class Quote extends Node{

	public Quote(String text, Work work){
		super();
		addLabel("Quote");
		Relation relation = new Relation("EXTRACTED_FROM",work);
		addRelation(relation);
		addProperty("citation", text);
		String timeStamp = String.valueOf(System.currentTimeMillis());
		addProperty("date", timeStamp);
	}
	
}
