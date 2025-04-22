package collectionsExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEX {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList(); //Queue 인터페이스의 구현체인 LinkedList 사용

        stack.push("0"); //item : 객체저장
        stack.push("1");
        stack.push("2");

        queue.offer("0"); //객체저장
        queue.offer("1");
        queue.offer("2");

        System.out.println("== Stack ==");
        while (!stack.isEmpty()){
            System.out.println(stack.pop()); //위에서부터 빼냄
        }

        System.out.println("== Queue ==");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());//꺼내서 반환
        }
    }
}
/*
== Stack ==
2
1
0
== Queue ==
0
1
2
 */