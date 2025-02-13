package day0612;

public class Demo01 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,1};
        int[] nums2={2,7,9,3,1};
        int sum=maxMoney(nums1,nums1.length-1);
        System.out.println(sum);

        int sum1=maxMoney2(nums1);
        System.out.println(sum1);

        int sum2=maxMoney3(nums1);
        System.out.println(sum2);

        int sum3=maxMoney4(nums2);
        System.out.println(sum3);
    }

    //递归
    public static int maxMoney(int[] nums,int index){
        if(index==0){
            return nums[index];
        }else if(index==1){
            return Math.max(nums[index-1],nums[index]);
        }else{
            return Math.max(maxMoney(nums,index-1),maxMoney(nums,index-2)+nums[index]);
        }
        //缺点：重复递归
    }

    //迭代
    public static int maxMoney2(int[] nums){
        //使用临时数组，储存不同下标最优解
        int[] temp = new int[nums.length];
        temp[0]=nums[0];
        temp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            temp[i]=Math.max(temp[i-2]+nums[i],temp[i-1]);
        }
        return temp[nums.length-1];
        //缺点：定义了一个临时数组，如果长度过长，很容易浪费内存，；空间复杂度过大
    }

    //迭代优化
    public static int maxMoney3(int[] nums){
        int one=nums[0];
        int two=nums[1];
        for(int i=2;i<nums.length;i++){
            int temp=two;
            two=Math.max(two,one+nums[i]);
            one=temp;
        }
        return two;
    }

    //打家劫舍进阶版(首尾相连)
    public static int linked(int[] nums,int begin,int end){
        int one=nums[begin];
        int two=Math.max(nums[begin],nums[begin+1]);
        for(int i=begin+2;i<=end;i++){
            int temp=two;
            two=Math.max(two,one+nums[i]);
            one=temp;
        }
        return two;
    }
    public static int maxMoney4(int[] nums){
        return Math.max(
                linked(nums,0,nums.length-2),
                linked(nums,1,nums.length-1)
        );
    }

}
