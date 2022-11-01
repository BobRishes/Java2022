package kodlama.io.Kodlama.io.Devs.entities.conretes;

import kodlama.io.Kodlama.io.Devs.entities.abstracts.Entity;

public class Language implements Entity {

	private int id;
	private String languageName;
	
	public Language(int id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	
	
}
