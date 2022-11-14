package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.AddTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

public interface TechnologyService {

	public void add(AddTechnologyRequest addTechnologyRequest);
	public void remove(RemoveTechnologyRequest removeTechnologyRequest);
	public void update(UpdateTechnologyRequest updateTechnologyRequest);
	public List<GetAllTechnologyResponse> getAll();
	GetTechnologyByIdResponse find(int id);
	
	
}
