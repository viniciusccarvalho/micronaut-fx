package io.igx.fx.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class DogResponse {

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
