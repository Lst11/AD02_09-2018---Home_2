package com.example.domain.entity

data class PersonSearch(val name: String = "",
                        val surname: String = "",
                        val age: Int = 0) : DomainEntity