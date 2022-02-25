import java.util.Scanner

fun main() {

    val calc = Calculator() // Instancia Calculadora
    var arr = IntArray(2) // Inicia array com 2 slots

    do {
        for (i in 0..1) {
            println("Digite o ${i + 1}° numero: ")
            arr[i] = readLine()!!.toInt()
        }

        calc.menu() // Chama menu
        var opera = readLine()!!

        println(calc.operation(opera, arr[0], arr[1]))

        println("deseja calcular novamente? [S/s] ou [N/n]")
        var yesOrNot = readLine()!!

    } while (yesOrNot.compareTo("s", true) == 0) // repetiçao do programa


}
