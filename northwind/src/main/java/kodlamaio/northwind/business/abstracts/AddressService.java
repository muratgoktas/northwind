package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Address;

public interface AddressService {
	
	Result add(Address address);

	DataResult<List<Address>> getAll();
}
