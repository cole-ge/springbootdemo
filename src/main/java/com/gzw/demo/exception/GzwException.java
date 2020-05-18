package com.gzw.demo.exception;

import com.gzw.demo.pojo.Gzw;

public class GzwException extends Exception {
    public GzwException(){
        super();
    }

    public GzwException(String exceptionMes){
        super(exceptionMes);
    }
}
