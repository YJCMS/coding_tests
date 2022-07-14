package 자료구조;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String snum = sc.next();
        char[] cnum = snum.toCharArray();
        int sum = 0;

        // for(int i=0; i<N; i++) 변수 N을 사용하려면 이렇게 가능한가?
        for(int i=0; i<cnum.length; i++) {
            sum += cnum[i]-'0';
        }
        System.out.print(sum);
    }
}
