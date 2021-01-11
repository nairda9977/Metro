package com.solvd.exception;

public class ShopException extends Exception {
    public ShopException(){
        super();
        System.err.println("MY exception");
    }
}
