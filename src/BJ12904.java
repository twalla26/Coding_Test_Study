import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        int lastIndex = T.length() - 1;
        int numOfRepeatation = T.length() - S.length();
        for (int i = 0; i < numOfRepeatation; i++) {
            if (T.charAt(lastIndex) == 'A') {
                T = T.substring(0, lastIndex);
            } else {
                T = T.substring(0, lastIndex);
                StringBuffer sb = new StringBuffer(T);
                T = sb.reverse().toString();
            }
            lastIndex -= 1;
            System.out.println(T);
        }

        if (T.equals(S)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
