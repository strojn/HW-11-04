package org.example;

import org.example.thread.ExtendsThread;
import org.example.thread.ImplementsRunnable;

public class Main {
    public static void main(String[] args)
    {
//thread1 - main
        Runnable task = new Runnable() {
            public void run() {
                System.out.println( "завершення " + Thread.currentThread().getName() );
            }
        };
        Thread thread1 = new Thread(task);
        thread1.setName("main");
        thread1.start();
//thread2 - second
        Thread thread2 = new Thread( new ImplementsRunnable() );
        thread2.start();
//thread3 - first
        new ExtendsThread().start();

        System.out.println("Я все - закінчили");



//        System.out.println("Hello world!");
//        Thread currentThread = Thread.currentThread();
//        ThreadGroup threadGroup = currentThread.getThreadGroup();
//        System.out.println("Thread: " + currentThread.getName());
//        System.out.println("Thread Group: " + threadGroup.getName());
//        System.out.println("Parent Group: " + threadGroup.getParent().getName());
//
//        // повинен бути ДО виникнення Exception, бо не дійде хід :)
//        Thread thread = new MyThread();
//        thread.start();
//
//
//        currentThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("Виникла помилка: " + e.getMessage());
//            }
//        });
//        System.out.println(2/0);
    }
//    public static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println("Hello, World!");
//        }
//    }
}