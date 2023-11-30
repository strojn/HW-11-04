package org.example.thread;

public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("second");
        System.out.println( "завершення " + Thread.currentThread().getName() );
    }
}
