package com.company;

class A{
    public <T> void printarray(T [] s)
    {
        for (T x:s)
            System.out.println(x);
    }

}
public class Main{

    public static void main(String[] args) {
        String [] s={"a","b","c"};
        Integer [] n= {1,2,4,5};

        A obj=new A();
        A obj1=new A();

        A [] arr={obj,obj1};

        obj.printarray(s);
        obj.printarray(n);
        obj.printarray(arr);
    }
}