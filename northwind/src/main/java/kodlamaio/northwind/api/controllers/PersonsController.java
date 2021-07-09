package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.PersonService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Person;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin
public class PersonsController {

	private PersonService personService;
	
	@Autowired
	public PersonsController(PersonService personService) {
		this.personService=personService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Person>> getAll() {
		return this.personService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Person person) {

		return this.personService.add(person);
	}
	
	
}
