package collectionsExam;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David", 10));
        System.out.println(set);
    }


}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return name+":"+age;
    }
}

/*
[abc, David:10, David:10]
: 객체 안의 값이 같은데도 Set이 다른 값으로 판단
 */