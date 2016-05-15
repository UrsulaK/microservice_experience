package de.uk.source.administration.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import de.uk.source.administration.service.model.Citation;
import de.uk.source.administration.service.model.CitationList;
import de.uk.source.administration.service.model.Work;


@Component
public class CitationREST {

	
	@Autowired
	private WorkREST workREST;
	private CitationList citationList = CitationList.getInstance();
	
	public Citation cite(String citationText, String SourceId, String workId){
		
		Work work = workREST.getWork(workId);
		Work source = workREST.getWork(SourceId);
		Citation citation = new Citation(citationText, source, work);
		citationList.put(citation.getId(), citation);
		return citation;
	}
	
	public Citation getCitation(String citationId){
		return citationList.get(citationId);
	}
}
