package com.yelayanyu;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class MinCoinsOnePaper {

    private static int dp3(int[] arr, int aim) {
        // TODO: 2022/10/7
        return 0;
    }

    private static int dp2(int[] arr, int aim) {
        // TODO: 2022/10/7
        return 0;
    }

    private static int dp1(int[] arr, int aim) {
        // TODO: 2022/10/7
        return 0;
    }

    public static int minCoins(int[] arr, int aim) {
        // TODO: 2022/10/7
        return 0;
    }

    // 为了测试
    public static int[] randomArray(int N, int maxValue) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * maxValue) + 1;
        }
        return arr;
    }

    // 为了测试
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 为了测试
    public static void main(String[] args) {
        int maxLen = 20;
        int maxValue = 30;
        int testTime = 300000;
        System.out.println("功能测试开始");
        for (int i = 0; i < testTime; i++) {
            int N = (int) (Math.random() * maxLen);
            int[] arr = randomArray(N, maxValue);
            int aim = (int) (Math.random() * maxValue);
            int ans1 = minCoins(arr, aim);
            int ans2 = dp1(arr, aim);
            int ans3 = dp2(arr, aim);
            int ans4 = dp3(arr, aim);
            if (ans1 != ans2 || ans3 != ans4 || ans1 != ans3) {
                System.out.println("Oops!");
                printArray(arr);
                System.out.println(aim);
                System.out.println(ans1);
                System.out.println(ans2);
                System.out.println(ans3);
                System.out.println(ans4);
                break;
            }
        }
    }


}
