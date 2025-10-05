public class RateLimitterClient
{
    public static void main(String[] args) throws InterruptedException {
        RateLimitter rateLimitter = new RateLimitter(5,1000);

        String userId = "vishnu";
        for(int i=0;i<20;i++)
        {
            boolean allowUser = rateLimitter.isAllowUser(userId);
            System.out.println(allowUser ? "200 OK":"429 TOO MANY REQUESTS");
            Thread.sleep(100);
        }
    }
}
