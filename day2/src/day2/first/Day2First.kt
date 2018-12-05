package day2.first

import java.io.File

fun main() {
  val ids = getIds("./day2/input/input.txt")

  var twiceOccurrencesNumber = 0
  var thirdOccurrencesNumber = 0

  ids.forEach { id ->
    id.toList().groupBy { it }
      .map { it.value.size }
      .let { charsOccurrences ->
        if (charsOccurrences.any { it == 2 }) {
          twiceOccurrencesNumber++
        }
        if (charsOccurrences.any { it == 3 }) {
          thirdOccurrencesNumber++
        }
      }
  }

  println(twiceOccurrencesNumber * thirdOccurrencesNumber)
}

fun getIds(fileName: String) = File(fileName).readLines()