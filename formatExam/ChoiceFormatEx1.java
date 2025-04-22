package formatExam;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        //패턴 미사용
        double[] limits = {60, 70, 80, 90}; //낮은값->큰값 순으로 적어야 함
        String[] grades = {"D", "C", "B", "A"}; //limits 개수/순서 == grades 개수/순서

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);
        for(int i=0;i< scores.length;i++){
            System.out.println(scores[i]+":"+form.format(scores[i]));
        }
        System.out.println("==========EX2===================");
        //패턴 사용
        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores2 = {91, 90, 80, 88, 70, 52, 60};
        ChoiceFormat ptForm = new ChoiceFormat(pattern);
        for(int n=0;n< scores2.length;n++){
            System.out.println(scores2[n]+":"+ptForm.format(scores2[n]));
        }
    }
}
/*
100:A
95:A
88:B
70:C
52:D
60:D
70:C
==========EX2===================
91:A
90:A
80:C --> B에 포함되지 않음
88:B
70:C
52:D
60:D
 */