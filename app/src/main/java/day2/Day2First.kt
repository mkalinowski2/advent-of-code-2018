package day2

import java.io.File

fun main() {
  val ids = Input().getIds()

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