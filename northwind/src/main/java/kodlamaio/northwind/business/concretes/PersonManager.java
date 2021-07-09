package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.PersonService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.PersonDao;
import kodlamaio.northwind.entities.concretes.Person;

@Service
public class PersonManager implements PersonService{

	private PersonDao persoonDao;
	
	public PersonManager(PersonDao persoonDao) {
		this.persoonDao=persoonDao;
	}
	
	@Override
	public Result add(Person person) {
		this.persoonDao.save(person);
		
		return new SuccessResult("Person Added!");
	}

	@Override
	public DataResult<List<Person>> getAll() {
		return new SuccessDataResult<List<Person>>
		(this.persoonDao .findAll(),"Data Listed!");
	}

}
