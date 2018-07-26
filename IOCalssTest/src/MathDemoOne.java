public class MathDemoOne {
    public static void main(String []args){
        double[] nums = {1.4,1.5,1.6,-1.4,-1.5,-1.6};
        for (double num : nums){
            test(num);
        }
    }

    private static void test(double num){
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));

        System.out.println(Math.pow(2.5,2.3));
        System.out.println(Math.random());
        System.out.println(Math.toDegrees(1));
        System.out.println(Math.toRadians(45));
        System.out.println(Math.atan(1));
    }
}
