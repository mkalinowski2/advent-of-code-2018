package day1.second

import java.io.File
import java.util.stream.IntStream
import kotlin.streams.asSequence

fun main() {
  val numbers = getNumbers("./day1/input/input.txt")
  print(findRepeatedFrequency(numbers))
}

fun findRepeatedFrequency(numbers: List<Int>): Int {
  val uniqueFrequencies = HashSet<Int>()
  var sum = 0
  return IntStream.iterate(0) { it + 1 }
    .asSequence()
    .map { (it % numbers.size) }
    .map { index -> sum += numbers[index]; sum }
    .dropWhile { uniqueFrequencies.add(sum) }
    .first()
}

fun getNumbers(fileName: String) = File(fileName).readLines().map { it.toInt() }