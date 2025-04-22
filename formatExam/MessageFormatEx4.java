package formatExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "data4.txt";
        String msg = "INSERT INTO "+tableName+" VALUES ({0}, {1}, {2}, {3})";
        Scanner scanner = new Scanner(new File(fileName)); //Scanner-Exception

        String pattern = "{0}, {1}, {2}, {3}";
        MessageFormat mf = new MessageFormat(pattern);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Object[] objects = mf.parse(line); //parse-Exception
            System.out.println(MessageFormat.format(msg, objects));
        }
        scanner.close();
    }
}
