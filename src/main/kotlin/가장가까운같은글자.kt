fun solution7(s: String): IntArray{
    var answer: IntArray = intArrayOf()
    val map = HashMap<Char, Int>()

    s.toCharArray().forEachIndexed {
        index, item ->
        if(!map.contains(item)) {
            map[item] = index
            answer += -1
        } else {
            answer += index - map[item]!!
            map[item] = index
        }
    }
    return answer
}


fun main(args: Array<String>) {
    solution7("banana")
}