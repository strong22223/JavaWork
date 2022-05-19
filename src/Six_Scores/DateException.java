package Six_Scores;

import java.io.IOException;

public class DateException extends IOException {
    private String reason;

    public DateException(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

}
