package main.kotlin

class Advent {
    fun run(vararg days: Int) {
        days.forEach {
            val path = "src/main/resources/"
            when (it) {
                1 -> AdventDayOne(path + "day1").run()
                2 -> AdventDayTwo(path + "day2").run()
                3 -> AdventDayThree(path + "day3").run()
                4 -> AdventDayFour(172851,675869).run()
                5 -> AdventDayFive(path + "day5").run()
            }
        }

    }
}

fun main(args: Array<String>) {
    Advent().run( 1,2,3,4,5)
}
