package com.cong.http.message.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
public class JwtResponse extends Response {
    private String token;
    private String type = "Bearer";

    public JwtResponse(String status, String message, String accessToken) {
        super(status,message);
        this.token = accessToken;
    }

    public JwtResponse(String accessToken) {
        this.token = accessToken;
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public static class NotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public NotFoundException(String message) {
            super(message);
        }

        public NotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
