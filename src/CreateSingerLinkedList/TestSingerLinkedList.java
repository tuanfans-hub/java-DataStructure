package CreateSingerLinkedList;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSingerLinkedList {
    SingerLinkedList list=new SingerLinkedList();

    @Test
    public void testLoop(){
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.loop1(System.out::println);
        /*等价于
        list.loop(value->{
            System.out.println(value);
        })
         */
        list.loop2(System.out::println);
    }

    @Test
    public void testIter (){
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        for(Integer value:list){
            System.out.println(value);
        }
    }

    @Test
    public void testAddLast (){
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        Assertions.assertIterableEquals(List.of(0,1,2,3,4),list);
    }

    @Test
    public void testGet (){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list.get(3));
    }

    @Test
    public void testAdd (){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.add(0,0);
        list.add(2,100);
        list.add(4,200);
        list.add(6,300);
        list.add(8,400);
        list.add(10,500);
        list.add(11,600);
        Assertions.assertIterableEquals(
                List.of(0,1,100,2,200,3,300,4,400,5,500,600),list);
    }

    @Test
    public void testRemoveFirst (){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        int re1=list.removeFirst();
        int re2=list.removeFirst();
        //链表为空已测试，测试通过
        Assertions.assertEquals(1,re1);
        Assertions.assertEquals(2,re2);
        Assertions.assertIterableEquals(List.of(3,4,5),list);
    }

    @Test
    public void testRemove (){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        int re1=list.remove(1);
        int re2=list.remove(2);
        int re3=list.remove(0);
        //链表为空已测试，测试通过
        Assertions.assertEquals(2,re1);
        Assertions.assertEquals(4,re2);
        Assertions.assertEquals(1,re3);
        Assertions.assertIterableEquals(List.of(3,5),list);
    }
}











