package collectionsExam;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        String[] data = {
                "abc", "alien", "bat",
                "car", "Car", "disc",
                "dance", "dZZZZ", "dzzzz",
                "elephant", "elevator", "fan", "flower"
        };
        for(String str:data){
            set.add(str);
        }

        System.out.println(set);
        System.out.println("range search: from "+from+" to "+to);
        System.out.println("result1: "+set.subSet(from, to));
        System.out.println("result2: "+set.subSet(from, to+"zzz"));
    }
}
/*
[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
range search: from b to d
result1: [bat, car] -> d 미포함, c까지만 검색
result2: [bat, car, dZZZZ, dance, disc] -> dzzz 미포함, 이전 까지 검색

 */