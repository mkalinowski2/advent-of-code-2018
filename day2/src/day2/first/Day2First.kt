package day2.first

import java.io.File
import kotlin.streams.asSequence

fun main() {
  val ids = getIds("./day2/input/input.txt")

  var twiceOccurrencesNumber = 0
  var thirdOccurrencesNumber = 0

  ids.forEach { id ->
    id.chars().asSequence().groupBy { it }
      .map { it.value.size }
      .distinct()
      .let { distinctCharsOccurrences ->
        if (distinctCharsOccurrences.any { it == 2 }) {
          twiceOccurrencesNumber++
        }
        if (distinctCharsOccurrences.any { it == 3 }) {
          thirdOccurrencesNumber++
        }
      }
  }

  println(twiceOccurrencesNumber * thirdOccurrencesNumber)
}

fun getIds(fileName: String) = File(fileName).readLines()