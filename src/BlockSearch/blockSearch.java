package BlockSearch;

import java.util.Scanner;

/*分块查找适用于数据较多，但是数据不会发生变化的情况，如果需要一边添加一边查找，建议使用哈希查找
* 分块查找的过程：
* 1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。一般N=length的开方
* 2. 给每一块创建对象单独存储到数组当中
* 3. 查找数据的时候，先在数组查，当前数据属于哪一块
* 4. 再到这一块中顺序查找
* */
public class blockSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //普通分块查找的测试数据
        int[] arr = {16,5,9,12,
                21,18,32,23,37,26,45,34,
                50,48,61,52,73,66};

        block b1=new block(16,0,3);
        block b2 = new block(45,4,11);
        block b3 = new block(73,12,17);
        block[] blocks = {b1,b2,b3};
        System.out.print("输入待查找的目标值：");
        int target = sc.nextInt();
        int index = search(arr,blocks,target);
        if(index==-1){
            System.out.println("数组中没有该目标值！");
        }else{
            System.out.println("目标值索引为："+search(arr,blocks,target));
        }

        System.out.println("============水平分割线============");

        //拓展的分块查找的测试数据（无规律）
        int[] arr2 = {
                27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48
        };
        blockPro bp1 = new blockPro(22,40,0,4);
        blockPro bp2 = new blockPro(13,20,5,8);
        blockPro bp3 = new blockPro(7,10,9,10);
        blockPro bp4 = new blockPro(43,50,11,13);
        blockPro[] bps={bp1,bp2,bp3,bp4};
        System.out.print("输入待查找的目标值：");
        int target2 = sc.nextInt();
        int index2 = search2(arr2,bps,target2);
        if(index2==-1){
            System.out.println("数组中没有该目标值！");
        }else{
            System.out.println("目标值索引为："+search2(arr2,bps,target2));
        }

    }

    //普通分块查找
    public static int search(int[] arr,block[] blocks,int target){
        for(block b:blocks){
            if(target<=b.getMax()){
                for(int j=b.getStartIndex();j<=b.getEndIndex();j++){
                    if(target==arr[j]){
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    //拓展的分块查找（无规律的数据）
    public static int search2(int[] arr2,blockPro[] bps,int target){
        int blockIndex=getBlockIndex(bps,target);
        if(blockIndex!=-1){
            int startIndex = bps[blockIndex].getStartIndex();
            int endIndex = bps[blockIndex].getEndIndex();
            for(int j = startIndex;j<=endIndex;j++){
                if(arr2[j]==target){
                    return j;
                }
            }
        }
        return -1;
    }
    //确定块号方法
    public static int getBlockIndex(blockPro[] bps,int target){
        for(int i = 0;i<bps.length;i++){
            if(target>=bps[i].getMin()&&target<=bps[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
