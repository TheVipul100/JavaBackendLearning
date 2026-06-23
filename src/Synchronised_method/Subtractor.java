package Synchronised_method;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Integer> {
         Count count;

         public Subtractor(Count count){
         this.count=count;

         }

    @Override
    public Integer call() throws Exception {
        for(int i=0;i<100;i++) {
               count.decrementByI(i);

        }
        return count.value;
    }

}
