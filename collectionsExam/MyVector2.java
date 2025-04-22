package collectionsExam;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0; //읽어올 요소의 위치
    int lastRet = -1; //마지막으로 읽어온 요소의 위치 = cursor-1

    //생성자
    public MyVector2(int capacity){
        super(capacity);
    }
    public MyVector2(){
        this(10);
    }

    //method
    public String toString(){
        String tmp = "";
        Iterator it = iterator();
        for (int i=0; it.hasNext(); i++){
            if(i!=0) tmp+=", ";
            tmp += it.next(); //tmp += next().toString();
        }
        return "["+tmp+"]";
    }
    public Iterator iterator(){
        cursor = 0; //초기화
        lastRet = -1; //초기화
        return this;
    }

    /*Iterator Override*/
    @Override
    public boolean hasNext() {
        return cursor!=size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;//마지막으로 읽은 위치 저장 -> next()없이 remove()호출시 lastRet=-1로 예외 발생

        return next;
    }

    @Override
    public void remove() {
        //삭제할 것이 없으면 예외 발생
        if(lastRet==-1){
            throw new IllegalStateException();
        }else {
            remove(lastRet);
            cursor--; //삭제후 cursor 위치 감소
            lastRet=-1; //lastRet 값 초기화
        }
    }
}
