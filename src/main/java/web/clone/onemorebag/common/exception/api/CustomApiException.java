package web.clone.onemorebag.common.exception.api;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import web.clone.onemorebag.common.exception.CustomException;

@Getter
public class CustomApiException extends CustomException {

    private HttpStatus status;

    public CustomApiException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
