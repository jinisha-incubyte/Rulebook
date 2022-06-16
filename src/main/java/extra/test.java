package extra;

import java.util.HashMap;

public class test {

  public static void main(String[] args) {
    int[] intArray = new int[] {-1,-3};
    System.out.println(  solution(intArray));

  }

  public static int solution(int[] A) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      countMap.computeIfAbsent(A[i], k -> 1);
    }
int i=0;
    for ( i = 1; i < Integer.MAX_VALUE; i++) {

      if (!countMap.containsKey(i)) {
        break;
      }
      // write your code in Java SE 8
      //return i;
    }
    return  i;
  }
}
