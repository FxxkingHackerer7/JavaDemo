import java.util.Arrays;
import java.util.Random;

//产生0~100的8个随机整数，并利用冒泡排序法将其升序排序后输出（冒泡排序算法：每次进行相邻两数的比较，若次序不对，则交换两数的次序）。
public class Homework2_1 {
    public static int[] generateRandomArray (int length, int rangeL, int rangeR) {
        if (length < 0 || rangeR <= rangeL) {
            return null;
        }
        return new Random().ints(rangeL, rangeR).limit(length).toArray();
    }

    public static void main (String[] args) {
        int[] arr = generateRandomArray(8, 0, 100);
        if (arr != null) {
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length - x - 1; y++) {
                    if (arr[y] > arr[y + 1]) {
                        int temp = arr[y];
                        arr[y] = arr[y + 1];
                        arr[y + 1] = temp;
                    }
                }
            }
        }
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
