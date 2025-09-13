fun main(args: Array<String>) {

    println("Приветствую")
    println("Сприсок задач:")
    println("Первая задача - 1")
    println("Вторая задача - 2")
    println("Третья задача - 3")
    println("Четвертая задача - 4")
    println("Пятая задача - 5")
    println("Шестая задача - 6")
    println("Введите задачу какую хотите увидеть - ")
val inp = readLine()

    when (inp)
    {
        "0" -> return
        "1" -> teat1()
        "2" -> teat2()
        "3" -> teat3()
        "4" -> teat4()
        "5" -> teat5()
        "6" -> teat6()

        else -> print("Ввести надо цифры...")
    }
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
                count += 1
            } else {
                result += input[i - 1]
                if (count > 1) result += count
                count == 1
            }
        }

        result += input.last()
        if (count > 1) result += count

        println("Результат: $result")
    }

    fun teat2()
    {
        println("Введите строку:")
        val input = readLine() ?: ""
        if (input.isEmpty()) {
            println("Строка пустая")
            return
        }

        val map = mutableMapOf()

        for (ch in input) {
            map[ch] = (map[ch] ?: 0) + 1
        }

        val sorted = map.toSortedMap()

        for ((key, value) in sorted) {
            println("$key - $value")
        }
    }

    fun teat3()
    {
        println("Введите число:")
        val input = readLine()

        try {
            val number = input?.toInt() ?: 0
            println("В двоичной системе: ${number.toString(2)}")
        } catch (e: Exception) {
            println("Ошибка ввода")
        }
    }

    fun teat4()
    {

    }

    fun teat5()
    {

    }

    fun teat6()
    {

    }