class FreeCalculator {
    private var first: Int = 0
    private var second: Int = 0

    fun isFree(third: Int): Boolean {
        val minimumCost = (this.first + this.second) / 2
        return minimumCost >= third
    }

    fun isCalculate(): Boolean {
        return first !== 0 && second !== 0
    }

    fun clear() {
        this.first = 0
        this.second = 0
    }

    fun add(value: Int) {
        if (first == 0) {
            this.first = value
        } else {
            this.second = value
        }
    }
}

fun solution8(cost: IntArray): Int {
    val freeCalculator = FreeCalculator()
    var sum = 0
    cost.sortedDescending().forEach {
        if(!freeCalculator.isCalculate()) {
            freeCalculator.add(it)
            sum += it
        } else {
            if(!freeCalculator.isFree(it)) {
                sum += it
            }
            freeCalculator.clear()
        }
    }
    return sum
}


fun main(args: Array<String>) {
    println(solution8(intArrayOf(1, 1, 1)))
}