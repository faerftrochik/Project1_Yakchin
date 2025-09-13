fun main(args: Array<String>) {

val input = readLine()

    when(input)
    {
        "0" -> return
        "1" -> teat1()
        "2" -> teat2()



        else -> print("Че ты ввел(а)?")
    }

    fun teat1()
    {
        //Задание 1

        val k = 0;
        println("Введите буквы в строчку:")
        val testA = readln()
        println()


        for (i in testA) {
            if (testA == testA)
            {k + 1}
            print(i)
            print(k)
        }
        println("Program arguments: ${args.joinToString()}")
    }

    fun teat2()
    {

    }

}