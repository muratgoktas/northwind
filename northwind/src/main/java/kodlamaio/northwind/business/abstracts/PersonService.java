package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Person;


public interface PersonService {
	Result add(Person person);

	DataResult<List<Person>> getAll();
}
