package data_practice;

import java.util.Scanner;

public class greed {

   public static void main(String[] args) {
      
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int result = 0;
      int target;
      while(true) {
         target = (n / k) *k;
         result += (n - target);
         n = target;
         
         if(n < k)
            break;
         
         n /= k;
         result++;
         }
      
      result += (n-1);
      System.out.println(result);
   }

}