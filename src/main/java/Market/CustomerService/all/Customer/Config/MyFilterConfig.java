package Market.CustomerService.all.Customer.Config;

import Market.CustomerService.all.Customer.Filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean()
    {

        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<MyNewFilter>();
        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/Customers");
   return registrationBean;
    }
}
