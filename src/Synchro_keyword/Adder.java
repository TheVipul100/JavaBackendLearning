package Synchro_keyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer> {

    final Count count;

    public Adder(Count count) {
        this.count = count;

    }

    @Override
    public Integer call() throws Exception {
        for(int i=0;i<100;i++) {
            synchronized (count) {
                count.value += i;
            }
        }
        return count.value;
    }
}
