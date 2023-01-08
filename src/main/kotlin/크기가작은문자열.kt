fun solution8(t: String, p: String): Int {
    var answer: Int = 0
    for(i in 0 .. t.length - p.length) {
        var s = t.substring(i, i + p.length)
        if(p.toLong() >= s.toLong()) {
            answer += 1
        }
    }

    return answer
}

fun main(args: Array<String>) {
    println(solution8("10203", "15"))
}