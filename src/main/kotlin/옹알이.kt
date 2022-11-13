fun main(args: Array<String>) {
    val babbling = arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
    println(solution(babbling))
}

fun solution (babbling: Array<String>): Int {
    val list = arrayOf("aya", "ye", "woo", "ma")
    for (i in babbling.indices) {
        babbling[i] = babbling[i].replace(list[0], "|")
            .replace(list[1], "|")
            .replace(list[2], "|")
            .replace(list[3], "|")
    }
    return babbling.map { it.replace("|", "") }.count { it == "" }
}