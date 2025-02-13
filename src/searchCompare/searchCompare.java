package searchCompare;

import static java.lang.System.currentTimeMillis;

public class searchCompare {
    public static int search01(int[] arr,int target){
        int i=0;
        int j=arr.length;

        while(i<j){
            int m=(i+j)>>>1;
            if(target<arr[m]){
                j=m;
            }else if(arr[m]<target){
                i=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }

    public static int search02(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
