import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfGates = Integer.parseInt(br.readLine());
        int numOfPlanes = Integer.parseInt(br.readLine());

        int[] planeList = new int[numOfPlanes];
        int[] gateList = new int[numOfGates];
        for (int i = 0; i < numOfPlanes; i++) {
            planeList[i] = (Integer.parseInt(br.readLine()));
        }

        int planeNum = 1;
        int numOfDocked = 0;
        boolean isDocked = true;
        for (int i = 0; i < numOfPlanes; i++) {
            int cnt = 0;
            if (!isDocked) {
                break;
            }
            for (int j = 0; j < (planeList[i]); j++) {
                int targetIdx = planeList[i] - 1 - cnt;
                isDocked = false;
                if (gateList[targetIdx] == 0) {
                    gateList[targetIdx] = planeNum;
                    isDocked = true;
                    numOfDocked += 1;
                    break;
                }
                cnt += 1;
                if ((j == planeList[i] - 1) && (!isDocked)) {
                    break;
                }
            }
            planeNum += 1;
        }
        System.out.println(numOfDocked);
    }
}
