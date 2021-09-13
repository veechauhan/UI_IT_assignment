import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.Password_Validation

class Password_ValidationTest extends AnyFlatSpec{
  "Password_Validation" should "validate" in{
    val obj = new Password_Validation()
    assert(obj.isValid("Knoldus432")==false)
    assert(obj.isValid("Knoldus@321")==true)
  }
}
