package Sorts;

public class sortsFunction {
    //测试数组
    public static Integer[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    public static Integer[] array2={4,9,56,8,4,6,2,65,66,5,15,57,8,96,32};
    public static Integer[] array3={6,1,2,7,9,3,4,5,10,8};
    public static Integer[] array4={10,8};
    public static Integer[] array5={9,7,10,8};

    //数组遍历
    public static void foreach(Integer[] array){
        for(int arr:array){
            System.out.print(arr+" ");
        }
    }

    //数组反转
    public static void reserve(Integer[] array){
        Integer[] temp = new Integer[array.length];
        System.arraycopy(array,0,temp,0,array.length);
        for(int i = 0;i<array.length;i++){
            array[i]=temp[array.length-1-i];
        }
    }

}
