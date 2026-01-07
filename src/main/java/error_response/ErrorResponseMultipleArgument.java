package error_response;

import java.util.Map;

public class ErrorResponseMultipleArgument {

    private final int status;
    private final Map<String, String> errors;

    public ErrorResponseMultipleArgument(int status, Map<String, String> errors) {
        this.status = status;
        this.errors = errors;
    }

    public int getStatus() {
        return status;
    }

}
