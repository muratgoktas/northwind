package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{

}
