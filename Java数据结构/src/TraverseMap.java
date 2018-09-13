import java.util.*;


public class TraverseMap {
    public static void main(String[] args) {
        HashMap<Object, Object> mapOne = new HashMap<>();
        ;
        mapOne.put("Hello", "Python");
        mapOne.put("Java", "Golang");
        mapOne.put(123, 456.23);

        /*System.out.println(mapOne);
        System.out.println(mapOne.size());
        System.out.println(mapOne.getOrDefault("Hello","Node"));
        System.out.println(mapOne.size());*/

        // 普遍使用方法，键值对遍历
        System.out.println("Map.keySet() Traverse:");
        for (Object k : mapOne.keySet())
            System.out.println(k + "=" + mapOne.get(k));

        // 使用迭代器，强烈推荐
        System.out.println("Map.entrySet() Traverse:");
        for (Map.Entry<Object, Object> objectObjectEntry : mapOne.entrySet()) {
            System.out.println(objectObjectEntry);
        }

        // 最简单方法
        System.out.println("Map.values() Traverse:");
        for (Object object : mapOne.values()) {
            System.out.println("Value:" + object);
        }
    }

}
