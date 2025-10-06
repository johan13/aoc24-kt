package aoc24

import java.io.File
import kotlin.math.abs

fun day01p1(): Int {
    val (left, right) = readInput()
    return left
        .sorted()
        .zip(right.sorted())
        .sumOf { (l, r) -> abs(l - r) }
}

fun day01p2(): Int {
    val (left, right) = readInput()
    val countMap = right.groupingBy { it }.eachCount()
    return left.sumOf { it * (countMap[it] ?: 0) }
}

private val WHITESPACE = Regex("\\s+")

private fun readInput(): Pair<List<Int>, List<Int>> =
    File("inputs/input01.txt")
        .readLines()
        .map { it.split(WHITESPACE).let { (l, r) -> l.toInt() to r.toInt() } }
        .unzip()
