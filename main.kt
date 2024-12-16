fun main() {
    val blue = "\u001B[34m"
    val reset = "\u001B[0m"
    val green = "\u001B[32m"
    val red = "\u001B[31m"

    do {
        println("============ Calculadora de Area de Figuras ============")
        println("${reset}1.${blue} Triangulo")
        println("${reset}2.${blue} Circulo")
        println("${reset}3.${blue} Cuadrado")
        println("${reset}0.${blue} Salir")
        print("${green}Opcion: ${reset}")
        val option = readLine()!!.toInt()
        when (option) {
            0 -> {
                break
            }
            1 -> {
                print("${blue}Ingrese la base: ")
                val base = readLine()!!.toDouble()
                print("${blue}Ingrese la altura: ")
                val height = readLine()!!.toDouble()
                println("${green}El area del triangulo es ${reset} ${triangleArea(base, height)}")
            }
            2 -> {
                print("${blue}Ingrese el radio:")
                val radius = readLine()!!.toDouble()
                println("${green}El area del circulo es ${reset} ${circleArea(radius)}")
            }
            3 -> {
                print("${blue}Ingrese el lado:")
                val side = readLine()!!.toDouble()
                println("${green}El area del cuadrado es ${reset} ${squareArea(side)}")
            }
            else -> {
                println("${red}Opcion invalida")
            }
        }
    } while (true)
}

fun triangleArea(base: Double, height: Double): Double {
    return 0.5 * base * height
}

fun circleArea(radius: Double): Double {
    return Math.PI * radius * radius
}

fun squareArea(side: Double): Double {
    return side * side
}
