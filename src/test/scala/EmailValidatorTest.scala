
import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    val obj =new EmailValidator()
    assert(obj.isValid("abc@gmail.com")==true)
    assert(obj.isValid("philips123@gmail.com")==true)
    assert(obj.isValid("knoldus@gmail.com")==true)
    assert(obj.existInDb("xyz@gmail.com")==false)
    assert(obj.existInDb("philips123@gmail.com")==true)
    assert(obj.existInDb("knoldus@gmail.com")==true)

  }
}
