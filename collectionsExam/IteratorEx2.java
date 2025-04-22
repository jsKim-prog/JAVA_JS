package collectionsExam;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            original.add(i + "");
        }
        Iterator it = original.iterator();

        while (it.hasNext()){
            copy1.add(it.next());
        }
        System.out.println("== Original -> copy1 복사 ==");
        System.out.println("Original:"+original);
        System.out.println("copy1:"+copy1);
        System.out.println();

        it = original.iterator(); //Iterator는 재사용 안되므로 다시 얻어와야 함(retrun new Itr():private Class)
        while (it.hasNext()){
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("== Original -> copy2 이동 ==");
        System.out.println("Original:"+original);
        System.out.println("copy2:"+copy2);
        System.out.println();

    }

}
/*
== Original -> copy1 복사 ==
Original:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
copy1:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

== Original -> copy2 이동 ==
Original:[]
copy2:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */