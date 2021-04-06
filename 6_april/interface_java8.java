package com.company;

import java.util.*;
interface A{
    //static method
    static String fun(){
        return "Interface Static function";
    }
    default String def(){
        return "Default Interface function";
    }
}
class B implements com.company.A {

}
public class Main{
    public static void main(String[] args) {

        System.out.println(com.company.A.fun());
        com.company.A obj=new com.company.B();
        System.out.println(obj.def());

        //Optional<String> optional =Optional.empty();
        String str="sumit";
        Optional<String> optional=Optional.of(str);




    }
}