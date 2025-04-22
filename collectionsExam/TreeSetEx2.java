package collectionsExam;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
        for(int i=0;i<score.length;i++){
            set.add(score[i]);
        }
        System.out.println("50보다 작은 값: "+set.headSet(50)); //아래쪽 가지 값들
        System.out.println("50보다 큰 값: "+set.tailSet(50)); // 위쪽 가지 값들
    }
}
/*
50보다 작은 값: [10, 35, 45]
50보다 큰 값: [50, 65, 80, 95, 100]
**new Integer() 는 java 9 이상에서 사용되지 않음. 그냥 int로 넣어도 됨
 */