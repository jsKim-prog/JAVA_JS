package collectionsExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int)(Math.random()*50)+1+"");
        }

        Iterator it = set.iterator();

        for(int j=0;j<board.length;j++){
            for (int k=0;k<board[j].length; k++){
                board[j][k] = Integer.parseInt((String) it.next());
                System.out.print((board[j][k]<10? "  ":" ")+board[j][k]);
            }
            System.out.println();
        }
    }
}
/* HashSet()
 22 44 23 24 48
 27 28 50 10 32
 11 12 35 14 37
 15 16 39  3  4
  8  9 40 42 43


 45 24 47 25 27
 28 31 10 34 14
 37 15 38 17 18
 19  1  4  6 40
 41 42 20 43 21

 22 44 45 23 46
 25 48 26 27 28
 29 50 31 32 33
 11 34 14 16 17
 18  5  9 20 43


LinkedHashSet()
 11 27 35 19  4
 31 48 45 47 41
  6 42  9 21 15
 25  7 10 50 26
 14 13  5 46  2

 48 42 43 12 33
 13 50 34 18 44
 38  2  8 41 23
  7 45 17 27  4
 37 30 36 15  3

  9 49  1 16 40
 36 34 39 37 28
 35  6 24 44 45
  8 26 19 23 13
 38  3 10 25 17
 */