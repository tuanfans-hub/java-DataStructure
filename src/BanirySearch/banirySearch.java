package BanirySearch;
//二分查找：给定一个内含n个元素的有序数组A，满足A0<=A1<=A2<=A3<=...<=A(n-1)，一个查找值target

public class banirySearch {
    /*参数：arr---有序数组
    *      target---待查值
    * 返回结果：找到返回索引
    *         找不到返回-1
    * */

    public static int Search(int[] arr,int target){

        //设置i=0，j=n-1
        int i=0;
        int j=arr.length-1;

        while(i<=j){    //范围i~j之间有元素
            int m=(i+j)>>>1;
            if(target<arr[m]){  //target在左边
                j=m-1;
            }else if(target>arr[m]){    //target在右边
                i=m+1;
            }else{      //找到target
                return m;
            }
        }
        return -1;      //没找到target
    }

    //二分查找改动版
    public static int Search02(int[] arr,int target){

        int i=0;
        int j=arr.length;       //第一处

        while(i<j){     //第二处
            int m=(i+j)>>>1;
            if(target<arr[m]){
                j=m;    //第三处
            }else if(target>arr[m]){
                i=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }

    //二分查找（平衡版）
    public static int search03(int[] arr,int target){
        int i=0;
        int j=arr.length;

        while(1<j-i){
            int m=(i+j)>>>1;
            if(target<arr[m]){
                j=m;
            }else{
                i=m;
            }
        }

        if(arr[i]==target){
            return i;
        }else{
            return -1;
        }
    }
}
