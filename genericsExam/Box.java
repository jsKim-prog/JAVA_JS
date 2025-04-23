package genericsExam;

import java.util.ArrayList;

public class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    //Ex3 추가
    ArrayList<T> getList(){
        return list;
    }

    public String toString() {
        return list.toString();
    }
}
