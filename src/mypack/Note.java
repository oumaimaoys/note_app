package mypack;
import java.time.*;

class Note {
	private String title;
	private String body;
	private final LocalDate createdOnDate;
	private LocalDate modifiedOnDate;
	
	// getters and setters
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDate getCreatedOnDate() {
		return createdOnDate;
	}


	public LocalDate getModifiedOnDate() {
		return modifiedOnDate;
	}

	public void setModifiedOnDate(LocalDate modifiedOnDate) {
		this.modifiedOnDate = modifiedOnDate;
	}

	// constructor
	Note(String title, String body){
		this.setTitle(title);
		this.setBody(body);
		this.createdOnDate = LocalDate.now();
	}
	
	

}
