package de.uk.source.administration.service.model;

public class Citation extends Node{

	public Citation(String text, Work source, Work work){
		super();
		addLabel("Citation");
		Relation soureRelation = new Relation("EXTRACTED_FROM",source);
		addRelation(soureRelation);
		Relation relation = new Relation("USED_IN", work);
		addRelation(relation);
		addProperty("citation", text);
		String timeStamp = String.valueOf(System.currentTimeMillis());
		addProperty("date", timeStamp);
	}
	
	public void setWorkRelation(Work work){
		Relation relation = new Relation("USED_IN", work);
		addRelation(relation);
	}
}
