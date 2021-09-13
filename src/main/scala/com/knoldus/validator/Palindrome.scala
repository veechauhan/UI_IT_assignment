package com.knoldus.validator

class Palindrome {
  def is_palindrome(n: Int): Boolean ={
    var n = 0
    val temp = n
    var rev = 0
    while(n>0){
      val dig = n % 10
      rev = rev*10+dig
      n = n//10
    }
    if(temp == rev)
      true
    else
      false
  }
}
