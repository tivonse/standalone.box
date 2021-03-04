package ind.project.standalone.box.controller;

import com.sun.istack.NotNull;
import ind.project.standalone.box.model.Customer;
import ind.project.standalone.box.service.CustomerService;
import org.hibernate.criterion.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public @ResponseBody Customer createCustomer(@RequestBody @NotNull Customer customer) {
        Customer result = customerService.create(customer);
        return result;
    }

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
    public Customer queryCustomerById(@PathVariable @NotNull UUID customerId) {
        return customerService.getCustomerById(customerId);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> queryAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/customers/criteria", method = RequestMethod.GET)
    public Pageable queryCustomerByCriteria(@RequestParam CriteriaQuery criteria) {

        return null;
    }
}
