package collectionsExam;

import java.util.*;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");

        printList();

    }

    //그룹에 전화번호 추가
    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name); //이름은 중복될 수 있으니 전화번호를 키로 저장
    }


    //전화번호 추가(default, 그룹이름 없이 추가)
    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }
    //그룹 추가 : 중복키 없으면 HashMap 생성
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName, new HashMap());
        }
    }
    //전화번호부 전체 출력
    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println("* "+ e.getKey()+"["+subSet.size()+"]");
            while (subIt.hasNext()){
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name+" "+telNo);
            }
            System.out.println();
        }
    }
}
/*
* 기타[1]
세탁 010-888-8888

* 친구[3]
이자바 010-111-1111
김자바 010-222-2222
김자바 010-333-3333

* 회사[4]
이과장 010-777-7777
김대리 010-444-4444
김대리 010-555-5555
박대리 010-666-6666
 */