package Market.CustomerService.all.Customer.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {
    @GetMapping
    public String home(){
        return "aplication works"+new Date();
    }
}
