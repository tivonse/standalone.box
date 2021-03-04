package ind.project.standalone.box.service.impl;

import ind.project.standalone.box.model.Customer;
import ind.project.standalone.box.repository.CustomerRepository;
import ind.project.standalone.box.service.CustomerService;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Cacheable("customerById")
    @Override
    public Customer getCustomerById(UUID customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

//    @Cacheable("customers")
    @Cacheable("customers")
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
