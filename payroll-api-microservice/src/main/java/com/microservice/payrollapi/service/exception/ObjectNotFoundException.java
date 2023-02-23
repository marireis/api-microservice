package com.microservice.payrollapi.service.exception;

public class ObjectNotFoundException extends RuntimeException{
    //metodo do runtime
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
