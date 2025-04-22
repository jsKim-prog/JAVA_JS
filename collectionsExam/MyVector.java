package collectionsExam;

import java.util.*;

public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;
    //생성자
    public MyVector(){
        //크기 지정 없을 시  용량 10
        this(10);
    }
    public MyVector(int capacity){
        if(capacity<0) throw  new IllegalArgumentException("유효하지 않은 값입니다. :"+capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }
    //메서드 - 용량변경 실행
    private void setCapacity(int capacity){
        if(this.capacity==capacity){
            return; //용량이 같으면 변경 없음
        }
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp,0,size);
        data = tmp;
        this.capacity = capacity;
    }
    //메서드 - 최소한의 저장공간(capacity) 확보
    public void ensureCapacity(int minCapacity){
        if(minCapacity - data.length>0){
            setCapacity(minCapacity);
        }
    }

    public void trimToSize(){
        setCapacity(size);
    }

    public int capacity(){
        return capacity;
    }

    /*List 클래스에서 상속받은 메서드 : 수정*/
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }


    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }


    @Override
    public boolean remove(Object obj) {
        for(int i=0;i<size;i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }

    //메서드 - 객체저장(저장 전 저장할 공간 확보
    @Override
    public boolean add(Object obj){
        ensureCapacity(size+1);
        data[size++] = obj;
        return true;
    }
    @Override
    public void clear() {
        for(int i=0;i<size;i++){
            data[i]=null;
            size=0;
        }
    }

    @Override
    public Object get(int index) {
        if(index<0||index>=size) throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        return data[index];
    }

    @Override
    public Object remove(int index) {
        Object oldObj = null;
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        //삭제하고자 하는 객체가 마지막 객체가 아니면, 배역복사를 통해 빈자리 채워줘야 함
        if(index!=size-1){
            System.arraycopy(data, index+1,data,index, size-index-1);
            //data[index+1]에서 data[index]로 (size-index-1)개의 데이터 복사
            //(data, 3, data, 2, 2) data[3]에서 data[2]로 2개의 데이터 복사
        }
        //마지막 데이터는 null, 마지막 요소의 index = size-1
        data[size-1] = null;
        size--; //데이터가 삭제되어 개수 줄었으므로 사이트 감소
        return oldObj;
    }

    /*List 클래스에서 상속받은 메서드 : 컴파일만 가능하도록 최소한 구현*/
    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
