package collectionsExam;

import java.util.Comparator;

public class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2)*-1; //-1을 곱해 역순으로 변경
        }
        return -1;
    }
}
