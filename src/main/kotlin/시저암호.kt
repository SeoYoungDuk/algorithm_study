fun main(args: Array<String>) {

    println('a')
    println('a' + 2);


    println(solution2("AB", 1))
}

fun solution2(s: String, n: Int): String {
    var result = "";

    for (i in s.indices) {
        var ascii = s[i]

        if (' ' == ascii) {
            result += " "
            continue;
        }

        ascii += n * 1

        result += if (ascii > 'z') {
            var def = ascii - 'z'
            ('a' - 1) + def
        } else if (ascii in 'Z' until 'a') {
            var def = ascii - 'Z'
            'A' + def
        } else {
            ascii
        }
    }

    return result
}