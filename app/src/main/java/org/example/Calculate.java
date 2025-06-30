package org.example;

public class Calculate {

  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sumBetween(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOdd(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0)
        sum += i;
    }
    return sum;
  }

  public int sumEven(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0)
        sum += i;
    }
    return sum;
  }
}
