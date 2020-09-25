package Market.CustomerService.all.Customer.Service;


import Market.CustomerService.Exception.ApplicationError;
import Market.CustomerService.Exception.CustomerNotFound;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {

@Value("${api_doc_url}")
private String details;

    @ExceptionHandler(CustomerNotFound.class)


    public ResponseEntity<ApplicationError> handleCustomerNotFound (CustomerNotFound exception, WebRequest webRequest) {

    ApplicationError error=new ApplicationError();

    error.setCode(101);
    error.setDetails(details);

    error.setMessage(exception.getMessage());

    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
