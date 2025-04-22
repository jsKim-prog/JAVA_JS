package collectionsExam;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; //Queue에 최대 5개 까지만 저장

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        try {
            while (true){
                System.out.println(">>");
                //입력받기
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();
                
                if("".equals(input)) continue;
                if(input.equalsIgnoreCase("q")){
                    System.exit(0);
                }else if (input.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어 "+MAX_SIZE+"개를 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i=0;
                    save(input);
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();
                    while (it.hasNext()){
                        System.out.println(++i+"."+it.next());
                    }
                }else {
                    save(input);
                    System.out.println(input);
                }
            }
        } catch (Exception e) {
            System.out.println("입력오류");
        }
    }
    //Queue 저장 메서드
    public static void save(String input){
        if(!"".equals(input)) q.offer(input);
        //최대크기 초과시 제일 처음 입력된 것 삭제
        if(q.size()>MAX_SIZE) q.remove();
    }
}
