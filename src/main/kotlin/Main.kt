fun main(args: Array<String>) {

    println("Приветствую")
    println("Введите задачу какую хотите увидеть:")
val inp = readLine()

    when (inp)
    {
        "0" -> return
        "1" -> teat1()
        "2" -> teat2()



        else -> print("Че ты ввел(а)?")
    }

    fun teat1()
    {
        //Задание 1

        println("Введите строку:")
        val input = readLine() ?: ""
        if (input.isEmpty()) {
            println("Строка пустая")
            return
        }

        var result = ""
        var count = 1

        for (i in 1 until input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                result += input[i - 1]
                if (count > 1) result += count
                count = 1
            }
        }

        result += input.last()
        if (count > 1) result += count

        println("Результат: $result")
    }

    fun teat2()
    {

    }

}