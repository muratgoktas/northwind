package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.AddressService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.AddressDao;
import kodlamaio.northwind.entities.concretes.Address;

@Service
public class AddressManager implements AddressService {

	private AddressDao addressDao;

	@Autowired
	public AddressManager(AddressDao addressDao) {
		super();
		this.addressDao = addressDao;
	}

	@Override
	public Result add(Address address) {
		this.addressDao.save(address);
		return new SuccessResult("Address added!");
	}

	@Override
	public DataResult<List<Address>> getAll() {
		return new SuccessDataResult<List<Address>>
		(this.addressDao.findAll(),"Data Listed!");
	}

}
