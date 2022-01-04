package com.example.junit_kotlin

object TestingDemo {

    private val existingUsers = listOf<String>("peter", "carl")

    /**
     * the input is not valid if
     * ...username/password is empty
     * ...username is already taken
     * ...passwords do  not match
     * ...password contains less than 2 chars
     */
    fun validator(
        name: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (name.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
           return false
        } else if(name in existingUsers){
            return false
        }else if(password.count{it.isDigit()}<2){
            return false
        }
        else if (password != confirmPassword) {
          return false
        }
       return true
    }


}