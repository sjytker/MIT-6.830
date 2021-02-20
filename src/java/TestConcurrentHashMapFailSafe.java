import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMapFailSafe
{
    public static void main(String[] args)
    {
        System.out.println("test ConcurrentHashMap fast-fail");
        Map<Integer, String> testConcurrentHashMap = new ConcurrentHashMap<Integer, String>();
        testConcurrentHashMap.put(100, "100");
        testConcurrentHashMap.put(200, "200");
        testConcurrentHashMap.put(300, "300");
        testConcurrentHashMap.put(400, "400");
        testConcurrentHashMap.put(500, "500");
        System.out.println(testConcurrentHashMap.size());
        for (Map.Entry<Integer, String> entry : testConcurrentHashMap.entrySet())
        {
            int key = entry.getKey();
            System.out.println("key=" + key);
            if (key == 300)
            {
                testConcurrentHashMap.remove(key);
            }
        }
        System.out.println(testConcurrentHashMap.size());
        for (Map.Entry<Integer, String> entry : testConcurrentHashMap.entrySet())
        {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}