/*Map接口中键和值一一映射. 可以通过键来获取值。

给定一个键和一个值，你可以将该值存储在一个Map对象. 之后，你可以通过键来访问对应的值。
当访问的值不存在的时候，方法就会抛出一个NoSuchElementException异常.
当对象的类型和Map里元素类型不兼容的时候，就会抛出一个 ClassCastException异常。
当在不允许使用Null对象的Map中使用Null对象，会抛出一个NullPointerException 异常。
当尝试修改一个只读的Map时，会抛出一个UnsupportedOperationException异常。

现在主要是使用HashMap*/
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("Hello", "Java");
        map.put("Python", 4336);
        map.put(250, "Node");
        System.out.println(map);
        System.out.println(map.clone());
        System.out.println(map.get("Hello"));
        System.out.println(map.size());
    }
}
