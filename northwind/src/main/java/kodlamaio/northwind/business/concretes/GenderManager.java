package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.GenderService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.GenderDao;
import kodlamaio.northwind.entities.concretes.Gender;

@Service
public class GenderManager implements GenderService{

	private GenderDao genderdao;
	
	@Autowired
	public GenderManager(GenderDao genderdao) {
		super();
		this.genderdao=genderdao;
	}
	
	@Override
	public Result add(Gender gender) {
		this.genderdao.save(gender);
		return new SuccessResult("Gender Added!");
	}

	@Override
	public DataResult<List<Gender>> getAll() {
		return new SuccessDataResult<List<Gender>>
		(this.genderdao.findAll(),"Data Listed!");
	}

}
