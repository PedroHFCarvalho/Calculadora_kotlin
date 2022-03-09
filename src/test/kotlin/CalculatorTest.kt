import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.*


internal class CalculatorTest {

    val calc = Calculator()

    @Test
    fun operation() {

        assertEquals("5 + 5 = 10", calc.operation("+", 5, 5))
        assertEquals("5 - 5 = 0", calc.operation("-", 5, 5))
        assertEquals("5 * 5 = 25", calc.operation("*", 5, 5))
        assertEquals("5 / 5 = 1", calc.operation("/", 5, 5))
        assertEquals("5 % 5 = 0", calc.operation("%", 5, 5))
        assertEquals("5 ** 5 = 3125.0", calc.operation("**", 5, 5))

    }

    @Test
    fun somaTest() {
        assertEquals("5 + 5 = 10", calc.soma(5, 5))
    }

    @Test
    fun subtract() {
        assertEquals("5 - 5 = 0", calc.subtract(5, 5))
    }

    @Test
    fun multiplication() {
        assertEquals("5 * 5 = 25", calc.multiplication(5, 5))
    }

    @Test
    fun divisor() {
        assertEquals("5 / 5 = 1", calc.divisor(5, 5))
    }

    @Test
    fun rests() {
        assertEquals("5 % 5 = 0", calc.rests(5, 5))
    }

    @Test
    fun potencia() {
        assertEquals("5 ** 5 = 3125.0", calc.potencia(5, 5))
    }
}