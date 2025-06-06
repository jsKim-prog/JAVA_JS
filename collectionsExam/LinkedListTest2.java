package collectionsExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {
    public static void main(String[] args) {
        //접근시간 테스트
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();

        add(al);
        add(ll);
        print("접근시간 테스트", access(al), access(ll));

    }
    static void print(String msg, long alTime, long llTime) {
        System.out.println("== " + msg + " ==");
        System.out.println("ArrayList: " + alTime);
        System.out.println("LinkedList: " + llTime);
        System.out.println();
    }

    public static void add(List list){
        for (int i=0; i<100000;i++) list.add(i+"");
    }
    public static long access(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000;i++) list.get(i);
        long end = System.currentTimeMillis();
        return end-start;
    }

}
/*
== 접근시간 테스트 ==
ArrayList: 0
LinkedList: 315

 */