package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;


public interface LanguageRepository {
								
	
	public void add(Language language);
	public void remove(int id);
	public void update(Language language,int id);
	public List<Language> getAll();
	Language find(int id);
	
}
