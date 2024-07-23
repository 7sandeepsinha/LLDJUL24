package lldmodule1.multithreading;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Client{

    public static void main(String []args) throws ExecutionException, InterruptedException {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayCreator arrayCreator=new ArrayCreator(n);

        ExecutorService executor= Executors.newFixedThreadPool(1);
        Future<List<Integer>> fut=executor.submit(arrayCreator);

        List<Integer>list=fut.get();
        System.out.println(list);


    }

}