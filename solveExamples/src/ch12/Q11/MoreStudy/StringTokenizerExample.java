package ch12.Q11.MoreStudy;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    static void main() {
        String str = "아이디,이름,패스워드";
        StringTokenizer data = new StringTokenizer(str, ",");

        while(data.hasMoreTokens()) {
            System.out.println(data.nextToken());
        }
    }
}
