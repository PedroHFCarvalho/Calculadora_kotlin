import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`) //Instancia Scanner
    val calc = Calculator() // Instancia Calculadora
    var arr = IntArray(2) // Inicia array com 2 slots

    do {
        for (i in 0..1) {
            println("Digite o ${i + 1}° numero: ")
            arr[i] = read.nextInt()
        }

        calc.menu() // Chama menu
        var opera = read.next()
        println(calc.operation(opera, arr[0], arr[1]))

        println("deseja calcular novamente? [S/s] ou [N/n]")
        var yesOrNot = readLine()

    } while (yesOrNot == "s" || yesOrNot == "S") // repetiçao do programa
}