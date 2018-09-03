import java.util.BitSet;

/*一个Bitset类创建一种特殊类型的数组来保存位值。BitSet中数组大小会随需要增加。这和位向量（vector of bits）比较类似。

这是一个传统的类，但它在Java 2中被完全重新设计。

BitSet定义了两个构造方法。

第一个构造方法创建一个默认的对象：

BitSet()
第二个方法允许用户指定初始大小。所有位初始化为0。

BitSet(int size)

BitSet表示形式为 {}，类似Python中的无键字典*/
public class BitSetTest {
    public static void main(String[] args) {
        BitSet bitSetOne = new BitSet(16);
        BitSet bitSetTwo = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0)
                bitSetOne.set(i);
            if ((i % 5) != 0)
                bitSetTwo.set(i);
        }

        System.out.println("bitSetOne:");
        System.out.println(bitSetOne);
        System.out.println("bitSetTwo:");
        System.out.println(bitSetTwo);
        System.out.println("----------LINE----------");

        bitSetTwo.and(bitSetOne);
        System.out.println("AND:");
        System.out.println(bitSetTwo);
        System.out.println("----------LINE----------");

        bitSetTwo.or(bitSetOne);
        System.out.println("OR:");
        System.out.println(bitSetTwo);
        System.out.println("----------LINE----------");

        bitSetTwo.xor(bitSetOne);
        System.out.println("XOR:");
        System.out.println(bitSetTwo);
        System.out.println("----------LINE----------");
    }
}

