package searchCompare;

import java.util.ArrayList;

public class searchCompare {
    //二分查找
    public static int search01(Integer[] arr,int target) {
        int i = 0;
        int j = arr.length;

        while (i < j) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m;
            } else if (arr[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
    //基本查找
    public static int search02(Integer[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //获取相同元素的索引集合
    public static ArrayList<Integer> search(Integer[] arr,int target){
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                list.add(i);
            }
        }
        return list;
    }

    //获取相同元素的索引个数
    public static int getCount(Integer[] arr,int target){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
