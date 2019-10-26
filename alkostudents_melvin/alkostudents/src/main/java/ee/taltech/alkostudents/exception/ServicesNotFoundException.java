package ee.taltech.alkostudents.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Service Not Found")
public class ServicesNotFoundException extends RuntimeException {
}
