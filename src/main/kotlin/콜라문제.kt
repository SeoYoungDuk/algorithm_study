fun solution_콜라(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var totalEmptyBottle = n

    while(totalEmptyBottle >= a) {
        var returnedBottle = (totalEmptyBottle / a) * b
        answer += returnedBottle
        var remainEmptyBottle = totalEmptyBottle - returnedBottle % a

        totalEmptyBottle = returnedBottle + remainEmptyBottle
    }
    return answer
}

fun main(args: Array<String>) {
    println(solution_콜라(2, 1, 20))
}