package lldmodule1.multithreading;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.List;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executor;
    Sorter(List<Integer> arr,ExecutorService executor){
        this.arr = arr;
        this.executor = executor;

    }
    @Override
    public List<Integer> call() throws Exception {
        //Business Logic
        //base case
        if(arr.size()<=1){
            return arr;
        }

        //recursive case
        int n = arr.size();
        int mid = n/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        //Division of array into 2 parts
        for(int i=0;i<n;i++){
            if(i<mid){
                leftArr.add(arr.get(i));
            }
            else{
                rightArr.add(arr.get(i));
            }
        }

        //Recursively Sort the 2 array
        Sorter leftSorter = new Sorter(leftArr,executor);
        Sorter rightSorter = new Sorter(rightArr,executor);

        Future<List<Integer>> leftFuture = executor.submit(leftSorter);
        Future<List<Integer>> rightFuture = executor.submit(rightSorter);

        leftArr = leftFuture.get();
        rightArr = rightFuture.get();


        //Merge
        List<Integer> output = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<leftArr.size() && j<rightArr.size()){
            if(leftArr.get(i)<rightArr.get(j)){
                output.add(leftArr.get(i));
                i++;
            }
            else{
                output.add(rightArr.get(j));
                j++;
            }
        }
        // copy the remaining elements
        while(i<leftArr.size()){
            output.add(leftArr.get(i));
            i++;
        }
        while(j<rightArr.size()){
            output.add(rightArr.get(j));
            j++;
        }
        return output;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> l = List.of(7,3,1,2,4,6,17,12);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(l,executorService);
        Future<List<Integer>> output = executorService.submit(sorter);
        System.out.println(output.get()); //Blocking Code
        executorService.shutdown();
    }
}