package com.example.mobiliteinternational.exceptions;

import java.io.Serializable;

public class UniversiteNotFoundException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;


    public UniversiteNotFoundException(int id) {
        super(String.format("Universite with id = %d could not be found!", id));
    }
}
