package CreateSingerLinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class SingerLinkedList implements Iterable<Integer>{
    private Node head = null;//头指针

    //单链表节点属性：值、下个节点的地址
    //内部类、private避免外界访问
    //经验分享：当一个内部类用到外部类的成员变量时，不能家static关键字
    //static关键字能加则加
    private static class Node{
        int value;
        Node next;

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    //添加元素至链表头部
    public void addFirst(int value){
        //1.链表为空
        //head=new Node(value,null);
        //2.链表非空
        head=new Node(value,head);//可处理为空和非空的两种情况
        //head=new Node(value,head.next);
    }

    //遍历链表
    public void loop1(Consumer<Integer> consumer){
        Node p = head;
        while(p!=null){
            consumer.accept(p.value);
            p=p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer){
        for(Node p=head;p!=null;p=p.next){
            consumer.accept(p.value);
        }
    }

    @Override
    public Iterator<Integer> iterator(){
        //匿名内部类
        return new Iterator<Integer>(){
            Node p=head;
            @Override
            public boolean hasNext(){//判断是否有下一个元素
                return p!=null;
            }

            @Override
            public Integer next(){//返回当前值，并指向下一个元素
                int value=p.value;
                p=p.next;
                return value;
            }
        };
    }

    //添加元素至链表尾部
    //1. 查找最后一个节点
    private Node findLast(){
        if(head==null){//空链表
            return null;
        }
        Node p;
        for(p=head;p.next!=null;p=p.next){

        }
        return p;
    }
    //2.添加元素
    public void addLast(int value){
        Node last=findLast();
        if(last==null){
            addFirst(value);
        }else{
            last.next = new Node(value,null);
        }
    }

    //根据索引找节点值
    //1.根据索引找节点
    private Node findNode(int index){
        int i=0;
        for(Node p=head;p!=null;p=p.next){
            if(i==index){
                return p;
            }
            i++;
        }
        return null;
    }
    //索引异常
    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(
                String.format("index[%d]不合法", index));
    }
    //2.获取节点值
    public int get(int index){
        Node node=findNode(index);
        if(node==null){
            throw illegalIndex(index);
        }
        return node.value;
    }

    //根据索引插入元素
    public void add(int index,int value){
        Node prev=findNode(index-1);//索引上一个节点
        //链表为空
        if(index==0){
            addFirst(value);
            return;
        }
        //index超出实际索引范围
        if(prev==null){
            throw illegalIndex(index);
        }
        prev.next=new Node(value,prev.next);
    }

    //删除链表头部元素
    public int removeFirst(){
        if(head==null){
            throw new IllegalArgumentException("链表为空！");
        }else{
            int value=head.value;
            head=head.next;
            return value;
        }
    }

    //根据索引删除链表元素
    public int remove(int index){
        if(index==0){
            return removeFirst();//当索引为0，findNode(-1)报错，而索引0的元素是可以删除的，分开讨论
        }
        Node prev=findNode(index-1);//目标节点的上一节点
        if(prev==null){
            throw illegalIndex(index);
        }
        Node node = prev.next;//目标节点
        if(node==null){
            throw illegalIndex(index);
        }else{
            prev.next=node.next;
        }
        return node.value;
    }

}



















