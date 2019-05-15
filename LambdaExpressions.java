/**
Input Format
Input is handled for you by the locked stub code in your editor.
Output Format
The locked stub code in your editor will print T lines of output.

Sample Input
5
1 4
2 5
3 898
1 3
2 12

Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
**/




import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class Math {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

// Write your code here
   PerformOperation isOdd() {
        return num -> {
            if (num % 2 == 0)
                return false;
            else
                return true;
        };
    }

    PerformOperation isPrime() {
        return num -> {
            for (int k = 2; k <= num / 2; k++) {
                if (num % k == 0) {
                    return false;
                }
            }
            return true;
        };

    }

  PerformOperation isPalindrome() {
        return (int num) ->
            (num == Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())) ? true : false;

    }
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}

