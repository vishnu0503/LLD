package com.singleton;

public class SingletonSynchronized {
    /*
    Let’s say two threads, T1 and T2, call getInstance() simultaneously:

    T1 sees obj == null, enters synchronized, checks again, creates the instance.

    T2 sees obj == null, waits for T1 to finish.

    T2 enters synchronized, sees obj != null, skips creation.
     */
    private static SingletonSynchronized obj=null;

    private SingletonSynchronized()
    {

    }
    public static SingletonSynchronized getInstance()
    {
        if(obj==null) {
            synchronized (SingletonSynchronized.class) {
                if (obj == null)
                    obj = new SingletonSynchronized();
            }
        }
        return obj;
    }
}
