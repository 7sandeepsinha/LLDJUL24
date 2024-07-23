package lldmodule1.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class ArrayCreator implements Callable<List<Integer>> {
    private int n;
    ArrayCreator(int n){
        this.n=n;
    }

    @Override
    public List<Integer> call(){
        List<Integer>list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            list.add(i);

        }

        return list;
    }

}
