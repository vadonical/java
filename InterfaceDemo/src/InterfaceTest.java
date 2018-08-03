interface Test {
    static void staticMethod() {
        System.out.println("静态方法");
    }

    default String defaultMethod(String a) {
        System.out.println("默认方法");
        return a;
    }
}

public class InterfaceTest implements Test {
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        Test.staticMethod(); //调用静态方法
        interfaceTest.defaultMethod("张三"); //调用default方法
        System.out.println(interfaceTest.defaultMethod("张三")); //打印方法返回值
    }
}
