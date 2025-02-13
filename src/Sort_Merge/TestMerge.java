package Sort_Merge;

public class TestMerge {
    public static void main(String[] args){
        int[] Arr={1,3,5,8,6,9,4,7,45,21};
        int[] tempArr=new int[Arr.length];
        print_Arr(Arr);
        Merger.mergeDivide(Arr,tempArr,0,Arr.length-1);
        print_Arr(Arr);
    }

    private static void print_Arr(int[] Arr){
        System.out.print("[");
        for(int i=0;i<Arr.length;i++){
            if(i<Arr.length-1){
                System.out.print(Arr[i]+",");
            }else{
                System.out.print(Arr[i]);
            }
        }
        System.out.println("]");
    }
}
