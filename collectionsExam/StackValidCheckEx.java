package collectionsExam;


import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackValidCheckEx {
    public static void main(String[] args) {
        //입력한 수식의 괄호가 올바른지 체크
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        if(expression.isEmpty()){
            System.out.println("Usage:java StackValidCheckEx \"EXPRESSION\"");
            System.out.println("Example:java StackValidCheckEx \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        System.out.println("expression:"+expression);

        try {
            for(int i=0;i<expression.length();i++){
                char ch = expression.charAt(i);
                if(ch=='('){
                    st.push(ch+"");
                }else if(ch==')'){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                System.out.println("괄호가 일치합니다.");
            }else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }

    }
}
