package CreateArrsyList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//通过java代码实现动态数组
public class CreatDynamicArray implements Iterable<Integer> {
    private int size=0;//逻辑大小
    private int capecity=10;//容量
    private int[] Arr= {};

    //添加元素
    public void addlast(int element)throws Exception{
//        Arr[size]=element;
//        size++;
        add(size,element);
    }

    public void add(int index,int element)throws Exception{
        cheakAndgrow();
        if(index<=size&&index>=0){
            System.arraycopy(Arr,index,Arr,index+1,size-index);
            Arr[index]=element;
            size++;
        }else{
            throw new Exception("索引<" +index+
                    ">不合法");
        }
    }

    //扩容检查并扩容
    private void cheakAndgrow() {
        if(size==0){
            Arr=new int [capecity];
        }else if(size==capecity){
            capecity=3*capecity>>>1;
            int[] newArr=new int[capecity];
            System.arraycopy(Arr,0,newArr,0,size);
            Arr=newArr;
        }
    }

    /*
    public int getelement(int index){
            return Arr[index];
    }
    */

    //遍历数组01:Consumer遍历
    public void foreach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(Arr[i]);
        }
    }

    //遍历数组02：Iterator迭代器遍历
    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            int i=0;
            @Override
            public boolean hasNext() {      //判断是否存在下一个元素
                return i<size;
            }

            @Override
            public Integer next() {         //返回当前元素，并移动到下一个元素
                return Arr[i++];
            }
        };
    }

    //遍历数组03：流方式遍历
    public IntStream stream(){
        return IntStream.of(Arrays.copyOfRange(Arr,0,size));
    }

    //删除元素
    public int remove(int index) throws Exception {
        if(index>=size||index<0){
            throw new Exception("索引<"+index+
                    ">不合法");
        }
        int removed=Arr[index];
        if(index<size-1) {
            System.arraycopy(Arr, index + 1, Arr, index, size - index - 1);
        }
        size--;
        return removed;
    }

    //获取数组容量
    public int getCapecity(){
        return capecity;
    }
}
