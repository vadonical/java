import java.util.Random;

public class RandomDemo {

   /* public String getStringRandom(int length) {

        String val = "";
        Random random = new Random();
        //length为几位密码
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }*/


    public static void main(String[] args) {
//        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.print((int) (1 + Math.random() * 10 - 1 + 1));
        }

        /*Random random = new Random();
        for (int i = 0; i < 30; i++) {
            System.out.println(random.nextInt(10) + 1);
        }*/

        System.out.println();

        /*for (int i = 0; i < 15; i++) {
            System.out.print((int) (Math.random() * 100 + 1) + " ");
        }*/

    }
}
