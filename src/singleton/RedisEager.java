package singleton;

public class RedisEager {

    String username;
    String url;
    String password;
    int port;

    public static RedisEager instance=new RedisEager("localhost", "root", "root", 6379);

    private RedisEager(String url, String username, String password, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static RedisEager getInstance() {
        return instance;
    }
}
