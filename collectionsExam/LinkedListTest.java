package collectionsExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        print("순차적으로 추가하기", add1(al), add1(ll));
        print("중간에 추가하기", add2(al), add2(ll));
        print("중간에서 삭제하기", remove2(al), remove2(ll));
        print("순차적으로 삭제하기", remove1(al), remove1(ll));

    }

    static void print(String msg, long alTime, long llTime) {
        System.out.println("== " + msg + " ==");
        System.out.println("ArrayList: " + alTime);
        System.out.println("LinkedList: " + llTime);
        System.out.println();
    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.add(i + "");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
/*
== 순차적으로 추가하기 ==
ArrayList: 188
LinkedList: 206

== 중간에 추가하기 ==
ArrayList: 13837
LinkedList: 31

== 중간에서 삭제하기 ==
ArrayList: 13706
LinkedList: 157

== 순차적으로 삭제하기 ==
ArrayList: 15
LinkedList: 47
 */