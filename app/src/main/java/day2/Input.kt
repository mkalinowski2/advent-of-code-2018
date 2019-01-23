package day2

import java.io.File

class Input(private val filePath: String = "app/input/day2_input.txt") {

  fun getIds() = File(filePath).readLines()
}