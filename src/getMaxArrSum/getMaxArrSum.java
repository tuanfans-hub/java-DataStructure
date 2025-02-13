package getMaxArrSum;

import java.util.Scanner;
/**@author xiexin
 * 代码未完成
 * **/
//给定一个序列，求该序列的最大序列和
public class getMaxArrSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("数组长度：");
        int length=sc.nextInt();
        System.out.println("--------录入数组--------");
        int[] Arr=getArr(length);
        System.out.println("--------遍历数组--------");
        for (int i = 0; i < Arr.length; i++) {
            if(Arr.length>1) {
                if (i == 0) {
                    System.out.print("数组Arr: [" + Arr[i] + ",");
                } else if (i == Arr.length - 1) {
                    System.out.print(Arr[i] + "]");
                } else {
                    System.out.print(Arr[i] + ",");
                }
            }else{
                System.out.print("数组Arr:["+Arr[i]+"]");
            }
        }
        System.out.println();
        int Max=getMax(Arr,length);
        System.out.println("最大序列和为"+Max);
    }


    //获取数组
    public static int[] getArr(int length){
        int[] Arr=new int[length];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Arr["+i+"]=");
            Arr[i]=sc.nextInt();
        }
        return Arr;
    }

    //获取最大序列
    public static int getMax(int[] Arr,int length){
        int Max=0;
        return Max;
    }
}
