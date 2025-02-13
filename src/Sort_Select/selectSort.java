package Sort_Select;
//选择排序：参考索引从索引0开始，拿着每一个索引上的元素跟后面的元素依次比较小的放前面，大的放后面，以此类推。
public class selectSort {
    public static void main(String[] args){
        System.out.println("\n----------------------------------selectSort----------------------------------\n");
        //int[] array = {4,9,5,6,8,4,6,2,65,6,6,5,1,5,57,8,9632};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        reverse(array);
        foreach(array);
        System.out.println("\n------------------------------------------------------------------------------\n");
        selectSorting(array);
    }

    //选择排序算法
    public static void selectSorting(int[] array){
        int n = array.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){   //i+1：优先确认了较小值，所以不能再比较参考索引之前的元素
                if(array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            foreach(array);
            System.out.println();
        }
    }

    //数组遍历算法
    public static void foreach(int[] array){
        for(int arr:array){
            System.out.print(arr+"\t");
        }
    }

    //数组反转算法
    public static void reverse(int[] array){
        int[] temp = new int[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = 0;i < array.length;i++){
            array[i]=temp[array.length-i-1];
        }
    }
}
