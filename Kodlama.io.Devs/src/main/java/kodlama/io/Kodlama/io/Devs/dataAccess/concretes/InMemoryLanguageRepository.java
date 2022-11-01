package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	
	}

	@Override
	public void add(Language language) {
		languages.add(new Language (language.getId(),language.getLanguageName()));
		
	}

	@Override
	public void remove(int id) {
		languages.remove(id);
		
	}

	@Override
	public void update(Language language,int id) {
		for(Language newLanguage:languages) {
			if(newLanguage.getId()== id) {
				newLanguage.setLanguageName(language.getLanguageName());
			}
		}
		
	}

	@Override
	public List<Language> getAll() {
		return languages;
		
	}

	@Override
	public Language find(int id) {
		
		for(Language language:languages) {
			if(language.getId()==id ) {
				return language;
			}
		}
		return null;
	}
	
}

	