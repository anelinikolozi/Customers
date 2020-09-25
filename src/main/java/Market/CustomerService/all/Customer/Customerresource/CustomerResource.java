package Market.CustomerService.all.Customer.Customerresource;

import Market.CustomerService.all.Customer.Customer;
import Market.CustomerService.all.Customer.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customers")
public class CustomerResource {
    @Autowired
    private Service service;


    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return service.addCustomer(customer);
    }




    @GetMapping
    public List<Customer> getCustomers()
    {
        return service.getCustomers();
    }



    @GetMapping (value ="/{customerId}")

    public Customer getCustomer (@PathVariable("customerId")int customerid)

    {
        return service.getCustomer(customerid);
    }



    @PutMapping(value ="/{customerId}" )
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer)
    {
        return service.update(customerId,customer);
    }
@DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerid)
{
    service.delete(customerid);
}
}
