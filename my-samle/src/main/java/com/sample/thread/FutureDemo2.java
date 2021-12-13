package com.sample.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fred
 * @date 2021/12/13
 **/
public class FutureDemo2 {
    public static void main(String[] args) {
        final Future<String> submit = Executors.newCachedThreadPool().submit(() -> get());
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("111111");
    }

    static String get() {
        throw new IllegalArgumentException();

    }
}
