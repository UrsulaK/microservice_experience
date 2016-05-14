package de.uk.source.administration.service.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Node {

	public Node(){
		setId();
	}
	private String id;
	
	private Set<String> labels = new HashSet<String>();
	private Set<Relation> relations = new HashSet<Relation>();
	private Map<String, String> properties = new HashMap<String, String>();
	
	public void setId() {
		if(this.id == null){
			this.id = UUID.randomUUID().toString();
		}
	}
	public String getId()
	{
		return this.id;
	}
	public void addLabel(String labelName){
		this.labels.add(labelName);
	}
	public Set<String> getLabels(){
		return this.labels;
	}
	public void addRelation(Relation relation){
		this.relations.add(relation);
	}
	public Set<Relation> getRelations(){
		return relations;
	}
	public void addProperty(String propertyName, String property){
		this.properties.put(propertyName, property);
	}
	public Map<String, String> getProperties(){
		return this.properties;
	}
}
