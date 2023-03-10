package web.clone.onemorebag.common.exception.form.signup;

import web.clone.onemorebag.common.exception.form.CustomFormException;

public class InvalidEmailException extends CustomFormException {
    public InvalidEmailException(String message) {
        super(message);
    }

    public InvalidEmailException(String message, String field) {
        super(message, field);
    }

    public InvalidEmailException(String message, String field, String errorCode) {
        super(message, field, errorCode);
    }
}
