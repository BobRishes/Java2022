package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;

@Service
public class LanguageManager implements LanguageService {

	LanguageRepository languageRepository;
	
	
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language,String name) throws Exception {
		if(nameValid(language)==false && nameValid2(name)== false) {
			throw new Exception("Ekleme başarısız");
		}
			languageRepository.add(language);    	
		
		
	}

	@Override
	public void remove(int id) {
		languageRepository.remove(id);		
		
	}

	@Override
	public void update(Language language, int id) {
		languageRepository.update(language, id);			
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();  
	}

	@Override
	public Language find(int id) {
		
		return languageRepository.find(id);		
	}

	private boolean nameValid(Language language)  throws Exception {
		
		if(language.getLanguageName().isEmpty()|| language.getLanguageName().isBlank()) {
			throw new Exception("Program dili boş geçilemez!");
		}
		
		return true;
		
	}
	
	private boolean nameValid2(String name) throws Exception{
		
		for(Language language:languageRepository.getAll()) {
			if(	language.getLanguageName()==name) {
				throw new Exception("Bu program dili mevcut!");
			}
			
		}
		
		return true;
	}
	

}
