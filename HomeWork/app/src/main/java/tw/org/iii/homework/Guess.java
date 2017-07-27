package tw.org.iii.homework;

/**
 * Created by iii on 2017/7/27.
 */

public class Guess {

    public String GetNumber(String s1, String s2, String s3, String s4, int[] num1) {
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int temp[] = new int[4];
        temp[0] = a;
        temp[1] = b;
        temp[2] = c;
        temp[3] = d;
        //-----------------------------------------

        String s6 = "";
        int a5 = 0;
        int b5 = 0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (num1[k] == temp[j]) {
                    if (j != k) {
                        b5++;   //累計幾個B
                    } else {
                        a5++;   //累計幾個A
                    }
                }
            }
        }
        s6 = String.valueOf(a5) + "A " + String.valueOf(b5) + "B ";

        return s6;
    }
}