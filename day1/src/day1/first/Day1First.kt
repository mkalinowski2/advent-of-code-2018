package day1.first

import java.io.File

fun main() {
  print(getNumbers("./day1/input/input.txt").sum())
}

fun getNumbers(fileName: String) = File(fileName).readLines().map { it.toInt() }