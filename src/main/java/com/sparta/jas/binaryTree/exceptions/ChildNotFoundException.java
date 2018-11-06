package com.sparta.jas.binaryTree.exceptions;

public class ChildNotFoundException extends Exception {

    private String childRequested;
    private int value;

    public ChildNotFoundException(int value, String childRequested){
        this.value = value;
        this.childRequested = childRequested;
    }

    @Override
    public String getMessage() {
        String message =  value + " does not have a " + childRequested;
        return message;
    }
}
