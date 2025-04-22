package collectionsExam;

import java.util.*;

public class HashSetLotto5SetMake {
    //Lotto 5set 만들기 : 입력한 숫자만큼의 로또번호 셋트 생성
    // 완전 같은 번호의 리스트가 생성되면 다시 생성
    static final int MAX_SET = 5; //최대생성 세트수 5셋트
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("구입셋트 숫자입력 >>>");
            int setNum = sc.nextInt();
            if(setNum>MAX_SET) {
                System.out.println("최대 5셋트까지만 가능합니다.");

            } else {
                List<ArrayList<Integer>> lottos = makeSetList(setNum);

                System.out.println("=== LOTTO "+setNum+"set ===");
                for(ArrayList<Integer> list:lottos){
                    System.out.println(list);
                }
                break;
            }
        }



    }
    //하나의 set 생성하여 배열로 반환
    static ArrayList<Integer> makeSet(){
        Set<Integer> set = new HashSet<>();
        for(int i=0; set.size()<6;i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        ArrayList<Integer> oneList = new ArrayList<>(set);
        Collections.sort(oneList);
        return oneList;
    }

    //입력한 숫자만큼의 setList 생성
    static List<ArrayList<Integer>> makeSetList(int setNum){
        List<ArrayList<Integer>> setList = new ArrayList<>();
        setList.add(makeSet()); //1번은 무조건 넣어줌

        while (setList.size()<setNum){
            for(int i=1; i<setNum;i++){ //2번부터 검증하며 넣어줌
                ArrayList<Integer> oneList = makeSet();
                if(!checkList(setList, oneList)){
                    setList.add(oneList);
                }else {
                    oneList.clear();
                    i--; //반복문을 개수만큼 다시 돌리기 위해
                }
            }
        }

        return setList;
    }
    //리스트 중복(6개의 숫자가 모두 동일) 시 다시 생성 하여 setList에 추가
    static boolean checkList(List<ArrayList<Integer>> setList, ArrayList<Integer> oneList){
        for(ArrayList<Integer> list:setList){
            if(oneList.equals(list)) return true;
        }
        return false;
    }


}
