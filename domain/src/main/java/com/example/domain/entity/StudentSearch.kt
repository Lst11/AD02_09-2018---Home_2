package com.example.domain.entity

data class StudentSearch(val name: String = "",
                         val surname: String = "",
                         val age: Int = 0) : DomainEntity