package Sort_bubble;
//冒泡排序：相邻的两个数据两两比较，小的放前面，大的放后面
public class bubble{
    public static void main(String[] args){
        System.out.println("\n----------------------------------bubbleSort----------------------------------\n");
        //int[] array = {4,9,5,6,8,4,6,2,65,6,6,5,1,5,57,8,9632};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        reverse(array);
        foreach(array);
        System.out.println("\n------------------------------------------------------------------------------\n");
        bubbleSort(array);

        System.out.println("\n----------------------------------bubbleSort2----------------------------------\n");
        //int[] array2 = {4,9,5,6,8,4,6,2,65,6,6,5,1,5,57,8,9632};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        reverse(array2);
        foreach(array2);
        System.out.println("\n------------------------------------------------------------------------------\n");
        bubbleSort2(array2);
    }

    //冒泡排序算法
    public static void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0;i<n;n--){
            int max = array[0];
            for(int j = 1;j<n-i;j++){   //n-i:减少比较次数，提高效率
                if(array[j]>max){
                    max = array[j];
                }else{
                    array[j-1] = array[j];
                    array[j] = max;
                }
            }
            foreach(array);
            System.out.println();
        }
    }
    public static void bubbleSort2(int[] array){
        int n = array.length;
        for(int i = 0;i<n;n--){
            for(int j = 1;j<n-i;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            foreach(array);
            System.out.println();
        }
    }

    //遍历数组方法
    public static void foreach(int[] array){
//        for(int i = 0;i<array.length;i++){
//            System.out.print(array[i]+"\t");
//        }
        for(int arr:array){
            System.out.print(arr+"\t");
        }
    }

    //数组反转方法
    public static void reverse(int[] array){
        int[] temp = new int[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = 0;i<array.length;i++){
            array[i] = temp[array.length-1-i];
        }
    }
}
