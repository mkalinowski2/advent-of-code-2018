package second

import java.io.File

fun main() {
  val numbers = getNumbers("./day1/input/input.txt")
  print(findReapetedFrequency(numbers))
}

fun findReapetedFrequency(numbers: List<Int>): Int {
  val uniqueFrequencies = HashSet<Int>()
  var sum = 0
  while (true) {
    numbers.forEach { number ->
      sum += number
      uniqueFrequencies.find { it == sum }?.let {
        return it
      } ?: uniqueFrequencies.add(sum)
    }
  }
}

fun getNumbers(fileName: String) = File(fileName).readLines().map { it.toInt() }