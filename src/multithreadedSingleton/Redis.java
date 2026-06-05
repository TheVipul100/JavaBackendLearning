package multithreadedSingleton;

public class Redis {

    String username;
    String url;
    String password;
    int port;

        public static Redis instance;   // empty instance

        private Redis(String url, String username, String password, int port) {
            this.url = url;
            this.username = username;
            this.password = password;
            this.port = port;
        }

        public static Redis getInstance() {
            // synchronized() out of fn.()
            if (instance == null) {                  // singleton with double-checked lazy loading always thread safe
                synchronized (Redis.class) {         // synchronized used for providing locking and unlocking mechanism
                    if (instance == null) {
                        instance = new Redis("localhost", "root", "root", 6379);
                    }
                }
            }
            return instance;
        }
    }

    /* if you provide locking out of the function then one on one threads will go for the checks and
    that will waste a lot of time for the first instance its good but when an instance is created now u know
    there is no point for 2000 threads to be checked */