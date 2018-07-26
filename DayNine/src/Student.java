

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/12
 * Time: 16:00
 * All Rights Reserved To Zhenxian
 */

public class Student {
    private String name;
    private String gender;
    private int stuNum;
    private String classInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        student.setGender("男");
        student.setStuNum(130062);
        student.setClassInfo("软件工程");
        System.out.println("姓名是：" + student.getName());
        System.out.println("性别是：" + student.getGender());
        System.out.println("学号是：" + student.getStuNum());
        System.out.println("班级是：" + student.getClassInfo());
    }
}