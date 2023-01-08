fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var n = n

    for (i in flowerbed.indices) {
        if(flowerbed[i] == 0) {
            var left = (i == 0) || flowerbed[i - 1] == 0
            var right = (i == flowerbed.size - 1) || flowerbed[i + 1] == 0

            if (left && right) {
                flowerbed[i] = 1
                n--
            }
        }

    }

    return n <= 0
}

fun main(args: Array<String>) {
    println(canPlaceFlowers(intArrayOf(0, 0, 1, 0, 1), 2))
}
