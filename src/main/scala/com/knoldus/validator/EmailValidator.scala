package com.knoldus.validator

import java.util.regex.Pattern
import com.knoldus.db.CompanyReadDto

class EmailValidator {
  def isValid(email: String): Boolean = {
    val emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"
    val pat = Pattern.compile(emailRegex)
    if (email == null) return false
    pat.matcher(email).matches
  }

  def existInDb(emailId: String): Boolean = {
    val cmp = new CompanyReadDto()
    for ((key, value) <- cmp.companies) {
      if (value.emailId == emailId)
        return true
    }
    false
  }
}

object Main{
  def main(args:Array[String]):Unit={
    val obj = new EmailValidator()
    println(obj.isValid("pqrsxyz21@gmail.com"))
    println(obj.existInDb("xyzert55@gmail.com"))
  }
}