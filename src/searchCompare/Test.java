package searchCompare;

import Sorts.quickSorting;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        //测试数组的长度
        System.out.print("测试数组的长度(<100000000)：");
        int arrLength = sc.nextInt();

        //随机数生成范围
        System.out.print("随机数生成范围(<int的最大值)：");
        int randNumber = sc.nextInt();

        Integer[] arr = new Integer[arrLength];
        for(int i = 0;i<arr.length;i++){
            arr[i]=rand.nextInt(randNumber);
        }
        //排序前数组
        //sortsFunction.foreach(arr);
        //System.out.println();

        quickSorting.sort(arr);
        //排序后数组
        //sortsFunction.foreach(arr);
        //System.out.println();

        int target = rand.nextInt(randNumber);
        System.out.println("\n待查找的元素："+target);

        long a=System.currentTimeMillis();
        int index1 = searchCompare.search01(arr,target);

        long b=System.currentTimeMillis();
        int index2 = searchCompare.search02(arr,target);

        long c=System.currentTimeMillis();

        //ArrayList<Integer> list = searchCompare.search(arr,target);
        //System.out.println("元素等于"+target+"的索引："+list);
        //System.out.println("元素等于"+target+"索引总计："+list.size()+"个");

        //优化：使用基本数据类型减少堆内存的占用
        System.out.println("元素等于"+target+"索引总计："+searchCompare.getCount(arr,target)+"个");

        System.out.println("二分查找index1="+index1+"，"+"runtime="+(b-a)+"ms（index=-1表示无该元素）");
        System.out.println("基本查找index2="+index2+"，"+"runtime="+(c-b)+"ms（index=-1表示无该元素）");

    }

}