package de.uk.source.administration.service.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import de.uk.source.administration.service.api.CitationFacade;
import de.uk.source.administration.service.model.Citation;


@RestController
public class SourceAdministrationController {

	@Autowired
	private CitationFacade citationFacade;
	@RequestMapping(value = "/source", method = RequestMethod.POST, produces = "application/json")
	public Citation createQuote(@RequestParam String citationText, 
			@RequestParam String authorSurname, 
			@RequestParam String authorForename, 
			@RequestParam String sourceTitle, 
			@RequestParam String publishedDate){
		return citationFacade.cite(citationText, authorSurname, authorForename, sourceTitle, publishedDate);
	}
	
}
