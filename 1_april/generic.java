package com.company;

class A<T>{
    int data;
    String name;
    T variable;

    A(int data,String name,T variable){
        this.data=data;
        this.name=name;
        this.variable=variable;
    }

    public void show(){
        System.out.println(data+" "+name+" "+variable);
    }
}


public class generic{

    public static void main(String[] args) {

        A obj=new A(1,"Sumit",5);
        obj.show();
        A obj1 = new A(2,"Dahiya","String_variable");
        obj1.show();
        A obj2=new A(3,"Variable is Object",obj);
        obj2.show();

    }
}