package de.uk.source.administration.service.model;

import java.util.HashMap;

public class CitationList extends HashMap<String, Citation>{
	private static CitationList citationList = new CitationList( );
	
	   private CitationList(){ }
	   
	
	   public static CitationList getInstance( ) {
	      return citationList;
	   }
}
