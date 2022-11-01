package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;

public interface LanguageService {

	public void add(Language language,String name) throws Exception;
	public void remove(int id);
	public void update(Language language,int id);
	public List<Language> getAll();
	Language find(int id);
	
}
