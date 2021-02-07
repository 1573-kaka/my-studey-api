package com.imust.crm.exception;

public class MyException extends RuntimeException{

    private static final long serialVersionUID = -1964261101867043184L;

    public MyException() {}

    public MyException(String message) {
        super(message);
    }

    public MyException(String massage, Throwable cause) {
        super(massage, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
