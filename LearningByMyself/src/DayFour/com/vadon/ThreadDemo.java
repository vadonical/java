package DayFour.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/5
 * Time: 12:49
 * All Rights Reserved To Zhenxian
 */

//创建第一个线程
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //创建第二个线程
        t = new Thread(this, "Demo");
        System.out.println("Child thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();//创建第一个线程
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }

}
