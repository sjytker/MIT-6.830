import java.util.HashMap;
import java.util.Map;

public class TestHashMapFastFail
{
    public static void main(String[] args)
    {
        System.out.println("test HashMap fast-fail");
        Map<Integer, String> testHashMap = new HashMap<Integer, String>();
        testHashMap.put(1000, "1000");
        testHashMap.put(2000, "2000");
        testHashMap.put(3000, "3000");
        testHashMap.put(4000, "4000");
        testHashMap.put(5000, "5000");
        System.out.println(testHashMap.size());
        for (Map.Entry<Integer, String> entry : testHashMap.entrySet())
        {
            int key = entry.getKey();
            System.out.println("key=" + key);
            if (key == 3000)
            {
                testHashMap.remove(key);
            }
        }
        System.out.println(testHashMap.size());
        for (Map.Entry<Integer, String> entry : testHashMap.entrySet())
        {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}