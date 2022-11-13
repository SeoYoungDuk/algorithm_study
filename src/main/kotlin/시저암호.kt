fun main(args: Array<String>) {

    println('a')
    println('a' + 2);


    println(solution2("a B z", 4))
}

fun solution2(s: String, n: Int): String {
    return s.toCharArray().map {
        when {
            it == ' ' -> it
            it in 'a'..'z' && it + n > 'z' -> 'a' + ((it + n) - 'z') - 1
            it in 'A'..'Z' && it + n > 'Z' -> 'A' + ((it + n) - 'Z') - 1
            else -> {
                it + n
            }
        }
    }.joinToString("")
}