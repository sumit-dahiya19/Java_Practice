package com.company;
import java.util.*;
import java.lang.Thread;
import java.util.logging.Logger;
import java.util.function.Supplier;


class testsleep implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{Thread.sleep(500);}catch (InterruptedException e){
                System.out.println(e);}
            System.out.println(i);
        }
    }
}
class A implements Runnable{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon())
            System.out.println("daemon thread work");
        else
            System.out.println("User Thread");
    }
}
public class Main{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");


        Thread t1=new Thread(new com.company.A()); //new state
        Thread t2=new Thread(new com.company.A());
        Thread t3=new Thread(new com.company.A());
        t1.setDaemon(true);
        System.out.println(t1.getPriority());
        t1.start();
        //t1.setDaemon(true);
        t2.start();//t3.start();t2.start();t2.start();
        t3.start();



    }
}
//new runnable non-runnable terminated
//Each Thread start in a seperate call stack