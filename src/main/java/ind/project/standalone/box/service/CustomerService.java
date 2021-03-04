package ind.project.standalone.box.service;

import ind.project.standalone.box.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    Customer create(Customer customer);

    Customer getCustomerById(UUID customerId);

    List<Customer> getAllCustomers();
}
