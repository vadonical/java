public class BubbleSort {
    /*
     * 这是冒泡排序法
     * 外层长度减1
     * 内层长度减少外层已经排了的数后减1
     * 若是后者大，交换位置
     * */

    public static void main(String[] args) {
        System.out.println("UnSorted:");
        int[] a = {20, 56, 46, 4, 6, 5, 4, 6, 4, 6, 5, 65, 66, 6, 63, 9, 8, 75, 6};
        for (int n : a) {
            System.out.print(n + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("Sorted:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

