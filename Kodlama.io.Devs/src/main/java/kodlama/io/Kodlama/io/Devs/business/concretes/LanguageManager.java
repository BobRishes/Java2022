package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	
	
	
	
	
	
	
	
	@Override
	public void add(AddLanguageRequest addLanguageRequest) throws Exception {
		
		Language language = new Language();
		language.setLanguageName(addLanguageRequest.getLanguageName());
		
		if(isExist(language)) {
			this.languageRepository.save(language);
		}else {
			throw new Exception("Bu dil mevcut/This programming language is avaible");
		}
	
	}

	
	
	
	
	
	
	
	@Override
	public void remove(RemoveLanguageRequest removeLanguageRequest) {
		this.languageRepository.deleteById(removeLanguageRequest.getId());
	}

	
	
	
	
	
	
	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages=languageRepository.findAll();
		List<GetAllLanguageResponse> languageResponse=new ArrayList<GetAllLanguageResponse>();
		
		for(Language language:languages) {
			GetAllLanguageResponse responseItem= new GetAllLanguageResponse();
			responseItem.setId(language.getId());
			responseItem.setLanguageName(language.getLanguageName());
			
			languageResponse.add(responseItem);
		}
		
		return languageResponse;
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		List<Language>languages=languageRepository.findAll();
		
		for(Language language:languages){
			if(updateLanguageRequest.getId()==language.getId()) {
				language.setLanguageName(updateLanguageRequest.getLanguageName());
				this.languageRepository.save(language);
			}else {
				System.out.println("başarısız güncelleme");
				
			}
		}
		
	}

	@Override
	public GetLanguageByIdResponse find(int id) {
		
		Language language=this.languageRepository.findById(id).get();
		GetLanguageByIdResponse getLanguageByIdResponse=new GetLanguageByIdResponse();
		getLanguageByIdResponse.setLanguageName(language.getLanguageName());
		getLanguageByIdResponse.setId(language.getId());
		
		return getLanguageByIdResponse;		
	}


	public boolean isExist(Language language) {
		
		boolean exist=true;
		List<Language> languages =languageRepository.findAll();
		for(Language languagee:languages){
			if(language.getLanguageName().toLowerCase().equals(languagee.getLanguageName().toLowerCase())) {
				exist=false;
				return exist;
			}
			
		}	return exist;	
	}
	
	
	
	
	
	//	private boolean nameValid(Language language)  throws Exception {
//		
//		if(language.getLanguageName().isEmpty()|| language.getLanguageName().isBlank()) {
//			throw new Exception("Program dili boş geçilemez!");
//		}
//		
//		return true;
//		
//	}
//	
//	private boolean nameValid2(String name) throws Exception{
//		
//		for(Language language:languageRepository.findAll()) {
//			if(	language.getLanguageName()==name) {
//				throw new Exception("Bu program dili mevcut!");
//			}
//			
//		}
//		
//		return true;
//	}
	

}
