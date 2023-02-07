package com.driver;


class A{
    String meth(){
        return "Invoking method from class A";
    }

}


class B extends A {

 @Override
  String meth(){
    return "Method is overridden in Extendend class B";
   }
}


public class Main {

    public static void main(String [] args){
        A b = new B();
        b.meth();

        B b = new B();
        b.meth();
    }

}