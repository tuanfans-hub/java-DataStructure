package BasicSearch;

import java.util.ArrayList;

public class basicSearch {
    public static void main(String[] args){
        // 基本查找
        //核心：从数据结构线的一端开始，顺序扫描，依次将遍历到的结点与要查找的值相比较，若相等则表示查找成功；若遍历结束仍没有找到相同的，表示查找失败。
        int[] arr = {131,127,147,81,103,23,7,79};
        int target = 82;
        System.out.println(search(arr,target));
        System.out.println("======================");
        int[] arr2 = {131,127,81,147,81,103,23,7,79};
        int target2 = 81;
        ArrayList<Integer> index=searchIndex(arr2,target2);
        for (Integer j : index) {
            System.out.println(j);
        }
    }

    public static boolean search(int[] arr,int target){
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> searchIndex(int[] arr,int target){
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
