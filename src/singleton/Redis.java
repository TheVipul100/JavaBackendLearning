package singleton;

public class Redis{

    String username;
    String url;
    String password;
    int port;

    public static Redis instance;

    private Redis(String url, String username, String password, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static Redis getInstance() {
        if (instance == null) {                 // singleton with single checked lazy loading
            instance = new Redis("localhost", "root", "root", 6379);
        }
        return instance;
    }
}
