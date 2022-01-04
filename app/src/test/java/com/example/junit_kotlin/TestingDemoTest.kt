package com.example.junit_kotlin


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestingDemoTest{

    @Test
    fun `empty user name returns false`(){

        val result=TestingDemo.validator(
            "",
        "123",
        "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly typed passwords`(){

        val result=TestingDemo.validator(
            "asd",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `username already taken`(){

        val result=TestingDemo.validator(
            "peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password`(){

        val result=TestingDemo.validator(
            "asd",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password repeated incorrectly`(){

        val result=TestingDemo.validator(
            "peter",
            "123",
            "134"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password contains less than 2 chars`(){

        val result=TestingDemo.validator(
            "peter",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }
}