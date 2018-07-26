public class DogDemo {
    public static void main(String[] args) {
        Animal animalOne = new Animal("Dog");
        animalOne.setAge(12);
        animalOne.setSex((byte) 1);
        animalOne.setBirthday("20180102");
        animalOne.printAnimalInfo();
    }
}


class Animal {
    private String name;
    private int age;
    private byte sex;
    private String birthday;

    //设置构造器
    public Animal(String name) {
        this.name = name;
    }

    //设置年龄
    public void setAge(int newAge) {
        age = newAge;
    }

    //设置性别
    public void setSex(byte newSex) {
        sex = newSex;
    }

    //设置生日
    public void setBirthday(String newBirthday) {
        birthday = newBirthday;
    }

    public void printAnimalInfo() {
        System.out.println("这条小狗的姓名是：" + name);
        System.out.println("这条小狗的年龄是：" + age);
        System.out.println("这条小狗的性别是：" + sex);
        System.out.println("这条小狗的生日是：" + birthday);
    }
}
