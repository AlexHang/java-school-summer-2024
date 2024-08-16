public class MySingleton {
    private static MySingleton singletonInstance;

    private MySingleton(){};

    public MySingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new MySingleton();
            return singletonInstance;
        }else {
            return singletonInstance;
        }
    }
}
