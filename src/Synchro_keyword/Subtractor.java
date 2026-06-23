package Synchro_keyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Integer> {
         Count count;

         public Subtractor(Count count){
         this.count=count;

         }

    @Override
    public Integer call() throws Exception {
        for(int i=0;i<100;i++) {
           synchronized (count) {    // jsut like static block ye sync. block
               count.value -= i;
           }
        }
        return count.value;
    }

}
