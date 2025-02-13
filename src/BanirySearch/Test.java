package BanirySearch;

public class Test extends banirySearch{
    public static void main(String[] args){
        int[] arr= {7,15,21,36,49,52,62,64,99};
        System.out.println(Search(arr,7));       //0
        System.out.println(Search(arr,15));      //1
        System.out.println(Search(arr,21));      //2
        System.out.println(Search(arr,36));      //3
        System.out.println(Search(arr,49));      //4
        System.out.println(Search(arr,52));      //5
        System.out.println(Search(arr,62));      //6
        System.out.println(Search(arr,64));      //7
        System.out.println(Search(arr,99));      //8
        System.out.println(Search(arr,100));      //-1

        System.out.println("-------------------");
        System.out.println("-------------------");

        System.out.println(search03(arr,7));       //0
        System.out.println(search03(arr,15));      //1
        System.out.println(search03(arr,21));      //2
        System.out.println(search03(arr,36));      //3
        System.out.println(search03(arr,49));      //4
        System.out.println(search03(arr,52));      //5
        System.out.println(search03(arr,62));      //6
        System.out.println(search03(arr,64));      //7
        System.out.println(search03(arr,99));      //8
        System.out.println(search03(arr,100));      //-1
    }
}
