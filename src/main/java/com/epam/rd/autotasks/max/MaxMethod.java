package com.epam.rd.autotasks.max;

public class MaxMethod {

  public static int max(int[] values) {
    int max = values[0];
    for (int x = 0; x < values.length; x++) {
      if (max < values[x]) {
        max = values[x];
      }
    }
    System.out.println(max);
    return max;
  }
}


