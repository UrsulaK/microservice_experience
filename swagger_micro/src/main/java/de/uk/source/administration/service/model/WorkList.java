package de.uk.source.administration.service.model;

import java.util.HashMap;

public class WorkList extends HashMap<String, Work>{

	private static WorkList WorkList = new WorkList( );
	
	   private WorkList(){ }
	   
	
	   public static WorkList getInstance( ) {
	      return WorkList;
	   }
}
