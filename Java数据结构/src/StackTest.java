/*
*栈是Vector的一个子类，它实现了一个标准的后进先出的栈。

堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。

Stack()
*/

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    private static void show_push(Stack<Integer> stack, int a){
        stack.push(a);
        System.out.println(stack);
    }

    private static void show_pop(Stack<Integer> stack){
        System.out.println("POP:");
        Integer a = (Integer) stack.pop();
        System.out.println(a);
        System.out.println(stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        show_push(stack,1);
        show_push(stack,2);
        show_push(stack,3);
        show_push(stack,4);
        show_push(stack,5);
        show_pop(stack);
        show_pop(stack);
        show_pop(stack);
        show_pop(stack);
        show_pop(stack);
        System.out.println(stack);
        try {
            show_pop(stack);
        }catch (EmptyStackException e){
            System.out.println("空栈");
        }

    }
}
