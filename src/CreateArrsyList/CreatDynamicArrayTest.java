package CreateArrsyList;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CreatDynamicArrayTest {

    @Test
    @DisplayName("添加元素测试")
    public void addTest() throws Exception {
        CreatDynamicArray Array=new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);

        Assertions.assertIterableEquals(List.of(1,2,3,4,5),Array);
        /*
        for (int index = 0; index < 5; index++) {
            System.out.println(Array.getelement(index));
        }
        System.out.println("==========================");
        */
        CreatDynamicArray Array2=new CreatDynamicArray();
        Array2.addlast(1);
        Array2.addlast(2);
        Array2.addlast(3);
        Array2.addlast(4);
        Array2.addlast(5);
        Array2.add(0,100);
        Array2.add(6,100);
        Array2.add(4,100);

        Assertions.assertIterableEquals(List.of(100,1,2,3,100,4,5,100),Array2);
        /*
        for (int index = 0; index < 8; index++) {
            System.out.println(Array2.getelement(index));
        }
        */
    }

    @Test
    @DisplayName("Consumer遍历元素测试")
    public void forEachTest() throws Exception {
        CreatDynamicArray Array=new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5),Array);

        System.out.print("遍历Array:");
        //Array.foreach(System.out::println);
        Array.foreach((element)->{
            System.out.print(element+" ");
        });
    }

    @Test
    @DisplayName("Iterator遍历元素测试")
    public void IteratorTest() throws Exception {
        CreatDynamicArray Array = new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);

        Assertions.assertIterableEquals(List.of(1,2,3,4,5),Array);

        System.out.print("遍历Array:");
        for (Integer element : Array) {
            System.out.print(element+" ");
        }
    }

    @Test
    @DisplayName("流方式遍历测试")
    public void streamTest() throws Exception {
        CreatDynamicArray Array = new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);

        Assertions.assertIterableEquals(List.of(1,2,3,4,5),Array);

        System.out.print("遍历Array:");
        Array.stream().forEach(element->{
            System.out.print(element+" ");
        });
    }

    @Test
    @DisplayName("删除元素测试")
    public void removeTest() throws Exception {
        CreatDynamicArray Array = new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);

        Assertions.assertEquals(1,Array.remove(0));
        Assertions.assertIterableEquals(List.of(2,3,4,5),Array);

        Assertions.assertEquals(2,Array.remove(0));
        Assertions.assertIterableEquals(List.of(3,4,5),Array);

        Assertions.assertEquals(3,Array.remove(0));
        Assertions.assertIterableEquals(List.of(4,5),Array);

        Assertions.assertEquals(4,Array.remove(0));
        Assertions.assertIterableEquals(List.of(5),Array);

        Assertions.assertEquals(5,Array.remove(0));
        Assertions.assertIterableEquals(List.of(),Array);
        /*
        System.out.print("删除前遍历Array:");
        Array.foreach(element->{
            System.out.print(element+" ");
        });
        System.out.println();
        int index=2;
        int removed=Array.remove(index);
        assert removed==2:"元素删除错误："+removed;
        System.out.println("删除的元素为：Array["+index+"]="+ removed);
        System.out.print("删除后遍历Array:");
        for(Integer element:Array){
            System.out.print(element+" ");
        }
        */
    }

    @Test
    @DisplayName("扩容检查测试")
    public void biggerArrayTest() throws Exception {
        CreatDynamicArray Array=new CreatDynamicArray();
        Array.addlast(1);
        Array.addlast(2);
        Array.addlast(3);
        Array.addlast(4);
        Array.addlast(5);
        Array.addlast(6);
        Array.addlast(7);
        Array.addlast(8);
        Array.addlast(9);
        Array.addlast(10);
        Array.addlast(11);
        Array.addlast(12);
        Array.addlast(13);
        Array.addlast(14);
        Array.addlast(15);
        Array.addlast(16);

        Assertions.assertEquals(22,Array.getCapecity());
        Assertions.assertIterableEquals(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16),Array);

    }
}
