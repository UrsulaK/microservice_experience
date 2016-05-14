package de.uk.source.administration.service.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.uk.source.administration.service.model.Author;
import de.uk.source.administration.service.model.Citation;
import de.uk.source.administration.service.model.Quote;
import de.uk.source.administration.service.model.Work;

@RestController
public class SourceAdministrationController {

	@RequestMapping(value = "/source", method = RequestMethod.POST, produces = "application/json")
	public Quote createQuote(@RequestBody Citation citation){
		Author author = new Author(citation.getAuthorForename(), citation.getAuthorSurname());
		Work work = new Work(citation.getWorkTitle(),author);
		Quote quote = new Quote(citation.getQuoteText(), work);
		
		return quote;
	}
}
