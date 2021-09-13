import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.Palindrome

class PalindromeTest extends AnyFlatSpec {
  "Palindrome" should "valid" in {
    val palindrome= new Palindrome()
    assert(palindrome.is_palindrome(75257) == true)
    assert(palindrome.is_palindrome(1211) == false)
    assert(palindrome.is_palindrome(121) == true)
  }

}
