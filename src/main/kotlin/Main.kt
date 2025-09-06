fun main(args: Array<String>) {

    //Задание 1

    println("Введите буквы в строчку:")
    val testA = readln()
    println()

    for (i in testA) {
        print(i)
    }




    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}