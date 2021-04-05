package com.company;
import java.util.*;
import java.lang.Thread;
import java.util.logging.Logger;
import java.util.function.Supplier;

class A extends Thread{

    @Override
    public void run() {
        int i;
        for(i=1;i<10;i++)
            System.out.println("i="+i+"T hread A");
    }
}
class B extends Thread{
    @Override
    public void run(){


        for(int i=1;i<10;i++)
            System.out.println("i = " +i +" Thread B");
    }
}
class C implements Runnable{
    @Override
    public void run() {
        commonResource();
    }
    public static synchronized void commonResource(){
        while(true){

        }
    }
}
class D implements  Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(String.valueOf(e.getMessage()));
        }
        finally {
            System.out.println("Done");
        }
    }
}
class E implements Runnable{
    public void run(){

    }
}
public class Main{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");


        Thread t1=new Thread(new com.company.A()); //new state
        Thread t2=new Thread(new com.company.B()); //new state
        logger.info(String.valueOf(t1.getState())); // new state


        t1.start();        //runnable state
        logger.info(String.valueOf(t1.getState()));
        t2.start();        //runnable state

        logger.info(String.valueOf(t1.getState())); //Terminated
        //dead state


        Thread t3=new Thread(new com.company.C());
        Thread t4=new Thread(new com.company.C());

        t4.start();
        t3.start();


        logger.info(String.valueOf(t3.getState())); //blocked state


        Thread t5=new Thread (new com.company.D());
        logger.info(String.valueOf(t5.getState()));
        t5.start();
        logger.info(String.valueOf(t5.getState()));

        Thread t6=new Thread(new com.company.D());
        logger.info(String.valueOf(t6.getState()));
        t6.start();
        logger.info(String.valueOf(t5.getState()));

        logger.info(String.valueOf(t5.getState()));
        logger.info(String.valueOf(t5.getState()));



        Thread t7=new Thread(new com.company.E());
        t7.start();
        try{Thread.sleep(1000);}catch (InterruptedException e){
            System.out.println(e.getMessage());}
        logger.info(String.valueOf(t7.getState()));

    }
}