package com.local;

class Singleton {
    //static variable single_instance of type MySingleton
    private static Singleton single_instance = null;

    //variable of type String
    public String name;

    //private constructor restricted to this class itself
    private Singleton() {
        name = "Singleton Class";
    }

    //static method to create instance of MySingleton
    public static Singleton getInstance() {
        if (single_instance == null) {
            synchronized (Singleton.class) {
                if (single_instance == null)
                    single_instance = new Singleton();
            }
        }
        return single_instance;
    }
}

//Driver Class
class MySingleton {
    public static void main(String args[]) {
        Singleton sin = Singleton.getInstance();
        Singleton ton = Singleton.getInstance();

        System.out.println(sin.name);
        System.out.println(ton.name);
    }
}