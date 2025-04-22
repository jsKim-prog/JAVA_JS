package collectionsExam;

import java.util.Arrays;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr); //by Comparable
        System.out.println("strArr="+Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 없음
        System.out.println("strArr(insensitive_order)="+Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());//역순
        System.out.println("strArr(descending)="+Arrays.toString(strArr));

    }
}

/*
strArr=[Dog, cat, lion, tiger]
strArr(insensitive_order)=[cat, Dog, lion, tiger]
strArr(descending)=[tiger, lion, cat, Dog]

 */