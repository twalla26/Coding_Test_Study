import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] reservations = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] rowInput = br.readLine().split(" ");

            reservations[i][0] = Integer.parseInt(rowInput[0]);
            reservations[i][1] = Integer.parseInt(rowInput[1]);
        }

        Arrays.sort(reservations, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int start = 0;
        int cnt = 0;
        for (int[] elem : reservations) {
            if (elem[0] >= start) {
                start = elem[1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
