
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/27
 * Time: 9:04
 * All Rights Reserved To github.com/vadonical
 */

import java.util.*;

public class JavaVector {
    public static void main(String []args){
        Vector<Integer> vector = new Vector<Integer>(3,5);
        Vector<Double> vector1 = new Vector<Double>(5,3);
        System.out.println("Vector size:" + vector.size());
        System.out.println("Vector capacity:" + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        vector.addElement(6);
        vector.addElement(6);
        vector.addElement(6);
        vector.addElement(6);
        vector.addElement(6);
        vector.addElement(6);

        //vector.addAll(4,vector);
        //vector.add(0, 5);
        System.out.println("-------------------LINE---------------------");
        System.out.println(vector.hashCode());
        System.out.println(vector.capacity());
        System.out.println(vector.elements());
        System.out.println(vector1);
        System.out.println(vector.indexOf(5,3));
        System.out.println(vector);
        vector.insertElementAt(2,0);
        System.out.println(vector.isEmpty());
        System.out.println("-------------------LINE---------------------");

        System.out.println(vector);
        System.out.println(vector.lastElement());
        System.out.println(vector.subList(2,5));
        System.out.println(Arrays.toString(vector.toArray()));
        System.out.println(vector.capacity());
        vector.trimToSize();
        System.out.println(vector.capacity());
    }
}
