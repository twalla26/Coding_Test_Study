import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시스템 input 장치(키보드)로 들어오는 것을 inputstreamreader가 읽어서 버퍼리더에 배열로 저장함.
        // int num = br.read(); // 한 글자를 읽어서 int형 반환(아스키)
//        String str = br.readLine();
//        int intFromStr = Integer.parseInt(str);
        // 백준 입력 ex) 10 4
//        String input = br.readLine();
//        int[] a = new int[2];
//
//        int i = 0;
//        for(String elem : input.split(" ")) {
//            a[i] = Integer.parseInt(elem);
//            i++;
//        }
//
//        System.out.println(Arrays.toString(a));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] coins = new int[N]; // 동적할당
        for (int i = N-1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int coin : coins){
            cnt += K / coin;
            K %= coin;
        }
        System.out.println(cnt);




    }

}
