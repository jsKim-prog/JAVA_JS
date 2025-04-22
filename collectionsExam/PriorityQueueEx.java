package collectionsExam;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue priorityQ = new PriorityQueue();
        priorityQ.offer(3); //.offer(new Integer(3)); 오토 박싱
        priorityQ.offer(1);
        priorityQ.offer(5);
        priorityQ.offer(2);
        priorityQ.offer(4);

        System.out.println(priorityQ);
        Object obj = null;
        //요소 꺼내기
        while ((obj=priorityQ.poll())!=null){ //.poll : 읽어서 비어있으면 null 반환
            System.out.println(obj);
        }
    }
}
/*
[1, 2, 5, 3, 4]
1
2
3
4
5
 */