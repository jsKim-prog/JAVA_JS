package collectionsExam;

import java.util.Set;
import java.util.TreeSet;

public class TreeLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i=0;set.size()<6;i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
/*
[14, 19, 34, 35, 36, 38]

[5, 7, 17, 29, 33, 38]
 */