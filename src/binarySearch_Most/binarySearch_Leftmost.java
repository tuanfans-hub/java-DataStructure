package binarySearch_Most;
//给定一个有序数组中，一个待查找的值target，返回>=target的最小索引，即target插入位置。

public class binarySearch_Leftmost {
    public static int search(int[] arr,int target){
        int i=0,j=arr.length-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target <=arr[m]){
                j=m-1;
            }else{
                i=m+1;
            }
        }
        return i;
    }
}
