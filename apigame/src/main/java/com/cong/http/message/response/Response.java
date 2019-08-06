package com.cong.http.message.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Response {

    String status;
    String message;

    public Response() {
    }

    public Response(String status, String message) {
        this.status = status;
        this.message = message;
    }
}

