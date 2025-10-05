import java.util.concurrent.atomic.AtomicInteger;

public class UserBucket {
    private int initialCapacity;
    private AtomicInteger tokens;
    public UserBucket(int initialCapacity)
    {
        tokens=new AtomicInteger(initialCapacity);
    }

    public void refillBucket(int maxToken)
    {
        tokens.updateAndGet(current -> Math.min(initialCapacity, current + 1));
    }

    public boolean tryConsume()
    {
        while(true)
        {
            int current= tokens.get();
            if(current ==0)
                return false;
            if(tokens.compareAndSet(current,current-1))
                return true;
        }
    }
}
