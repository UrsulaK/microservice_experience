package de.uk.source.administration.service.api;

import org.springframework.stereotype.Component;

import de.uk.source.administration.service.model.Author;
import de.uk.source.administration.service.model.Citation;
import de.uk.source.administration.service.model.Source;

@Component
public class CitationFacade {

	public Citation cite(String citationText, String authorSurname, String authorForename, String sourceTitle, String publishedDate){
		Author author = new Author(authorForename, authorSurname);
		Source work = new Source(sourceTitle,author);
		Citation quote = new Citation(citationText, work);
		return quote;
	}
}
