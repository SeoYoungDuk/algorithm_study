fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var n = n

    if (flowerbed.size == 1 && flowerbed[0] == 0) {
        n--
    }

    if (flowerbed.size > 1 && flowerbed[0] == 0 && flowerbed[1] == 0) {
        flowerbed[0] = 1
        n--
    }

    for (i in 0 until flowerbed.size - 1) {
        if (i > 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
            flowerbed[i] = 1
            n--
        }
    }

    if (flowerbed.size > 2 && flowerbed[flowerbed.size - 2] == 0 && flowerbed[flowerbed.size - 1] == 0) {
        n--
    }

    return n <= 0
}

fun main(args: Array<String>) {
    println(canPlaceFlowers(intArrayOf(0, 0, 1, 0, 1), 2))
}
