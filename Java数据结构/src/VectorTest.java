import java.util.Enumeration;
import java.util.Vector;
/*
* Vector类实现了一个动态数组。和ArrayList和相似，但是两者是不同的：

Vector是同步访问的。
Vector包含了许多传统的方法，这些方法不属于集合框架。
Vector主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。

Vector类支持4种构造方法。

第一种构造方法创建一个默认的向量，默认大小为10：

Vector()
第二种构造方法创建指定大小的向量。

Vector(int size)
第三种构造方法创建指定大小的向量，并且增量用incr指定. 增量表示向量每次增加的元素数目。

Vector(int size,int incr)
第四种构造方法创建一个包含集合c元素的向量：

Vector(Collection c)
Vector 表示形式 [] ，类似Python中的列表。*/

public class VectorTest {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>(3, 2);
        System.out.println(vector);
        System.out.println("SIZE:" + vector.size());
        vector.capacity(); //返回此向量的当前容量。
        vector.addElement(1);
        vector.addElement(1);
        vector.addElement(1);
        vector.addElement(2.5);
        vector.addElement(4.5f);
        vector.addElement("Hello");
        System.out.println("SIZE:" + vector.size());
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.add(44);
        System.out.println(vector.get(3));
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector);
        System.out.println(vector.contains(100));
        System.out.println(vector.contains(44));
        Enumeration enumeration = vector.elements();
        System.out.println("ELEMENTS:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

}
