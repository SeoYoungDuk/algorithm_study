fun solution3(number: IntArray): Int {
    val answer = mutableListOf<List<Int>>()
    var result = 0
    combination(answer, number, BooleanArray(number.size) { false }, 0, 3)
    answer.forEach {println(it)}
    answer.forEach {
        if (it.sum() == 0) {
            result += 1
        }
    }
    return result
}

fun combination(answer: MutableList<List<Int>>, origin: IntArray, visitedArr: BooleanArray, start: Int, target: Int) {
    if (target == 0) {
        answer.addAll(listOf(origin.filterIndexed { index, _ -> visitedArr[index] }))
    } else {
        for (i in start until origin.size) {
            visitedArr[i] = true
            combination(answer, origin, visitedArr, i + 1, target - 1)
            visitedArr[i] = false
        }
    }
}


fun main(args: Array<String>) {
    println(solution3(intArrayOf(-2, 3, 0, 2, -5)))
}