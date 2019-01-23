package day2

fun main() {
  val ids = Input().getIds()

  ids.mapIndexedNotNull { index, id ->
    ids.subList(index + 1, ids.size)
      .map { Pair(it, id) }
      .groupBy { it.first.filterIndexed { index, value -> value != it.second[index] }.count() }
      .filter { it.key == 1 }
      .map { it.value.first() }
      .firstOrNull()
  }
    .map { it.first.filterIndexed { index, value -> value == it.second[index] } }
    .onEach { println(it) }
}
