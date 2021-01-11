package 백준.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int waitTime = 0,n = Integer.parseInt(br.readLine()),i=0,sum=0;
        int[] outputTime = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(i=0;i<n;i++)
            outputTime[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(outputTime);

        for(i=0;i<n;i++){
            waitTime += outputTime[i];
            sum += waitTime;
        }
        System.out.println(sum);
    }
}
