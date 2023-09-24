import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String distanceInput = br.readLine();
        String priceInput = br.readLine();

        int[] distance = new int[N-1];
        int[] price = new int[N];

        int i = 0, j = 0;
        for (String elem : distanceInput.split(" ")) {
            distance[i] = Integer.parseInt(elem);
            i++;
        }
        for (String elem : priceInput.split(" ")) {
            price[j] = Integer.parseInt(elem);
            j++;
        }

        long result = (long) price[0] * distance[0];
        int currentPrice = price[0];
        for (int k = 1; k < N-1; k++) {
            if (currentPrice > price[k]) {
                currentPrice = price[k];
            }
            result += (long) currentPrice * distance[k];
        }
        System.out.println(result);
    }
}
