package com.driver;


class A{
    public String meth(){
        return "Invoking method from class A"
    }

}


class B extends A {
   public String meth(){
    return "Method is overridden in Extendend class B"
   }
}


public class Main {
   B b = new A();
    b.meth();
}