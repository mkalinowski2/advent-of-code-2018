package day1

private const val inputFilePath = "app/input/day1_input.txt"

fun main() {
  val inputNumbers = Input(inputFilePath).getNumbers()
  day1Task1(inputNumbers)
  day1Task2(inputNumbers)
}

private fun day1Task1(numbers: List<Int>) {
  val sumOfNumbers = NumbersSum(numbers).sum
  println("Day 1 - task 1 - Sum of numbers equals $sumOfNumbers")
}

private fun day1Task2(numbers: List<Int>) {
  val repeatedFrequency = RepeatedFrequencyFinder().find(numbers)
  println("Day 1 - task 2 - Repeated frequency equals $repeatedFrequency")
}

