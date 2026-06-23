package Synchronised_method;

public class Count {
    //synch. method means locking the object
    Integer value=0;


    public synchronized void incrementByI(int i)
    {
        value+=i;
    }

    public synchronized void decrementByI(int i)
    {
        value-=i;
    }
}
