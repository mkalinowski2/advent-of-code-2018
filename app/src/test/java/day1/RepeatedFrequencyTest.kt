package day1

import org.amshove.kluent.shouldEqual
import org.junit.Test

class RepeatedFrequencyFinderTest {

  @Test
  fun `repeated frequency of (15, -15) should equal 15`() {
    RepeatedFrequencyFinder().find(listOf(15, -15)) shouldEqual 15
  }

  @Test
  fun `repeated frequency of (-15, 15) should equal -15`() {
    RepeatedFrequencyFinder().find(listOf(-15, 15)) shouldEqual -15
  }

  @Test
  fun `repeated frequency of (1, 2, -5) should equal 1`() {
    RepeatedFrequencyFinder().find(listOf(1, 2, -5)) shouldEqual 1
  }

  @Test
  fun `repeated frequency of (-1, -1, -4, 10) should equal -2`() {
    RepeatedFrequencyFinder().find(listOf(-1, -1, -4, 10)) shouldEqual -2
  }
}
