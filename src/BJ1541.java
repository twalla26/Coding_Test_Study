import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputArray = input.split("-");
        // +는 정규식에서 특정 의미를 가지기 때문에 \\를 덧붙임.

        int result = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                String[] tempArray = inputArray[i].split("\\+");
                for (String s : tempArray) {
                    result += Integer.parseInt(s);
                }
            } else {
                String[] tempArray = inputArray[i].split("\\+");
                for (String s : tempArray) {
                    result -= Integer.parseInt(s);
                }
            }
        }

        System.out.println(result);
    }
}
