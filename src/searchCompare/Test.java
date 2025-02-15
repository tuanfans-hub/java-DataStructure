package searchCompare;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Test {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = new int[100000];
        for(int i = 0;i<arr.length;i++){
            arr[i]=rand.nextInt(10000);
        }
        int[] arrSort = sort(arr);
        int target = rand.nextInt(1000);
        System.out.println(target);
        long a=currentTimeMillis();

        //System.out.println(Instant.now());
        int index1 = searchCompare.search01(arrSort,target);
        //System.out.println(Instant.now());
        long b=currentTimeMillis();

        int index2 = searchCompare.search02(arrSort,target);
        //System.out.println(Instant.now());
        long c=currentTimeMillis();
        System.out.println(index1+","+index2);
        if(index1!=-1){
            System.out.println(arrSort[index1]+","+arrSort[index2]);
        }
        System.out.println(b-a);
        System.out.println(c-b);
    }

    //排序算法
    public static int[] sort(int[] arr){
        int n = arr.length-1;
        for(int j = 0;j<n;n--){
            for(int i = 1;i<n-j;i++){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
