import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int findE = 1;
        int findS = 1;
        int findM = 1;
        int year = 1;

        // 브루트 포스
        // 입력된 ESM 값이 나올 때까지 각 ESM 값을을 1에서부터 1씩 늘려가고
        // 그렇게 구한 year 값을 출력
        while (true) {
            if (findE == E && findS == S && findM == M) break;
            findE += 1;
            if (findE == 16) findE = 1;
            findS += 1;
            if (findS == 29) findS = 1;
            findM += 1;
            if (findM == 20) findM = 1;
            year+=1;
        }
        System.out.println(year);
    }
}
