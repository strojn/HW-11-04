package org.example.thread;

public class ExtendsThread extends Thread {
    public void run() {
        Thread.currentThread().setName("first");
        System.out.println( "завершення " + Thread.currentThread().getName() );
    }
}
