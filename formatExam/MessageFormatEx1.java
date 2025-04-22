package formatExam;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1}\nAge:{2}\nBirthday:{3}";
        Object[] arguments = {
                "김무명", "02-123-4567", "31", "07-09"
        };
        String result = MessageFormat.format(msg,arguments);
        System.out.println(result);

        System.out.println("========= EX2 ===========");
        String tableName = "CUST_INFO";
        String msg2 = "INSERT INTO "+tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'');";
        Object[][] arguments2 = {
                {"김무명", "02-123-4567", "31", "07-09"},
                {"이자바", "031-123-1234", "26", "10-07"},
        };
        for(int i=0;i<arguments2.length;i++){
            String rst = MessageFormat.format(msg2, arguments2[i]);
            System.out.println(rst);
        }
        //데이터에서 추출
        System.out.println("========= EX3 ===========");
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('김무명', '02-123-4567', '31', '07-09');",
                "INSERT INTO CUST_INFO VALUES ('이자바', '031-123-1234', '26', '10-07');"
        }; 
        String pattern = "INSERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3});";
        MessageFormat mf = new MessageFormat(pattern);
        try {
            for (int j=0;j< data.length;j++){
                Object[] objs = mf.parse(data[j]);
                for (int k=0; k<objs.length; k++){
                    System.out.print(objs[k]+", ");
                }
                System.out.println();
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
/*
Name: 김무명
Tel: 02-123-4567
Age:31
Birthday:07-09
========= EX2 ===========
INSERT INTO CUST_INFO VALUES ('김무명', '02-123-4567', '31', '07-09');
INSERT INTO CUST_INFO VALUES ('이자바', '031-123-1234', '26', '10-07');
========= EX3 ===========
'김무명', '02-123-4567', '31', '07-09',
'이자바', '031-123-1234', '26', '10-07',
* */