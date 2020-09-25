package Market.CustomerService.all.Customer.Service;



import Market.CustomerService.Exception.CustomerNotFound;
import Market.CustomerService.all.Customer.Customer;
import Market.CustomerService.all.Customer.Dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private CustomerDAO customerDAO;



    public Customer addCustomer( Customer customer)
    {

        return customerDAO.save(customer);

    }


    public Customer update(int idNumber,Customer customer)
    {

        return customerDAO.save(customer);
    }



    public Customer getCustomer (int idNumber)
    {
        Optional<Customer> findit= customerDAO.findById(idNumber);
        if(!findit.isPresent())
        {
            throw new CustomerNotFound("not found");

        }
        return customerDAO.findById(idNumber).get();

    }



    public void delete(int idNumber)
    {

        customerDAO.deleteById(idNumber);

    }




    public List<Customer> getCustomers()
    {
        return customerDAO.findAll();

    }
}
