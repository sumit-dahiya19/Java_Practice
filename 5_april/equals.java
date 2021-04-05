package com.company;


import java.util.*;
class Money {
    int amount;


    Money(int a){
        amount=a;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof Money))
            return false;
        if(this.amount==((Money) obj).amount )
            return true;
        return false;
    }


}
/*
class B extends Money{
    int temp;

    B(int abc){super(abc);
        temp=abc;}
    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof B))
            return false;
        if(this.temp==((B) obj).temp && this.amount==((B) obj).amount )
            return true;
        return false;
    }

}*/
class B{
    public Money value;
    int store;

    B(int store,int amount)
    {
        this.value=new Money(amount);
        this.store=store;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof B))
            return false;
        if(this.store==((B) obj).store && this.value.equals(((B) obj).value))
            return true;
        return false;
    }

}
public class equals {


    public static void main(String[] args) {

        B income = new B(55,55);
        Money obj = new Money(55);
        boolean balanced =income.equals(obj);
        boolean balanced = obj.equals(income); // returned true -> this is wrong

        System.out.println(balanced);


    }
}
