package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.GenderService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Gender;

@RestController
@RequestMapping("/api/genders")
@CrossOrigin
public class GendersController {

	private GenderService genderService;

	@Autowired
	public GendersController(GenderService genderService) {
		super();
		this.genderService = genderService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Gender>> getAll() {
		return this.genderService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Gender gender) {

		return this.genderService.add(gender);
	}
	
}
