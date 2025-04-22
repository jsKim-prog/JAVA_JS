package collectionsExam;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myID", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("ID와 PW 입력>>>");
            System.out.println("ID:");
            String id = sc.nextLine().trim();

            System.out.println("PW:");
            String pw = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력한 ID는 존재하지 않습니다. \n다시 입력해 주세요.");
                continue;
            }
            if (!map.get(id).equals(pw)){
                System.out.println("패스워드 오류.\n다시 입력해 주세요.");
            }else {
                System.out.println("로그인 성공");
                break;
            }
        }
    }
}
