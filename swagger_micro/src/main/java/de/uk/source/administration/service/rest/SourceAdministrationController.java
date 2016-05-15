package de.uk.source.administration.service.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.uk.source.administration.service.api.AuthorREST;
import de.uk.source.administration.service.api.CitationREST;
import de.uk.source.administration.service.api.WorkREST;
import de.uk.source.administration.service.model.Author;
import de.uk.source.administration.service.model.Citation;
import de.uk.source.administration.service.model.Work;


@RestController
public class SourceAdministrationController {

	@Autowired
	private CitationREST citationREST;
	@Autowired
	private AuthorREST authorREST;
	@Autowired
	private WorkREST workREST;
	@RequestMapping(value = "/source", method = RequestMethod.POST)
	public Citation createCitation(@RequestParam String citationText, 
								@RequestParam String SourceId, 
								@RequestParam String workId){
		return citationREST.cite(citationText, SourceId, workId);
	}
	
	@RequestMapping(value = "/author", method = RequestMethod.POST)
	public Author createAuthor(@RequestParam String forename, 
								@RequestParam String surename){
		return authorREST.createAuthor(forename, surename);
	}
	
	@RequestMapping(value = "/work", method = RequestMethod.POST)
	public Work createWork(@RequestParam String title, @RequestParam String authorId, @RequestParam String type, @RequestParam String theme){
		return workREST.createWork(title, authorId, type, theme);
	}
	@RequestMapping(value = "/author", method = RequestMethod.GET)
	public Author getAuthor(@RequestParam String authorId){
		return authorREST.getAuthor(authorId);
	}
	@RequestMapping(value = "/work", method = RequestMethod.GET)
	public Work getWork(@RequestParam String workId){
		return workREST.getWork(workId);
	}
	@RequestMapping(value = "/source", method = RequestMethod.GET)
	public Citation getCitation(@RequestParam String citationId){
		return citationREST.getCitation(citationId);
	}
	
}
