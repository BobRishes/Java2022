package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.AddTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

@RestController
@RequestMapping("/api/technology")
public class TechnologyController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping ("/getall")
	public List<GetAllTechnologyResponse> getAll(){
		return this.technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(AddTechnologyRequest addTechnologyRequest) {
		this.technologyService.add(addTechnologyRequest);
	}
	@DeleteMapping("/remove")
	public void remove(RemoveTechnologyRequest removeTechnologyRequest) {
		this.technologyService.remove(removeTechnologyRequest);
	}
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		this.technologyService.update(updateTechnologyRequest);
	}
	@GetMapping("/find")
	GetTechnologyByIdResponse find(int id) {
		return this.technologyService.find(id);
		
	}
	
}
