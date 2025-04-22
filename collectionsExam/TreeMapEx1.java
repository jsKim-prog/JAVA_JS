package collectionsExam;

import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
        TreeMap map = new TreeMap();
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], value + 1);

            } else {
                map.put(data[i], Integer.valueOf(1));
            }
        }

        Iterator it = map.entrySet().iterator();
        System.out.println("== 기본정렬 ==");
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            int value = (Integer)entry.getValue();
            System.out.println(entry.getKey()+":"+printBar('#', value)+" "+value);

        }
        System.out.println();
        //Map을 ArrayList로 변환하여 Collections.sort로 정렬
        Set set = map.entrySet();
        List list = new ArrayList(set); //ArrayList(Collection c)

        //static void sort(List list, Comparator c)
        Collections.sort(list, new ValueComparator());

        it = list.iterator();
        System.out.println("== 값의 크기 순 정렬 ==");
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            int value = (Integer)entry.getValue();
            System.out.println(entry.getKey()+":"+printBar('#', value)+" "+value);
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);
    }

    static class ValueComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry){
                Map.Entry e1=(Map.Entry) o1;
                Map.Entry e2=(Map.Entry) o2;

                int v1 = (Integer) e1.getValue();
                int v2 = (Integer) e2.getValue();
                return v2-v1;
            }
            return -1;
        }
    }
}
/*
== 기본정렬 ==
A:### 3
D:## 2
K:###### 6
Z:# 1

== 값의 크기 순 정렬 ==
K:###### 6
A:### 3
D:## 2
Z:# 1
 */