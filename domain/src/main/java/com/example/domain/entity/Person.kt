package com.example.domain.entity

data class Person(val url: String,
                  val name: String,
                  val surname: String,
                  val isMan: Boolean) : DomainEntity