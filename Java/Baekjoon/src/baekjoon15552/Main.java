package baekjoon15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int t = Integer.parseInt(br.readLine());
      int[] sumArr = new int[t];

      for (int i = 0; i < t; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         sumArr[i] = a + b;
      }

      for (int sum : sumArr) {
         bw.write(String.valueOf(sum));
         bw.newLine();
      }

      bw.flush();

   }
   
}