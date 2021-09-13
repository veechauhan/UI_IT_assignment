package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val cmp= new CompanyReadDto()
    for((key,value)<-cmp.companies){
      if( key == company.name )
        return true
    }
    false
  }
}
