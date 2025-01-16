import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        
      int P , T;
      float R;

      P = sc.nextInt();
      T = sc.nextInt();
      R = sc.nextFloat();

      float interest = (P*T*R)/100;

      System.out.println("Simple interest = " +interest);


    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
