package Six_Scores;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {

    public int length;//?›¥????????
    LinkedList<Integer> longIntegers = new LinkedList<Integer>();
    Scanner inScanner = new Scanner(System.in);
    int flag = 1;//????¦Ë

    private Date(String lString) throws DateException {
        length = longIntegers.size();
    }

    //?§Ø????????????
    static Date getInstance(String lString) throws DateException {
        final Date num = new Date(lString);
        //?›¥???????›¥?????????
        for (int i = lString.length() - 1, k = 0; i >= 0; i--) {
            //?§Ø?????????
            int temp = 0;//???????????????????
            char ch = lString.charAt(i);
            if (Character.isDigit(ch) || ch == ',' || ch == '-') {//???????????§»???????
                if (ch == ',') {
                    temp++;
                    if ((temp + k) % 3 != 1)
                        throw new DateException("?????????????");
                }
                if (ch == '-') {
                    if (i != 0)
                        throw new DateException("??????????");
                }
            } else {
                throw new DateException("??????????");
            }
            if (ch != ',') k++;//??????????????
        }
        if (lString.charAt(0) == '-')
            num.flag = -1;//??????????¦Ë????
        //????????
        for (int i = lString.length() - 1, k = 0; i >= 0; i--) {
            char ch = lString.charAt(i);
            if ((Character.isDigit(ch))) {
                num.longIntegers.add(k, 0);
                num.longIntegers.set(k, ch - '0');
                k++;//??????????
            }
        }
        return num;
    }

    //??§ÕtoString????
    @Override
    public String toString() {
        String c = "";
        String b = "";
        for (int i = longIntegers.size() - 1; i >= 0; i--) {
            c = b + longIntegers.get(i);
            b = c;
        }
        if (this.flag == -1)
            return "-" + c;
        return c;
    }


}
