import kotlin.math.pow

class Calculator {

    public fun menu() {
        println("Digite + {Soma}")
        println("Digite - {Subtração}")
        println("Digite * {Multplicação}")
        println("Digite / {Divisão}")
        println("Digite % {Resto}")
        println("Digite ** {Potencia}")
    }

    public fun operation(opera: String, num1: Int, num2: Int): String {

        return when (opera) {
            "+" -> soma(num1, num2)// chama calculo com retorno em texto
            "-" -> subtract(num1, num2)// chama calculo com retorno em texto
            "*" -> multiplication(num1, num2)// chama calculo com retorno em texto
            "/" -> divisor(num1, num2)// chama calculo com retorno em texto
            "%" -> rests(num1, num2)// chama calculo com retorno em texto
            "**" -> potencia(num1, num2)// chama calculo com retorno em texto
            else -> "nao foi possivel identificar a operaçao" // msg de erro
        }

    }

    fun soma(num1: Int, num2: Int): String {
        var result = num1 + num2
        return "$num1 + $num2 = $result"
    }

    fun subtract(num1: Int, num2: Int): String {
        var result = num1 - num2
        return "$num1 - $num2 = $result"
    }

    fun multiplication(num1: Int, num2: Int): String {
        var result = num1 * num2
        return "$num1 * $num2 = $result"
    }

    fun divisor(num1: Int, num2: Int): String {
        var result = num1 / num2
        return "$num1 / $num2 = $result"
    }

    fun rests(num1: Int, num2: Int): String {
        var result = num1 % num2
        return "$num1 % $num2 = $result"
    }

    fun potencia(num1: Int, num2: Int): String {
        var result = num1.toDouble().pow(num2.toDouble())
        return "$num1 ** $num2 = $result"
    }


}