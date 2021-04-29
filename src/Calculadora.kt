import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) : BigDecimal
{
    when(operador)
    {
        "+" -> return primeiroNumero + segundoNumero
        "-" -> return primeiroNumero - segundoNumero
        "*" -> return primeiroNumero * segundoNumero
        "/" -> return primeiroNumero / segundoNumero
        "%" -> return primeiroNumero % segundoNumero
        else -> return BigDecimal.ZERO
    }
}

fun main() {
    print("Digite um número válido: ")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if(primeiroNumero == null)
    {
        println("Primeiro número informado não é válido")
        return
    }

    println("Digite um operador válido (+,-,*,/,%):")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != "+" && operador != "-" && operador != "*" && operador != "/" && operador != "%"))
    {
        println("Operador inválido!!!")
        return
    }

    print("Digite o segundo número válido:")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if(segundoNumero == null)
    {
        println("Segundo número informado não é válido")
        return
    }

    val resultado = calculaOperacao(primeiroNumero, operador, segundoNumero)
    println("O resultado da sua operação foi: $resultado")
}