package Sort_Insertion;
//插入排序；将索引0的元素到N索引的元素看做是有序的，把索引N+1的元素到最后一个当成是无序的。
//遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
//N的范围：0~最大索引
public class Insertion {
    public static void main(String[] args){
        System.out.println("\n----------------------------------insertSort----------------------------------\n");
        int[] array = {4,9,56,8,4,6,2,65,66,5,15,57,8,96,32};
        //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //reverse(array);
        foreach(array);
        System.out.println("\n------------------------------------------------------------------------------\n");
        insertSorting(array);
    }

    //插入排序算法
    public static void insertSorting(int[] array){
        //确定有序序列
        int orderListEnd = 0;
        for(int i = 0;i<array.length;i++){
            if(i==array.length-1||array[i]>array[i+1]){ //此处的逻辑符号||具有短路作用：防止数组越界，前后不能交换
                orderListEnd = i;
                break;
            }
        }
        //遍历无序数组进行插入排序
        for(int index = orderListEnd+1;index<array.length;index++){
//            int tempIndex = index;
//            for(int j = tempIndex-1;j>=0;j--){
//                if(array[tempIndex]<array[j]){
//                    int temp = array[j];
//                    array[j] = array[tempIndex];
//                    array[tempIndex] = temp;
//                    tempIndex--; //始终要保证j=tempIndex-1，确保实现相邻元素交换
//                }
//            }
            for(int j = index;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1]=temp;
                }
            }
            foreach(array);
            System.out.println();
        }
    }

    //遍历数组算法
    public static void foreach(int[] array){
        for(int arr:array){
            System.out.print(arr+"\t");
        }
    }

    //数组反转方法
    public static void reverse(int[] array){
        int[] temp = new int[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = 0;i<array.length;i++){
            array[i]=temp[array.length-1-i];
        }
    }
}
