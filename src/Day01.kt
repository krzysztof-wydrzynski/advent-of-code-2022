fun main() {

    fun sumValuesSeparatedByEnter(input: List<String>): List<Int> =
        input.fold(mutableListOf(0)) { resultList, next ->
            if (next == "\n" || next.isBlank()) {
                resultList.add(0)
                resultList
            } else {
                val last: Int = resultList.removeLast()
                resultList.add(last + Integer.valueOf(next))
                resultList
            }
        }


    fun part1(input: List<String>) = sumValuesSeparatedByEnter(input).max()

    fun part2(input: List<String>) = sumValuesSeparatedByEnter(input).sortedDescending().subList(0, 3).sum()

    val testInput = readInput("day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("day01_input")
    println(part1(input))
    println(part2(input))
}
