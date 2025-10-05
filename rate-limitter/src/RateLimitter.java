import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RateLimitter {
    private final int bucketSize;
    private final long refillInterval;
    Map<String, UserBucket> userBucketMap;

    public RateLimitter(int bucketSize, long refillInterval) {
        this.bucketSize = bucketSize;
        this.refillInterval = refillInterval;
        userBucketMap = new ConcurrentHashMap<>();
        refillUserBucket();
    }

    public void refillUserBucket() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() ->
        {
            for (UserBucket userBucket : userBucketMap.values()) {
                userBucket.refillBucket(bucketSize);
            }
        }, refillInterval, refillInterval, TimeUnit.MILLISECONDS);
        scheduler.shutdown();
    }

    public boolean isAllowUser(String userId)
    {
        userBucketMap.putIfAbsent(userId,new UserBucket(bucketSize));
        UserBucket bucket = userBucketMap.get(userId);
        return bucket.tryConsume();
    }
}
