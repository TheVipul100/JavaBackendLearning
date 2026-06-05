package multithreadedSingleton;

public class Client {

    public static void main(String[] args) {
         Redis sing = Redis.getInstance();
        System.out.println(sing);
    }
}
