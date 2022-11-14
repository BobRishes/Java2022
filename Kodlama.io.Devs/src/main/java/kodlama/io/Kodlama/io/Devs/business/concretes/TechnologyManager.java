package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.AddTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.conretes.Language;
import kodlama.io.Kodlama.io.Devs.entities.conretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;
	

	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(AddTechnologyRequest addTechnologyRequest) {

		Technology technology=new Technology();
		technology.setTechnologyName(addTechnologyRequest.getTechnologyName());
		
		Language language = languageRepository.findById(addTechnologyRequest.getLanguageId()).get();
		technology.setLanguage(language);
		
			if(isExist(technology)) {
				technologyRepository.save(technology);
				System.out.println(technology.getTechnologyName()+" teknolojisi eklendi.");
				
			}else {
				System.out.println("Teknoloji ekleme başarısız.");
			}
		}
		
	
	@Override
	public void remove(RemoveTechnologyRequest removeTechnologyRequest) {
		technologyRepository.deleteById(removeTechnologyRequest.getId());
		
	}


	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
	
		Technology technology=this.technologyRepository.findById(updateTechnologyRequest.getId()).get();	
		technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());

		Language language=this.languageRepository.findById(updateTechnologyRequest.getId()).get();
		technology.setLanguage(language);
		
		technologyRepository.save(technology);
		
		
		
		
	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		
		List<Technology> technologies= technologyRepository.findAll();
		List<GetAllTechnologyResponse> getAllTechnologyResponses= new ArrayList<GetAllTechnologyResponse>();
		
		for(Technology technology:technologies) {
			GetAllTechnologyResponse responseItem=new GetAllTechnologyResponse();
		
			responseItem.setId(technology.getId());
			responseItem.setTechnologyName(technology.getTechnologyName());
			responseItem.setLanguage(technology.getLanguage().getLanguageName());
			
			getAllTechnologyResponses.add(responseItem);
		}
		
		return getAllTechnologyResponses;
	}


	
	@Override
	public GetTechnologyByIdResponse find(int id) {
	
		GetTechnologyByIdResponse getTechnologyByIdResponse= new GetTechnologyByIdResponse();
		
		Technology technology=technologyRepository.findById(id).get();
		
		
		getTechnologyByIdResponse.setId(technology.getId());
		getTechnologyByIdResponse.setTechnologyName(technology.getTechnologyName());
		getTechnologyByIdResponse.setLanguage(technology.getLanguage().getLanguageName());
		
		return getTechnologyByIdResponse;	
		
	}

	
	public boolean isExist(Technology technology) {
		
		boolean exist=true;
		
		List<Technology> technology1 =technologyRepository.findAll();
		for(Technology technologyy:technology1){
			if(technologyy.getTechnologyName().toLowerCase().equals(technology.getTechnologyName().toLowerCase())) {
				exist=false;
				return exist;
			}
			
		}	return exist;	
	}
}
