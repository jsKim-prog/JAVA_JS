package collectionsExam;

public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        //공백 이후의 문자들을 출력
        for (int i=0;i<95;i++){
            System.out.print(ch++);
        }
    }
}
/*
 !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~
공백부터 출력됨 
 */