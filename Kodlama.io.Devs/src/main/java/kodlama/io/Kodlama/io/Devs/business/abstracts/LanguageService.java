package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

public interface LanguageService {

	public void add(AddLanguageRequest addLanguageRequest) throws Exception;
	public void remove(RemoveLanguageRequest removeLanguageRequest);
	public void update(UpdateLanguageRequest updateLanguageRequest);
	public List<GetAllLanguageResponse> getAll();
	GetLanguageByIdResponse find(int id);
	
}
