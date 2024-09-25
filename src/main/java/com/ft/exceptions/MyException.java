package com.ft.exceptions;

public class MyException extends Exception{

    public MyException(String message){
        super(message);
    }

    public MyException(String message, Throwable throwable){
        super(message,throwable);
    }

}
