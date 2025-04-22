package collectionsExam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
    public static void main(String[] args) {
        int[] datas = new int[8];

        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        for (int i = 1; i < 9; i++) {
            if (i > 5) {
                setB.add(i + "");
            } else if (i > 3) {
                setB.add(i + "");
                setA.add(i + "");
            } else {
                setA.add(i + "");
            }
        }

        System.out.println("A = " + setA);
        System.out.println("B = " + setB);

        Iterator it = setB.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if(setA.contains(tmp)) setKyo.add(tmp);
        }
        it = setA.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if(!setB.contains(tmp)) setCha.add(tmp);
        }
        it = setA.iterator();
        while (it.hasNext()){
            setHab.add(it.next());

        }
        it = setB.iterator();
        while (it.hasNext()){
            setHab.add(it.next());
        }

        System.out.println("A ∩ B= "+setKyo);
        System.out.println("A ∪ B= "+setHab);
        System.out.println("A - B= "+setCha);

    }
}
/*
A = [1, 2, 3, 4, 5]
B = [4, 5, 6, 7, 8]
A ∩ B= [4, 5]
A ∪ B= [1, 2, 3, 4, 5, 6, 7, 8]
A - B= [1, 2, 3]
 */