package com.company;
import java.util.*;

class A{
    int data;
    A(int data){
        this.data=data;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(!(obj instanceof com.company.A))
            return false;
        if(this.data==((com.company.A) obj).data)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int key=17;
        if(data >0 )
            key=31*data+3;
        return key;
    }
}
public class Main{
    public static void main(String[] args) {
        com.company.A obj1=new com.company.A(1);
        com.company.A obj2=new com.company.A(1);
        //System.out.println(obj1.equals(obj2));
        //System.out.println(obj1.hashCode());
        //System.out.println(obj2.hashCode());

        Map<com.company.A,String> m=new HashMap<>();
        m.put(new com.company.A(1),"object1");
        m.put(new com.company.A(2),"Object2");
        m.put(new com.company.A(3),"Object 3");

        com.company.A key = new com.company.A(1);
        String str=m.get(key);
        System.out.println(str);



    }
}