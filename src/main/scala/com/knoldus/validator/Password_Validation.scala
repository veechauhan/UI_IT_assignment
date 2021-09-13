package com.knoldus.validator

class Password_Validation{
  def isValid(password :String) :Boolean = {
    if((password.length >= 8) && (password.length <= 15))
      return true
    if(password.contains(" "))
      return false
    if(true) {
      var found = 0
      for (num <- 0 to 9) {
        val str1 = Integer.toString(num)
        if (password.contains(str1)) found = 1
      }
      if(found == 0)
        return false
    }
    if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?") || password.contains("|"))) return false
    if(true)
    {
      var found = 0
      for (num <- 65 to 90) {
        val c = num.toChar
        val str1 = Character.toString(c)
        if (password.contains(str1)) found = 1
      }
      if (found == 0) return false
    }
    if(true) {
      var found = 0
      for (num <- 90 to 122) {
        val c = num.toChar
        val str1 = Character.toString(c)
        if (password.contains(str1)) found = 1
      }
      if (found == 0)
        return false
    }
    true
  }
}
