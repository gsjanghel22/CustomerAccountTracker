package aicp.foundation.bank.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aicp.foundation.bank.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByName(String customerName);
	

}
