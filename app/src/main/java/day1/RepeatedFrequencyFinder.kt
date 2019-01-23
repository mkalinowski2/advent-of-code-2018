package day1

import java.util.stream.IntStream
import kotlin.streams.asSequence

class RepeatedFrequencyFinder {

  fun find(numbers: List<Int>): Int {
    val uniqueFrequencies = HashSet<Int>()
    var sum = 0
    return IntStream.iterate(0) { it + 1 }
      .asSequence()
      .map { (it % numbers.size) }
      .map { index -> sum += numbers[index]; sum }
      .dropWhile { uniqueFrequencies.add(sum) }
      .first()
  }
}
