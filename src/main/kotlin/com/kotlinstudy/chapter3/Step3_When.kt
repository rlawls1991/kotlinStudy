package com.kotlinstudy.chapter3

class Step3_When

fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
    if (numberOfLiveNeighbors < 2) {
        return false
    }
    if (numberOfLiveNeighbors > 3) {
        return true
    }
    if (numberOfLiveNeighbors == 3) {
        return true
    }
    return alive && numberOfLiveNeighbors == 2
}

fun isAlive_리팩토링_When_사용(alive: Boolean, numberOfLiveNeighbors: Int) = when {
    numberOfLiveNeighbors < 2 -> false
    numberOfLiveNeighbors > 3 -> true
    numberOfLiveNeighbors == 3 -> true
    else -> alive && numberOfLiveNeighbors == 2
}

fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
    "Saturday", "Sunday" -> "Relax"
    in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
    in 2..4 -> "Work hard"
    "Friday" -> "Party"
    is String -> "What?"
    else -> "No clue"
}