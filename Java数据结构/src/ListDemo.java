import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args){
        List<Object> list = new ArrayList<Object>();
        list.add(123);
        list.add("Hello");
        list.add("Java");
        list.add(3.14);

        // 第一种遍历方式
        for (Object s:list){
            System.out.println(s);
        }

        // 第二种遍历方式
        Object[] objects = new Object[list.size()];
        list.toArray(objects);
        for (Object object : objects) {
            System.out.println(object);
        }

        //第三种遍历方式
        Iterator<Object> iterable = list.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
