package collectionsExam;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector { //Stack은 컬랙션 프레임웍 이전부터 존재-> Vector 상속
    //객체저장
    public Object push(Object item){
        addElement(item);
        return item;
    }
    //반환(위에서부터)
    public Object pop(){
        //마지막 저장된 요소 읽기 -> 빈 경우 peek()에서 Exception 발생
        Object obj = peek();
        //마지막 요소 삭제
        removeElement(size()-1);
        
        return obj;
    }
    //조회(위에서부터)
    public Object peek(){
        int len = size();
        if(len==0) throw new EmptyStackException();
        return elementAt(len-1); //마지막 요소값 
    }
    //조회(비어있는지 여부)
    public boolean empty(){
        return size()==0;
    }
    //조회(값 찾기)
    public int search(Object o){
        int i = lastIndexOf(o); //끝에서부터 검색하여 찾은 o의 index(위치)
        //Stack은 맨 위의 index == 1
        if(i>=0){ //객체 찾은 경우
            return size()-i;
        }
        return -1; //찾지 못한 경우
    }

}
