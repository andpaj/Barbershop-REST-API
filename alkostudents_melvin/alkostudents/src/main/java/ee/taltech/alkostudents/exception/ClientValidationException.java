package ee.taltech.alkostudents.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Client validation failed")
public class ClientValidationException extends RuntimeException {
}
