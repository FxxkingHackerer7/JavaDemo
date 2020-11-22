//以m行n列二维数组为参数进行方法调用，分别计算二维数组各列元素之和，返回并输出所计算的结果

import java.util.Scanner;

class Array {
    private int m;
    private int n;
    Scanner scanner = new Scanner(System.in);
    private int[][] arr;

    public void inputLen () {
        System.out.println("请输入二维数组的行数和列数：");
        m = scanner.nextInt();
        n = scanner.nextInt();
        arr = new int[m][n];
    }

    public void inputArr () {
        System.out.println("请输入" + m + "*" + n + "的数组:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void sumColumn () {
        int[] colSum = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                colSum[j] += arr[i][j];
            }
            System.out.println("第" + (j + 1) + "列之和为：" + colSum[j]);
        }
    }
}

public class Homework2_3 {
    public static void main (String[] args) {
        Array arr = new Array();
        arr.inputLen();
        arr.inputArr();
        arr.sumColumn();
    }
}
