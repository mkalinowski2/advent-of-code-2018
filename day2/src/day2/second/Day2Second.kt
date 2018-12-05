package day2.second

import java.io.File

fun main() {
  val ids = getIds("./day2/input/input.txt")

  ids.mapNotNull { id ->
    id.toList().let { _ ->
      ids.filter { it != id }
        .map { Pair(it, id) }
        .groupBy {
          it.first.toList()
            .asSequence()
            .filterIndexed { index, value -> value != it.second[index] }
            .toList()
            .size
        }
        .filter { it.key == 1 }
        .map { it.value.first() }
        .firstOrNull()
    }
  }
    .map { it.first.filterIndexed { index, value -> value == it.second[index] } }
    .distinct()
    .onEach { println(it) }
}

fun getIds(fileName: String) = File(fileName).readLines()