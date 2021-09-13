import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.Factorial

class FactorialTest extends AnyFlatSpec {
  "Factorial" should "handle StackOverflowError" in {
    val fact = new Factorial()
    assert(fact.factorial(6) == 720)
    assert(fact.factorial(10) == 3628800)
    assert(fact.factorial(20) == BigInt("2432902008176640000"))
  }
}
