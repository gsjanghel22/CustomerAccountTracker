package aicp.foundation.bank.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import aicp.foundation.bank.entity.Customer;
import aicp.foundation.bank.entity.repository.CustomerRepository;

@SpringBootTest
class CustomerServiceTest {
	
	@Mock
	CustomerRepository customerRepository;
	
	@InjectMocks
	CustomerService customerService;
	
	@Test
	public void getAllCustomers() {
		
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Gaurav", null));
		when(customerRepository.findAll()).thenReturn(customers);
		assertEquals(1, customerService.getAllCustomers().size());
		
	}
	
	@Test
	public void getCustomerByName() {
		String name = "Gaurav";
		Customer customer = new Customer("Gaurav", null);
		when(customerRepository.findByName(name)).thenReturn(customer);
		assertEquals(name, customerService.getCustomerByName(name).getName());
	}
	
}