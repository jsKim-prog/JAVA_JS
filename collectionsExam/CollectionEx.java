package collectionsExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.*;

public class CollectionEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list="+list);

        addAll(list, 1,2,3,4,5);
        System.out.println("list(addAll)="+list);

        rotate(list, 2); //오른쪽으로 두칸씩 이동
        System.out.println("list(rotate)="+list);

        swap(list, 0, 2); //0, 2 인덱스 교환
        System.out.println("list(swap02)="+list);

        shuffle(list); //임의로 섞기
        System.out.println("list(shuffle)="+list);

        sort(list, reverseOrder());
        System.out.println("list(sort-reverse)="+list);

        sort(list);
        System.out.println("list(sort)="+list);

        int idx = binarySearch(list, 3); //3이 저장된 index 반환
        System.out.println("index of 3="+idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));
        System.out.println("min(reverse)="+min(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list(fill9)="+list);

        List newList = nCopies(list.size(), 2); //list와 같은 크기로 생성하고 2로 채움, 결과는 변경불가
        System.out.println("newList="+newList);

        System.out.println("disjoin="+disjoint(list, newList)); //공통요소 없으면 true

        copy(list, newList); //list에 newList 내용을 copy
        System.out.println("newList(copy)="+newList);
        System.out.println("list(copy)="+list);

        replaceAll(list, 2, 1); //2를 1로 바꾼다.
        System.out.println("list(replaceAll 2, 1)="+list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);
        System.out.println("list2="+list2);
    }
}
/*
list=[]
list(addAll)=[1, 2, 3, 4, 5]
list(rotate)=[4, 5, 1, 2, 3]
list(swap02)=[1, 5, 4, 2, 3]
list(shuffle)=[4, 1, 3, 2, 5]
list(sort-reverse)=[5, 4, 3, 2, 1]
list(sort)=[1, 2, 3, 4, 5]
index of 3=2
max=5
min=1
min(reverse)=5
list(fill9)=[9, 9, 9, 9, 9]
newList=[2, 2, 2, 2, 2]
disjoin=true
newList(copy)=[2, 2, 2, 2, 2]
list(copy)=[2, 2, 2, 2, 2]
list(replaceAll 2, 1)=[1, 1, 1, 1, 1]
list2=[1, 1, 1, 1, 1]
 */