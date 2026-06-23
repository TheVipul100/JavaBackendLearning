package Synchronised_method;

import java.util.concurrent.Callable;

public class Adder implements Callable<Integer> {

    final Count count;

    public Adder(Count count) {
        this.count = count;

    }

    @Override
    public Integer call() throws Exception {
        for(int i=0;i<100;i++) {
            count.incrementByI(i);
        }
        return count.value;
    }
}
