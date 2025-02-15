package Sorts;
//快速排序：第一轮：把索引0的数字作为基准数，确定基准数在数组中正确的位置：比基准数小的全部在左边（左子组），比基准数大的全部在右边（右子组）。
//        再将左子组和右子组进行快速排序
public class quickSort extends sortsFunction {
    public static void main(String[] args){
        System.out.println("\n-------------quickSort测试1--------------");
        foreach(array);
        System.out.println();
        quickSorting(array,0,array.length-1);
        foreach(array);
        System.out.println("\n-------------quickSort测试2--------------");
        foreach(array2);
        System.out.println();
        quickSorting(array2,0,array2.length-1);
        foreach(array2);
        System.out.println("\n-------------quickSort测试3--------------");
        foreach(array3);
        System.out.println();
        quickSorting(array3,0,array3.length-1);
        foreach(array3);
        System.out.println("\n-------------quickSort测试4--------------");
        foreach(array4);
        System.out.println();
        quickSorting(array4,0,array4.length-1);
        foreach(array4);
        System.out.println("\n-------------quickSort测试5--------------");
        foreach(array5);
        System.out.println();
        quickSorting(array5,0,array5.length-1);
        foreach(array5);
        System.out.println("\n----------------------------------------");

    }

    //快速排序算法
    public static void quickSorting(Integer[] array,int i,int j){
        //安全性校验：递归出口
        if(i>=j){
            return;
        }

        //把索引0的数字作为基准数，确定基准数在数组中正确的位置
        int start = i;
        int end = j+1;

        int baseNumber = array[i];  //记录基准数
        //两个指针移动，实现分组功能：数组中比baseNumber小的元素放到baseNumber索引的左边，比baseNumber大的数放到baseNumber索引的右边
        while(true){
            while(array[++start]<baseNumber){
                if(start==j){
                    break;
                }
            }
            while(array[--end]>baseNumber){
                if(end==i){
                    break;
                }
            }
            if(start>=end){
                break;
            }else{
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        //确定baseNumber的索引位置
        int temp = array[i];
        array[i]=array[end];
        array[end]=temp;

        //确定基准数左边数组中基准数的位置
        quickSorting(array,i,end-1);
        //确定基准数右边数组中基准数的位置
        quickSorting(array,end+1,j);
    }
}
