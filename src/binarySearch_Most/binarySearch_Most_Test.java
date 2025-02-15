package binarySearch_Most;

public class binarySearch_Most_Test {
    public static void main(String[] agrs){
        int[] arr={1,2,2,2,3,3,3,3,4,5,7,8,8,9};
        binarySearch_Leftmost.search(arr,3);
        binarySearch_Leftmost.search(arr,8);
        binarySearch_Leftmost.search(arr,6);

        System.out.println(binarySearch_Leftmost.search(arr,3));//4
        System.out.println(binarySearch_Leftmost.search(arr,8));//11
        System.out.println(binarySearch_Leftmost.search(arr,6));//10
        System.out.println(binarySearch_Leftmost.search(arr,0));//0
        System.out.println(binarySearch_Leftmost.search(arr,10));//14

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

        System.out.println(binarySearch_Rightmost.search(arr,3));//7
        System.out.println(binarySearch_Rightmost.search(arr,8));//12
        System.out.println(binarySearch_Rightmost.search(arr,6));//9
        System.out.println(binarySearch_Rightmost.search(arr,0));//-1
        System.out.println(binarySearch_Rightmost.search(arr,10));//13
    }
}
