package Market.CustomerService.all.Customer.Filter;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(3)
public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2 just got called");
        filterChain.doFilter(servletRequest,servletResponse);
    }


}

