package aoc24

import java.io.File

fun day02p1(): Int = readInput().count { isSafe(it) }

fun day02p2(): Int = readInput().count { report -> excludeOne(report).any { isSafe(it) } }

private fun isSafe(report: Iterable<Int>): Boolean {
    val diffs = report.zipWithNext { a, b -> b - a }
    return diffs.all { it in 1..3 } || diffs.all { it in -3..-1 }
}

private fun excludeOne(report: Collection<Int>): Sequence<List<Int>> =
    report.indices.asSequence().map { indexToSkip ->
        report.filterIndexed { i, _ -> i != indexToSkip }
    }

private fun readInput(): Sequence<List<Int>> =
    File("inputs/input02.txt")
        .bufferedReader()
        .lineSequence()
        .map { line -> line.split(" ").map { it.toInt() } }
