package collectionsExam;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
/*
1
2
3
4
5 --List라서 저장순서대로 읽어옴(Set은 순서 달라짐)
 */