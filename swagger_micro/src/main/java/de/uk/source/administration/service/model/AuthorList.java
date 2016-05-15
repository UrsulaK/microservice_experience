package de.uk.source.administration.service.model;

import java.util.HashMap;

public class AuthorList extends HashMap<String, Author>{

	private static AuthorList authorList = new AuthorList( );
	
	   private AuthorList(){ }
	   
	
	   public static AuthorList getInstance( ) {
	      return authorList;
	   }
	   
}
