package com.john.history.mykotlindemo.test.okhttp;

public class JavaTest {
    public static void main(String[] args) {
        Father father=new Son();
        Son son=(Son)father;
    }
    static class Father{

    }

    static class Son extends Father{

    }
}
