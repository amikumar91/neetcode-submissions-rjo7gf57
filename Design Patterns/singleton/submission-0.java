static class Singleton {
    private static volatile Singleton singleton = null;
    private String value = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        synchronized(Singleton.class){
            if(singleton == null){
                singleton =  new Singleton();
            }
        }
        return singleton; 
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
