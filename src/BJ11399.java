import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int[] Pi = new int[N];
        int i = 0;
        for(String elem : input.split(" ")) {
            Pi[i] = Integer.parseInt(elem);
            i++;
        }

        Arrays.sort(Pi);
        int result = 0;
        int time = 0;
        for (int j = 0; j < N; j++) {
            time += Pi[j];
            result += time;
        }

        System.out.println(result);
    }
}
