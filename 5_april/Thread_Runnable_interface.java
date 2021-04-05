package com.company;
import java.util.*;
import java.lang.Thread;

class A implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("In thread 1");
    }
}
class B implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("In Thread 2");
    }
}

public class Main{
    public static void main(String[] args) {
        Thread t1=new Thread(new com.company.A());
        Thread t2=new Thread(new com.company.B());
        t1.start();t2.start();

    }
}