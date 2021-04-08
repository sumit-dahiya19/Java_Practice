package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// problem->  Sender-Reciever Synchornication Problem
//The Sender is supposed to send a data packet to the Receiver
//The Receiver cannot process the data packet until the Sender is finished sending it
//Similarly, the Sender mustn't attempt to send another packet unless the Receiver has already processed the previous packet

class Data {
    private String packet;
    private boolean transfer = true;

    //if transfer is true--> If this variable is true, then the Receiver should wait for Sender to send the message
    //else --> If it's false, then Sender should wait for Receiver to receive the message

    public synchronized void send(String packet) {
        //if transfer is false then wait
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive() {
        while(transfer){
            try{wait();}
            catch (InterruptedException e){
                System.out.println(e);}
        }
        transfer=true;
        notifyAll();
        return packet;
    }
}
class sender implements Runnable {
    private com.company.Data data;
    sender(com.company.Data temp){
        this.data=temp;
    }
    @Override
    public void run() {
        String packets[] = {"First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"};
        for (String pac : packets) {
            data.send(pac);
            try {
                ThreadLocalRandom.current().nextInt(1000, 5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Receiver implements Runnable {
    private com.company.Data load;
    Receiver(com.company.Data temp){
        this.load=temp;
    }
    public void run() {
        for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class Sender_Reciever_Sync{
    public static void main(String[] args) {

        com.company.Data data = new com.company.Data();
        Thread sender = new Thread(new com.company.sender(data));
        Thread receiver = new Thread(new com.company.Receiver(data));

        sender.start();
        receiver.start();
    }
}
