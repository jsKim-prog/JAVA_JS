package collectionsExam;

import java.util.Stack;

public class StackEx1 { //앞, 뒤 버튼 기능
    public static Stack back = new Stack();
    public static Stack forward = new Stack();
    
    public static void main(String[] args) {
        goURL("1.구글");
        goURL("2.네이버");
        goURL("3.다음");
        goURL("4.네이트");

        printStatus();

        goBack();
        System.out.println("== After goBack() ==");
        printStatus();

        goBack();
        System.out.println("== After goBack() ==");
        printStatus();

        goForward();
        System.out.println("== After goForward() ==");
        printStatus();

        goURL("codechobo.com");
        System.out.println("== After new URL ==");
        printStatus();
        
    }
    
    public static void printStatus(){
        System.out.println("back:"+back);
        System.out.println("forward:"+forward);
        System.out.println("현재화면:"+back.peek());
    }
    
    public static void goURL(String url){
        back.push(url);
        if(!forward.empty()) forward.clear(); //'forward'에 내용이 있으면 비우로 새 url을 'back'에 쌓는다.
        //.empty() : return size()==0;
    }
    
    public static void goForward(){
        if(!forward.empty()) back.push(forward.pop());
        //forward 최상단 값을 꺼내 back 최상단으로 보낸다.
    }
    
    public static void goBack(){
        if(!back.empty()){
            forward.push(back.pop());
            //back 최상단 값을 꺼내 forward 최상단에 넣는다.
        }
    }
    
}
/*
back:[1.구글, 2.네이버, 3.다음, 4.네이트]
forward:[]
현재화면:4.네이트
== After goBack() ==
back:[1.구글, 2.네이버, 3.다음]
forward:[4.네이트]
현재화면:3.다음
== After goBack() ==
back:[1.구글, 2.네이버]
forward:[4.네이트, 3.다음]
현재화면:2.네이버
== After goForward() ==
back:[1.구글, 2.네이버, 3.다음]
forward:[4.네이트]
현재화면:3.다음
== After new URL ==
back:[1.구글, 2.네이버, 3.다음, codechobo.com]
forward:[]
현재화면:codechobo.com
 */