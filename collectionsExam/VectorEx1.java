package collectionsExam;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        //Vector의 용량(capacity)와 크기(size)
        Vector v = new Vector(5); //용량 5인 Vector
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);
        //**배열을 크기변경 불가능. 크기변경시마다 새로운 배열을 생성, 새 배열의 주소값으로 v 이동, 기존 인스턴스는 garbage collector가 삭제
        v.trimToSize();//빈공간 없애기(용량=크기) -> 새로운 배열의 주소값으로 변경
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6); //최소용량 6으로 -> 새로운 배열의 주소값으로 변경
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7); //사이즈변경 -> 새로운 배열의 주소값으로 변경
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v){
        System.out.println(v);
        System.out.println("size: "+v.size());
        System.out.println("capacity: "+v.capacity());
    }
}
/*
[1, 2, 3]
size: 3
capacity: 5
=== After trimToSize() ===
[1, 2, 3]
size: 3
capacity: 3
=== After ensureCapacity(6) ===
[1, 2, 3]
size: 3
capacity: 6
=== After setSize(7) ===
[1, 2, 3, null, null, null, null]
size: 7
capacity: 12
=== After clear() ===
[]
size: 0
capacity: 12
 */