package com.john.history.mykotlindemo.test.javademo;

import android.net.ParseException;

import java.io.IOException;

public class ExeptionDemo {
    public static void main(String[] args) {
        try {
            doSomething1();
        } catch (IOException e) {
            e.printStackTrace();
            try {
                throw e;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        System.out.println("do main end");
    }

    private static void doit() {
        try {
//            doSomething1();
            doError();
            doSomething2();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        } catch (Error e) {
            e.printStackTrace(System.err);

        } finally {
            System.out.println("do finally");
        }
    }

    private static void doSomething1() throws IOException {
        System.out.println("doSomething1");
        throw new IOException("do1");
    }

    private static void doSomething2() throws IOException {
        System.out.println("doSomething2");
        throw new IOException("do2");
    }

    private static void doError()  {
        System.out.println("doError");
        try {
            throw new Error("error");
        } catch (Error e) {
            System.out.println("xxx");
            e.printStackTrace();
        }
//        System.out.println("doError2");
    }

    private static double divide(double a,double b) {
        double c;
        c=a/b;
        System.out.println(c);
        return c;
    }

    private static void doError2(){

    }

}
