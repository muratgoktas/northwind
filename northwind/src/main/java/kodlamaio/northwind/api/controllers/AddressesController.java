package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.AddressService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Address;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin

public class AddressesController {

	private AddressService addressService;

	@Autowired
	public AddressesController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Address>> getAll() {
		return this.addressService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Address address) {

		return this.addressService.add(address);
	}

}
