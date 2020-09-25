package Market.CustomerService.all.Customer.Filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
@Component
public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ok big boy");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
