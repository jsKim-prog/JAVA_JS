package collectionsExam;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름:"+e.getKey()+", 점수:"+e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단:"+set);
        Collection values = map.values();
        it = values.iterator();

        int total = 0;
        while (it.hasNext()){
            Integer i = (Integer) it.next();
            total+=i.intValue();
        }

        System.out.println("총점:"+total);
        System.out.println("평균:"+(float)total/ set.size());
        System.out.println("최고점수:"+Collections.max(values));
        System.out.println("최저점수:"+Collections.min(values));

    }
}
/*
이름:안자바, 점수:90
이름:김자바, 점수:100
이름:강자바, 점수:80
이름:이자바, 점수:100
참가자 명단:[안자바, 김자바, 강자바, 이자바]
총점:370
평균:92.5
최고점수:100
최저점수:80
 */