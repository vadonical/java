
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/30
 * Time: 9:10
 * All Rights Reserved To github.com/vadonical
 */

class Encap {
    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapDemo {
    public static void main(String[] args) {
        Encap encap = new Encap();
        encap.setAge(18);
        encap.setName("张三");
        encap.setIdNum("123456");

        System.out.println("名字为" + encap.getName() + "，年龄为" + encap.getAge() + "，工号为" + encap.getIdNum());
    }
}
