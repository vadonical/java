public class GenericDemoTwo<T> {
    private T t;

    private void add(T t) {
        this.t = t;
    }

    private T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericDemoTwo<Integer> integerGenericDemoTwo = new GenericDemoTwo<>();
        GenericDemoTwo<String> stringGenericDemoTwo = new GenericDemoTwo<>();

        integerGenericDemoTwo.add(100);
        stringGenericDemoTwo.add("你好啊");

        System.out.printf("整形数值为：%d\n\n", integerGenericDemoTwo.getT());
        System.out.printf("字符串值为：%s\n\n", stringGenericDemoTwo.getT());
    }
}
