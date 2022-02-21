class Calculator {

    public fun menu() {
        println("Digite + {Soma}")
        println("Digite - {Subtração}")
        println("Digite * {Multplicação}")
        println("Digite / {Divisão}")
        println("Digite % {Resto}")
    }

    public fun operation(opera: String, num1: Int, num2: Int): String {

        // Identifica operador
        if (opera.compareTo("+", true) == 0) {
            return soma(num1, num2)// chama calculo com retorno em texto
        } else if (opera.compareTo("-", true) == 0) {
            return subtract(num1, num2)// chama calculo com retorno em texto
        } else if (opera.compareTo("*", true) == 0) {
            return multiplication(num1, num2)// chama calculo com retorno em texto
        } else if (opera.compareTo("/", true) == 0) {
            return divisor(num1, num2)// chama calculo com retorno em texto
        } else if (opera.compareTo("%", true) == 0) {
            return rests(num1, num2)// chama calculo com retorno em texto
        } else {
            return "nao foi possivel identificar a operaçao" // msg de erro
        }
    }

    private fun soma(num1: Int, num2: Int): String {
        var result = num1 + num2
        return "$num1 + $num2 = $result"
    }

    private fun subtract(num1: Int, num2: Int): String {
        var result = num1 - num2
        return "$num1 - $num2 = $result"
    }

    private fun multiplication(num1: Int, num2: Int): String {
        var result = num1 * num2
        return "$num1 * $num2 = $result"
    }

    private fun divisor(num1: Int, num2: Int): String {
        var result = num1 / num2
        return "$num1 / $num2 = $result"
    }

    private fun rests(num1: Int, num2: Int): String {
        var result = num1 % num2
        return "$num1 % $num2 = $result"
    }


}