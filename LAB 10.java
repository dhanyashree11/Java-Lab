package apack;

public class A {
    int defaultVar=10;
    protected int protectedVar=20;
    private int privateVar= 30;
    public int publicVar= 40;
}

package bpack;

import apack.A;


public class B extends A {
    public void display(){
        System.out.println("Protected:" + protectedVar);
        System.out.println("Public:"+ publicVar);

    }
}

package cpack;

import apack.A;

public class C {
    public void display(){
        A obj = new A();
        System.out.println("Public:"+ obj.publicVar);
    }
}

package dpack;

import bpack.B;
import cpack.C;

public class D {
    public static void main(String[] args){
        B bObj= new B();
        C cObj= new C();
        System.out.println("from class B:");
        bObj.display();
        System.out.println("from class C:");
        cObj.display();
    }
}
