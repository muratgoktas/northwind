package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Gender;

public interface GenderService {
	Result add(Gender gender);

	DataResult<List<Gender>> getAll();

}
