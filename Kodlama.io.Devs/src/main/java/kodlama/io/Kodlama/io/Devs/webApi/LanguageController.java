package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.AddLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.RemoveLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

@RestController
@RequestMapping("/api/language")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(AddLanguageRequest addLanguageRequest)throws Exception {
		this.languageService.add(addLanguageRequest);
	}
	@DeleteMapping("/remove")
	public void remove(RemoveLanguageRequest removeLanguageRequest) {
		this.languageService.remove(removeLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		this.languageService.update(updateLanguageRequest);
	}
	
	@GetMapping("/find")
	GetLanguageByIdResponse find(int id) {
		return languageService.find(id);
	}
	
	
	
	
	
	
	
	
}
