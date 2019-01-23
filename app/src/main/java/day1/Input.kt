package day1

import java.io.File

class Input(private val filePath: String) {

  fun getNumbers() = File(filePath).readLines().map { it.toInt() }
}
