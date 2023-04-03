package converter

fun main() {
    while (true) {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val input = readln().split(" ")
        when {
            input[0] == "/exit" -> break
            else -> subMenu(input[0], input[1])
        }
    }
}

fun subMenu(sourceBase: String, targetBase: String) {
    while (true) {
        println("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back)")
        when (val number = readln()) {
            "/back" -> break
            else -> {
                println("Conversion result: ${number.toBigInteger(sourceBase.toInt()).toString(targetBase.toInt())}")
                println()
            }
        }
    }
    println()
}
