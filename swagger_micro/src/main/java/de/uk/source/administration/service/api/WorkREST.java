package de.uk.source.administration.service.api;

import org.springframework.stereotype.Component;

import de.uk.source.administration.service.model.Author;
import de.uk.source.administration.service.model.AuthorList;
import de.uk.source.administration.service.model.Work;
import de.uk.source.administration.service.model.WorkList;

@Component
public class WorkREST {

	private WorkList workList = WorkList.getInstance();
	private AuthorList authorList = AuthorList.getInstance();
	public Work createWork(String title, String authorId, String type, String theme){
		Author author = authorList.get(authorId);
		Work work = new Work(title, author, type, theme);
		workList.put(work.getId(), work);
		return work;
	}
	
	public boolean deleteWork(String workId){
		if(workList.containsKey(workId)){
			workList.remove(workList.get(workId));
		}
		return true;
	}
	
	public Work getWork(String workId){
		if(workList.containsKey(workId)){
			return workList.get(workId);
		}
		return null;
	}
	
	public Work updateWork(String workId, Author author, String title, String type, String theme){
		if(workList.containsKey(workId)){
			
			workList.get(workId).setAuthorRelation(author);
			workList.get(workId).setTitle(title);
			workList.get(workId).setType(type);
			workList.get(workId).setTheme(theme);
			return workList.get(workId);
		}
		return null;
	}
	
}
