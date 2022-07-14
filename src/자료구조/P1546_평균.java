package 자료구조;

import java.util.Scanner;

public class P1546_평균 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<A.length; i++) {
            if(max<A[i]) {
                max = A[i];
            }
            sum = sum + A[i];
        }
        System.out.print(sum*100.0/max/N);
    }
}
