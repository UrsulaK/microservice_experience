package de.uk.source.administration.service.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import de.uk.source.administration.service.model.Author;
import de.uk.source.administration.service.model.AuthorList;

@Component
public class AuthorREST {

	AuthorList authorList = AuthorList.getInstance();
	
	public Author createAuthor(String forename, String surname){
		Author author = new Author(forename, surname);
		authorList.put(author.getId(), author);
		return author;
	}
	
	public boolean deleteAuthor(String authorId){
		if(authorList.containsKey(authorId)){
			authorList.remove(authorList.get(authorId));
		}
		return true;
	}
	
	public Author getAuthor(String authorId){
		if(authorList.containsKey(authorId)){
			return authorList.get(authorId);
		}
		return null;
	}
	
	public Author updateAuthor(String authorId, String forename, String surname){
		if(authorList.containsKey(authorId)){
			authorList.get(authorId).setForename(forename);
			authorList.get(authorId).setSurename(surname);
			return authorList.get(authorId);
		}
		return null;
	}
}
