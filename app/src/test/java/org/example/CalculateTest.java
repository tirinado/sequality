package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    assertEquals(2.5, calc.average(2, 3), 0.01);
  }

  @Test
  public void testSumBetween() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumBetween(1, 10));
  }

  @Test
  public void testSumOdd() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEven(1, 10));
  }
}
