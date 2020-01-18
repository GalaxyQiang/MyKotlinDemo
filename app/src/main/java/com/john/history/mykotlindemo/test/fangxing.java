package com.john.history.mykotlindemo.test;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class fangxing {
    public static List<A> listA=new ArrayList<>();
    public static List<B> listB=new ArrayList<>();

    public static void main(String[] args) {
        listB.add(new B());
        X<B> one=new X<B>();
    }

    private static void showA() {
        listA.add(new A());
        listA.add(new B());
        listA.add(new C());
        for (A member:listA) {
            System.out.println(member);
        }
    }
}
class X<T extends B>{

}
class A{

}

class B extends A{

}

class C extends A{

}
