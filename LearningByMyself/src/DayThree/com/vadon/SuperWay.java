package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 14:51
 * All Rights Reserved To Zhenxian
 */

public class SuperWay {
    public static void main(String []args){
        AnimalSuper animalSuper = new DogSuper();
        animalSuper.move();
    }
}


class AnimalSuper{
    public void move(){
        System.out.println("动物可以移动！");
    }
}

class DogSuper extends AnimalSuper{
    public void move(){
        super.move();
        System.out.println("狗狗可以跑和走！");
    }
}