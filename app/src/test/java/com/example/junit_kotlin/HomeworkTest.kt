package com.example.junit_kotlin

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeworkTest{

    //testing fib series

    @Test
    fun `input is zero`(){
        val result=Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }
    @Test
    fun `input is one`(){
        val result=Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }
    @Test
    fun `input is three`(){
        val result=Homework.fib(3)
        assertThat(result).isEqualTo(1)
    }
}