package day1

import org.amshove.kluent.shouldEqual
import org.junit.Test

class NumbersSumTest {

  @Test
  fun addPositiveNumbers() {
    NumbersSum(listOf(1, 2, 3)).sum shouldEqual 6
  }

  @Test
  fun addPositiveAndNegativeNumbers() {
    NumbersSum(listOf(-10, 2, 3)).sum shouldEqual -5
  }
}
