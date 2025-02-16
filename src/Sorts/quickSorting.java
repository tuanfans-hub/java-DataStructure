package Sorts;

public class quickSorting {
    // 数组内排序
    public static void sort(Comparable[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);
    }

    // 判断两索引之间元素的排序
    public static void sort(Comparable[] array, int low, int high) {
        // 安全性校验
        if (high <= low) {
            return;
        }
        // 对数组进行分组（左子组和右子组），并得到临界索引
        int middleIndex = groupBy(array, low, high);
        // 对左子组排序
        sort(array, low, middleIndex - 1);
        // 对右子组排序
        sort(array, middleIndex + 1, high);
    }

    // 对两个索引之间进行分组，并返回临界索引
    public static int groupBy(Comparable[] array, int low, int high) {
        // 确定基准值
        Comparable key = array[low];
        // 定义两个指针
        int left = low;
        int right = high + 1;

        // 切分
        while (true) {
            // 从右往左扫描，移动right指针，直到找到元素小于key的值，停止
            while (isSmall(key, array[--right])) {
                if (right == low) {
                    break;
                }
            }
            // 从左往右扫描，移动left指针，直到找到元素大于key的值，停止
            while (isSmall(array[++left], key)) {
                if (left == high) {
                    break;
                }
            }
            // 判断left是否大于或等于right，如果是，则扫描结束；如果否，则交换元素
            if (left >= right) {
                break;
            } else {
                exchange(array, left, right);
            }
        }
        // 基准值与临界元素进行交换
        exchange(array, low, right);
        return right;
    }

    // 判断两元素的大小关系
    public static boolean isSmall(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;    //compareTo()方法：Comparable接口提供的抽象方法，用于定义排序规则
    }

    // 交换数组中的元素
    public static void exchange(Comparable[] array, int a, int b) {
        Comparable temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}