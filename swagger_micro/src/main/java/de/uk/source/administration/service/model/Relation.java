package de.uk.source.administration.service.model;

public class Relation{

	private String relationName;
	private Node node;
	public Relation(String relationName, Node node){
		this.relationName = relationName;
		this.node = node;
	}
	
	public Node getNode() {
		return node;
	}
	public String getRelationName() {
		return relationName;
	}
	
}
