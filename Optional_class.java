package com.company;
import java.util.*;

class A{
    public void sum(Optional<Integer> a,Optional<Integer>b){
        System.out.println("First Paramater is : "+a.isPresent());
        System.out.println("Second Paramater is : "+b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns the value passed
        Integer value1 = a.orElse(new Integer(0));
        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        System.out.println(value1+value2);
    }
};
public class Main{
    public static void main(String[] args) {

        Integer value1=null;
        Integer value2=new Integer(10);

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a=Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);


        com.company.A obj=new com.company.A();
        obj.sum(a,b);


    }
}