package Sort_Merge;
//归并排序，也称为合并排序，运用了分治法
public class Merger {
    //归并排序第一步---分：将问题分为多个相同子问题
    public static void mergeDivide(int []Arr,int []tempArr,int left,int right){
        int mid;
        if(left<right){
            mid=(left+right)>>>1;
            mergeDivide(Arr,tempArr,left,mid);
            mergeDivide(Arr,tempArr,mid+1,right);
            mergeOperate(Arr,tempArr,left,mid,right);
        }
    }
    //归并排序第二步---治：对子问题进行操作
    private static void mergeOperate(int[] Arr,int []tempArr,int left,int mid,int right){
        //标记左半区第一个元素
        int l_temp=left;
        //标记右半区第一个元素
        int r_temp=mid+1;
        //标记临时数组第一个元素
        int temp=left;
        //合并
        while(l_temp<=mid && r_temp<=right){
            if(Arr[l_temp]<Arr[r_temp]){
                tempArr[temp++]=Arr[l_temp++];
            }else{
                tempArr[temp++]=Arr[r_temp++];
            }
        }
        //合并左半区剩余元素
        while(l_temp<=mid){
            tempArr[temp++]=Arr[l_temp++];
        }
        //合并右半区剩余元素
        while(r_temp<=right){
            tempArr[temp++]=Arr[r_temp++];
        }
        //将临时数组中的元素复制到Arr数组中
        while(left<=right){
            Arr[left]=tempArr[left];
            left++;
        }
    }
}
